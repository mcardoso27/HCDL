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
import javax.persistence.Lob;
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
@Table(name = "Empleo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empleo.findAll", query = "SELECT e FROM Empleo e")
    , @NamedQuery(name = "Empleo.findByIdEmpresa", query = "SELECT e FROM Empleo e WHERE e.idEmpresa = :idEmpresa")
    , @NamedQuery(name = "Empleo.findByIdEmpleado", query = "SELECT e FROM Empleo e WHERE e.idEmpleado = :idEmpleado")
    , @NamedQuery(name = "Empleo.findById", query = "SELECT e FROM Empleo e WHERE e.id = :id")
    , @NamedQuery(name = "Empleo.findByFechaInicio", query = "SELECT e FROM Empleo e WHERE e.fechaInicio = :fechaInicio")
    , @NamedQuery(name = "Empleo.findByFechaFin", query = "SELECT e FROM Empleo e WHERE e.fechaFin = :fechaFin")})
public class Empleo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_empresa")
    private int idEmpresa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_empleado")
    private int idEmpleado;
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

    public Empleo() {
    }

    public Empleo(Integer id) {
        this.id = id;
    }

    public Empleo(Integer id, int idEmpresa, int idEmpleado, Date fechaInicio, String cargo) {
        this.id = id;
        this.idEmpresa = idEmpresa;
        this.idEmpleado = idEmpleado;
        this.fechaInicio = fechaInicio;
        this.cargo = cargo;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empleo)) {
            return false;
        }
        Empleo other = (Empleo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.fcm.hcdl.model.Empleo[ id=" + id + " ]";
    }
    
}
