/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fcm.hcdl.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author martin
 */
@Entity
@Table(name = "Incidentes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Incidentes.findAll", query = "SELECT i FROM Incidentes i")
    , @NamedQuery(name = "Incidentes.findByIdIncidentes", query = "SELECT i FROM Incidentes i WHERE i.idIncidentes = :idIncidentes")
    , @NamedQuery(name = "Incidentes.findByDescripcion", query = "SELECT i FROM Incidentes i WHERE i.descripcion = :descripcion")
    , @NamedQuery(name = "Incidentes.findByFechaInicio", query = "SELECT i FROM Incidentes i WHERE i.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "Incidentes.findByFechaFin", query = "SELECT i FROM Incidentes i WHERE i.fechaFin = :fechaFin")})
public class Incidentes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idIncidentes")
    private Integer idIncidentes;
    @Size(max = 400)
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Column(name = "fecha_fin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @JoinColumn(name = "fk_estadosSaludEnfermedad", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private EstadosSaludEnfermedad fkestadosSaludEnfermedad;

    public Incidentes() {
    }

    public Incidentes(Integer idIncidentes) {
        this.idIncidentes = idIncidentes;
    }

    public Integer getIdIncidentes() {
        return idIncidentes;
    }

    public void setIdIncidentes(Integer idIncidentes) {
        this.idIncidentes = idIncidentes;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public EstadosSaludEnfermedad getFkestadosSaludEnfermedad() {
        return fkestadosSaludEnfermedad;
    }

    public void setFkestadosSaludEnfermedad(EstadosSaludEnfermedad fkestadosSaludEnfermedad) {
        this.fkestadosSaludEnfermedad = fkestadosSaludEnfermedad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idIncidentes != null ? idIncidentes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Incidentes)) {
            return false;
        }
        Incidentes other = (Incidentes) object;
        if ((this.idIncidentes == null && other.idIncidentes != null) || (this.idIncidentes != null && !this.idIncidentes.equals(other.idIncidentes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.fcm.hcdl.model.Incidentes[ idIncidentes=" + idIncidentes + " ]";
    }
    
}
