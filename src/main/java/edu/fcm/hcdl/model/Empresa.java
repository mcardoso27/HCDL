/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fcm.hcdl.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author martin
 */
@Entity
@Table(name = "Empresa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empresa.findAll", query = "SELECT e FROM Empresa e")
    , @NamedQuery(name = "Empresa.findById", query = "SELECT e FROM Empresa e WHERE e.id = :id")
    , @NamedQuery(name = "Empresa.findByNombre", query = "SELECT e FROM Empresa e WHERE e.nombre = :nombre")
    , @NamedQuery(name = "Empresa.findByDireccion", query = "SELECT e FROM Empresa e WHERE e.direccion = :direccion")
    , @NamedQuery(name = "Empresa.findByNumeroempleados", query = "SELECT e FROM Empresa e WHERE e.numeroempleados = :numeroempleados")
    , @NamedQuery(name = "Empresa.findByPropiedadcapital", query = "SELECT e FROM Empresa e WHERE e.propiedadcapital = :propiedadcapital")
    , @NamedQuery(name = "Empresa.findByArt", query = "SELECT e FROM Empresa e WHERE e.art = :art")
    , @NamedQuery(name = "Empresa.findByNombreART", query = "SELECT e FROM Empresa e WHERE e.nombreART = :nombreART")
    , @NamedQuery(name = "Empresa.findByIdTipoempresa", query = "SELECT e FROM Empresa e WHERE e.idTipoempresa = :idTipoempresa")
    , @NamedQuery(name = "Empresa.findByIdLocalidad", query = "SELECT e FROM Empresa e WHERE e.idLocalidad = :idLocalidad")
    , @NamedQuery(name = "Empresa.findByAntiguedad", query = "SELECT e FROM Empresa e WHERE e.antiguedad = :antiguedad")
    , @NamedQuery(name = "Empresa.findByMedico", query = "SELECT e FROM Empresa e WHERE e.medico = :medico")
    , @NamedQuery(name = "Empresa.findByEspecialistaHigiene", query = "SELECT e FROM Empresa e WHERE e.especialistaHigiene = :especialistaHigiene")})
public class Empresa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "Nombre")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "Direccion")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Numero_empleados")
    private int numeroempleados;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "Propiedad_capital")
    private String propiedadcapital;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ART")
    private boolean art;
    @Size(max = 256)
    @Column(name = "Nombre_ART")
    private String nombreART;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_Tipo_empresa")
    private int idTipoempresa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_Localidad")
    private int idLocalidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Antiguedad")
    private int antiguedad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Medico")
    private boolean medico;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EspecialistaHigiene")
    private boolean especialistaHigiene;

    public Empresa() {
    }

    public Empresa(Integer id) {
        this.id = id;
    }

    public Empresa(Integer id, String nombre, String direccion, int numeroempleados, String propiedadcapital, boolean art, int idTipoempresa, int idLocalidad, int antiguedad, boolean medico, boolean especialistaHigiene) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroempleados = numeroempleados;
        this.propiedadcapital = propiedadcapital;
        this.art = art;
        this.idTipoempresa = idTipoempresa;
        this.idLocalidad = idLocalidad;
        this.antiguedad = antiguedad;
        this.medico = medico;
        this.especialistaHigiene = especialistaHigiene;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroempleados() {
        return numeroempleados;
    }

    public void setNumeroempleados(int numeroempleados) {
        this.numeroempleados = numeroempleados;
    }

    public String getPropiedadcapital() {
        return propiedadcapital;
    }

    public void setPropiedadcapital(String propiedadcapital) {
        this.propiedadcapital = propiedadcapital;
    }

    public boolean getArt() {
        return art;
    }

    public void setArt(boolean art) {
        this.art = art;
    }

    public String getNombreART() {
        return nombreART;
    }

    public void setNombreART(String nombreART) {
        this.nombreART = nombreART;
    }

    public int getIdTipoempresa() {
        return idTipoempresa;
    }

    public void setIdTipoempresa(int idTipoempresa) {
        this.idTipoempresa = idTipoempresa;
    }

    public int getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(int idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public boolean getMedico() {
        return medico;
    }

    public void setMedico(boolean medico) {
        this.medico = medico;
    }

    public boolean getEspecialistaHigiene() {
        return especialistaHigiene;
    }

    public void setEspecialistaHigiene(boolean especialistaHigiene) {
        this.especialistaHigiene = especialistaHigiene;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresa)) {
            return false;
        }
        Empresa other = (Empresa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.fcm.hcdl.model.Empresa[ id=" + id + " ]";
    }
    
}
