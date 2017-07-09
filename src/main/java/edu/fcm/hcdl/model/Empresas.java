/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fcm.hcdl.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author martin
 */
@Entity
@Table(name = "Empresas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empresas.findAll", query = "SELECT e FROM Empresas e")
    , @NamedQuery(name = "Empresas.findById", query = "SELECT e FROM Empresas e WHERE e.id = :id")
    , @NamedQuery(name = "Empresas.findByNombre", query = "SELECT e FROM Empresas e WHERE e.nombre = :nombre")
    , @NamedQuery(name = "Empresas.findByDireccion", query = "SELECT e FROM Empresas e WHERE e.direccion = :direccion")
    , @NamedQuery(name = "Empresas.findByNumeroempleados", query = "SELECT e FROM Empresas e WHERE e.numeroempleados = :numeroempleados")
    , @NamedQuery(name = "Empresas.findByPropiedadcapital", query = "SELECT e FROM Empresas e WHERE e.propiedadcapital = :propiedadcapital")
    , @NamedQuery(name = "Empresas.findByArt", query = "SELECT e FROM Empresas e WHERE e.art = :art")
    , @NamedQuery(name = "Empresas.findByNombreART", query = "SELECT e FROM Empresas e WHERE e.nombreART = :nombreART")
    , @NamedQuery(name = "Empresas.findByAntiguedad", query = "SELECT e FROM Empresas e WHERE e.antiguedad = :antiguedad")
    , @NamedQuery(name = "Empresas.findByMedico", query = "SELECT e FROM Empresas e WHERE e.medico = :medico")
    , @NamedQuery(name = "Empresas.findByEspecialistaHigiene", query = "SELECT e FROM Empresas e WHERE e.especialistaHigiene = :especialistaHigiene")})
public class Empresas implements Serializable {

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
    @JoinColumn(name = "id_Tipo_empresa", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private TiposEmpresas idTipoempresa;
    @JoinColumn(name = "id_Localidad", referencedColumnName = "id_localidad")
    @ManyToOne(optional = false)
    private Localidades idLocalidad;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEmpresa")
    private List<Empleos> empleosList;

    public Empresas() {
    }

    public Empresas(Integer id) {
        this.id = id;
    }

    public Empresas(Integer id, String nombre, String direccion, int numeroempleados, String propiedadcapital, boolean art, int antiguedad, boolean medico, boolean especialistaHigiene) {
        this.id = id;
        this.nombre = nombre;
        this.direccion = direccion;
        this.numeroempleados = numeroempleados;
        this.propiedadcapital = propiedadcapital;
        this.art = art;
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

    public TiposEmpresas getIdTipoempresa() {
        return idTipoempresa;
    }

    public void setIdTipoempresa(TiposEmpresas idTipoempresa) {
        this.idTipoempresa = idTipoempresa;
    }

    public Localidades getIdLocalidad() {
        return idLocalidad;
    }

    public void setIdLocalidad(Localidades idLocalidad) {
        this.idLocalidad = idLocalidad;
    }

    @XmlTransient
    public List<Empleos> getEmpleosList() {
        return empleosList;
    }

    public void setEmpleosList(List<Empleos> empleosList) {
        this.empleosList = empleosList;
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
        if (!(object instanceof Empresas)) {
            return false;
        }
        Empresas other = (Empresas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.fcm.hcdl.model.Empresas[ id=" + id + " ]";
    }
    
}
