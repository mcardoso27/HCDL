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
@Table(name = "Enfermedad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Enfermedad.findAll", query = "SELECT e FROM Enfermedad e")
    , @NamedQuery(name = "Enfermedad.findByIdEnfermedades", query = "SELECT e FROM Enfermedad e WHERE e.idEnfermedades = :idEnfermedades")
    , @NamedQuery(name = "Enfermedad.findByCodigoCIE10", query = "SELECT e FROM Enfermedad e WHERE e.codigoCIE10 = :codigoCIE10")
    , @NamedQuery(name = "Enfermedad.findByFamiliarEnfermo", query = "SELECT e FROM Enfermedad e WHERE e.familiarEnfermo = :familiarEnfermo")
    , @NamedQuery(name = "Enfermedad.findByFechaInicio", query = "SELECT e FROM Enfermedad e WHERE e.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "Enfermedad.findByFechaFin", query = "SELECT e FROM Enfermedad e WHERE e.fechaFin = :fechaFin")
    , @NamedQuery(name = "Enfermedad.findByIdestadoSaludEnfermedad", query = "SELECT e FROM Enfermedad e WHERE e.idestadoSaludEnfermedad = :idestadoSaludEnfermedad")})
public class Enfermedad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEnfermedades")
    private Integer idEnfermedades;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "codigoCIE10")
    private String codigoCIE10;
    @Size(max = 8)
    @Column(name = "familiarEnfermo")
    private String familiarEnfermo;
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Column(name = "fecha_fin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_estadoSaludEnfermedad")
    private int idestadoSaludEnfermedad;

    public Enfermedad() {
    }

    public Enfermedad(Integer idEnfermedades) {
        this.idEnfermedades = idEnfermedades;
    }

    public Enfermedad(Integer idEnfermedades, String codigoCIE10, int idestadoSaludEnfermedad) {
        this.idEnfermedades = idEnfermedades;
        this.codigoCIE10 = codigoCIE10;
        this.idestadoSaludEnfermedad = idestadoSaludEnfermedad;
    }

    public Integer getIdEnfermedades() {
        return idEnfermedades;
    }

    public void setIdEnfermedades(Integer idEnfermedades) {
        this.idEnfermedades = idEnfermedades;
    }

    public String getCodigoCIE10() {
        return codigoCIE10;
    }

    public void setCodigoCIE10(String codigoCIE10) {
        this.codigoCIE10 = codigoCIE10;
    }

    public String getFamiliarEnfermo() {
        return familiarEnfermo;
    }

    public void setFamiliarEnfermo(String familiarEnfermo) {
        this.familiarEnfermo = familiarEnfermo;
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

    public int getIdestadoSaludEnfermedad() {
        return idestadoSaludEnfermedad;
    }

    public void setIdestadoSaludEnfermedad(int idestadoSaludEnfermedad) {
        this.idestadoSaludEnfermedad = idestadoSaludEnfermedad;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEnfermedades != null ? idEnfermedades.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Enfermedad)) {
            return false;
        }
        Enfermedad other = (Enfermedad) object;
        if ((this.idEnfermedades == null && other.idEnfermedades != null) || (this.idEnfermedades != null && !this.idEnfermedades.equals(other.idEnfermedades))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.fcm.hcdl.model.Enfermedad[ idEnfermedades=" + idEnfermedades + " ]";
    }
    
}
