/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.fcm.hcdl.model;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
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
@Table(name = "Empleos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleos.findAll", query = "SELECT e FROM Empleos e")
    , @NamedQuery(name = "Empleos.findById", query = "SELECT e FROM Empleos e WHERE e.id = :id")
    , @NamedQuery(name = "Empleos.findByFechaInicio", query = "SELECT e FROM Empleos e WHERE e.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "Empleos.findByFechaFin", query = "SELECT e FROM Empleos e WHERE e.fechaFin = :fechaFin")})
public class Empleos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_inicio")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;
    @Column(name = "fecha_fin")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;
    @Basic(optional = false)
    @NotNull
    @Lob
    @Size(min = 1, max = 65535)
    @Column(name = "cargo")
    private String cargo;
    @JoinColumn(name = "id_empresa", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Empresas idEmpresa;
    @JoinColumn(name = "id_empleado", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Personas idEmpleado;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "idEmpleo")
    private AccionesPreventivas accionesPreventivas;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "idEmpleo")
    private PuestosTrabajos puestosTrabajos;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "idEmpleo")
    private SectoresTrabajos sectoresTrabajos;

    public Empleos() {
    }

    public Empleos(Integer id) {
        this.id = id;
    }

    public Empleos(Integer id, Date fechaInicio, String cargo) {
        this.id = id;
        this.fechaInicio = fechaInicio;
        this.cargo = cargo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Empresas getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(Empresas idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public Personas getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(Personas idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public AccionesPreventivas getAccionesPreventivas() {
        return accionesPreventivas;
    }

    public void setAccionesPreventivas(AccionesPreventivas accionesPreventivas) {
        this.accionesPreventivas = accionesPreventivas;
    }

    public PuestosTrabajos getPuestosTrabajos() {
        return puestosTrabajos;
    }

    public void setPuestosTrabajos(PuestosTrabajos puestosTrabajos) {
        this.puestosTrabajos = puestosTrabajos;
    }

    public SectoresTrabajos getSectoresTrabajos() {
        return sectoresTrabajos;
    }

    public void setSectoresTrabajos(SectoresTrabajos sectoresTrabajos) {
        this.sectoresTrabajos = sectoresTrabajos;
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
        if (!(object instanceof Empleos)) {
            return false;
        }
        Empleos other = (Empleos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.fcm.hcdl.model.Empleos[ id=" + id + " ]";
    }
    
}
