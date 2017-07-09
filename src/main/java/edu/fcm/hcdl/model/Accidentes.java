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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author martin
 */
@Entity
@Table(name = "Accidentes")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Accidentes.findAll", query = "SELECT a FROM Accidentes a")
    , @NamedQuery(name = "Accidentes.findByIdAccidentes", query = "SELECT a FROM Accidentes a WHERE a.idAccidentes = :idAccidentes")
    , @NamedQuery(name = "Accidentes.findByDescripcion", query = "SELECT a FROM Accidentes a WHERE a.descripcion = :descripcion")
    , @NamedQuery(name = "Accidentes.findByFechaInicio", query = "SELECT a FROM Accidentes a WHERE a.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "Accidentes.findByFechaFin", query = "SELECT a FROM Accidentes a WHERE a.fechaFin = :fechaFin")})
public class Accidentes implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idAccidentes")
    private Integer idAccidentes;
    @Size(max = 400)
    @Column(name = "descripcion")
    private String descripcion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_fin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @JoinColumn(name = "id_estadoSaludEnfermedad", referencedColumnName = "id")
    @ManyToOne
    private EstadosSaludEnfermedad idestadoSaludEnfermedad;

    public Accidentes() {
    }

    public Accidentes(Integer idAccidentes) {
        this.idAccidentes = idAccidentes;
    }

    public Accidentes(Integer idAccidentes, Date fechaInicio, Date fechaFin) {
        this.idAccidentes = idAccidentes;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Integer getIdAccidentes() {
        return idAccidentes;
    }

    public void setIdAccidentes(Integer idAccidentes) {
        this.idAccidentes = idAccidentes;
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

    public EstadosSaludEnfermedad getIdestadoSaludEnfermedad() {
        return idestadoSaludEnfermedad;
    }

    public void setIdestadoSaludEnfermedad(EstadosSaludEnfermedad idestadoSaludEnfermedad) {
        this.idestadoSaludEnfermedad = idestadoSaludEnfermedad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAccidentes != null ? idAccidentes.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Accidentes)) {
            return false;
        }
        Accidentes other = (Accidentes) object;
        if ((this.idAccidentes == null && other.idAccidentes != null) || (this.idAccidentes != null && !this.idAccidentes.equals(other.idAccidentes))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.fcm.hcdl.model.Accidentes[ idAccidentes=" + idAccidentes + " ]";
    }
    
}
