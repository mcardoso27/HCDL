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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author martin
 */
@Entity
@Table(name = "Incidente")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Incidente.findAll", query = "SELECT i FROM Incidente i")
    , @NamedQuery(name = "Incidente.findByIdIncidentes", query = "SELECT i FROM Incidente i WHERE i.idIncidentes = :idIncidentes")
    , @NamedQuery(name = "Incidente.findByDescripcion", query = "SELECT i FROM Incidente i WHERE i.descripcion = :descripcion")
    , @NamedQuery(name = "Incidente.findByFechaInicio", query = "SELECT i FROM Incidente i WHERE i.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "Incidente.findByFechaFin", query = "SELECT i FROM Incidente i WHERE i.fechaFin = :fechaFin")
    , @NamedQuery(name = "Incidente.findByFkestadosSaludEnfermedad", query = "SELECT i FROM Incidente i WHERE i.fkestadosSaludEnfermedad = :fkestadosSaludEnfermedad")})
public class Incidente implements Serializable {

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
    @Basic(optional = false)
    @NotNull
    @Column(name = "fk_estadosSaludEnfermedad")
    private int fkestadosSaludEnfermedad;

    public Incidente() {
    }

    public Incidente(Integer idIncidentes) {
        this.idIncidentes = idIncidentes;
    }

    public Incidente(Integer idIncidentes, int fkestadosSaludEnfermedad) {
        this.idIncidentes = idIncidentes;
        this.fkestadosSaludEnfermedad = fkestadosSaludEnfermedad;
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

    public int getFkestadosSaludEnfermedad() {
        return fkestadosSaludEnfermedad;
    }

    public void setFkestadosSaludEnfermedad(int fkestadosSaludEnfermedad) {
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
        if (!(object instanceof Incidente)) {
            return false;
        }
        Incidente other = (Incidente) object;
        if ((this.idIncidentes == null && other.idIncidentes != null) || (this.idIncidentes != null && !this.idIncidentes.equals(other.idIncidentes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.fcm.hcdl.model.Incidente[ idIncidentes=" + idIncidentes + " ]";
    }
    
}
