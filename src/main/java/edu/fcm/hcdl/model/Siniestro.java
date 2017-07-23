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
@Table(name = "Siniestro")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Siniestro.findAll", query = "SELECT s FROM Siniestro s")
    , @NamedQuery(name = "Siniestro.findByIdSiniestros", query = "SELECT s FROM Siniestro s WHERE s.idSiniestros = :idSiniestros")
    , @NamedQuery(name = "Siniestro.findByDescripcion", query = "SELECT s FROM Siniestro s WHERE s.descripcion = :descripcion")
    , @NamedQuery(name = "Siniestro.findByFechaInicio", query = "SELECT s FROM Siniestro s WHERE s.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "Siniestro.findByFechaFin", query = "SELECT s FROM Siniestro s WHERE s.fechaFin = :fechaFin")
    , @NamedQuery(name = "Siniestro.findByIdestadoSaludEnfermedad", query = "SELECT s FROM Siniestro s WHERE s.idestadoSaludEnfermedad = :idestadoSaludEnfermedad")})
public class Siniestro implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idSiniestros")
    private Integer idSiniestros;
    @Size(max = 300)
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
    @Column(name = "id_estadoSaludEnfermedad")
    private Integer idestadoSaludEnfermedad;

    public Siniestro() {
    }

    public Siniestro(Integer idSiniestros) {
        this.idSiniestros = idSiniestros;
    }

    public Siniestro(Integer idSiniestros, Date fechaInicio, Date fechaFin) {
        this.idSiniestros = idSiniestros;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public Integer getIdSiniestros() {
        return idSiniestros;
    }

    public void setIdSiniestros(Integer idSiniestros) {
        this.idSiniestros = idSiniestros;
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

    public Integer getIdestadoSaludEnfermedad() {
        return idestadoSaludEnfermedad;
    }

    public void setIdestadoSaludEnfermedad(Integer idestadoSaludEnfermedad) {
        this.idestadoSaludEnfermedad = idestadoSaludEnfermedad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idSiniestros != null ? idSiniestros.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Siniestro)) {
            return false;
        }
        Siniestro other = (Siniestro) object;
        if ((this.idSiniestros == null && other.idSiniestros != null) || (this.idSiniestros != null && !this.idSiniestros.equals(other.idSiniestros))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.fcm.hcdl.model.Siniestro[ idSiniestros=" + idSiniestros + " ]";
    }
    
}
