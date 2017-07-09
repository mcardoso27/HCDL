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
import javax.persistence.JoinColumn;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author martin
 */
@Entity
@Table(name = "AccionesPreventivas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AccionesPreventivas.findAll", query = "SELECT a FROM AccionesPreventivas a")
    , @NamedQuery(name = "AccionesPreventivas.findById", query = "SELECT a FROM AccionesPreventivas a WHERE a.id = :id")
    , @NamedQuery(name = "AccionesPreventivas.findByRecibioCapacitacion", query = "SELECT a FROM AccionesPreventivas a WHERE a.recibioCapacitacion = :recibioCapacitacion")
    , @NamedQuery(name = "AccionesPreventivas.findByRecibioCapacitacionART", query = "SELECT a FROM AccionesPreventivas a WHERE a.recibioCapacitacionART = :recibioCapacitacionART")
    , @NamedQuery(name = "AccionesPreventivas.findByElementosOtorgados", query = "SELECT a FROM AccionesPreventivas a WHERE a.elementosOtorgados = :elementosOtorgados")
    , @NamedQuery(name = "AccionesPreventivas.findByResposableSegTrabajo", query = "SELECT a FROM AccionesPreventivas a WHERE a.resposableSegTrabajo = :resposableSegTrabajo")})
public class AccionesPreventivas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "recibioCapacitacion")
    private boolean recibioCapacitacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "recibioCapacitacionART")
    private boolean recibioCapacitacionART;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "ElementosOtorgados")
    private String elementosOtorgados;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 21)
    @Column(name = "ResposableSegTrabajo")
    private String resposableSegTrabajo;
    @JoinColumn(name = "id_empleo", referencedColumnName = "id")
    @OneToOne(optional = false)
    private Empleos idEmpleo;

    public AccionesPreventivas() {
    }

    public AccionesPreventivas(Integer id) {
        this.id = id;
    }

    public AccionesPreventivas(Integer id, boolean recibioCapacitacion, boolean recibioCapacitacionART, String elementosOtorgados, String resposableSegTrabajo) {
        this.id = id;
        this.recibioCapacitacion = recibioCapacitacion;
        this.recibioCapacitacionART = recibioCapacitacionART;
        this.elementosOtorgados = elementosOtorgados;
        this.resposableSegTrabajo = resposableSegTrabajo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public boolean getRecibioCapacitacion() {
        return recibioCapacitacion;
    }

    public void setRecibioCapacitacion(boolean recibioCapacitacion) {
        this.recibioCapacitacion = recibioCapacitacion;
    }

    public boolean getRecibioCapacitacionART() {
        return recibioCapacitacionART;
    }

    public void setRecibioCapacitacionART(boolean recibioCapacitacionART) {
        this.recibioCapacitacionART = recibioCapacitacionART;
    }

    public String getElementosOtorgados() {
        return elementosOtorgados;
    }

    public void setElementosOtorgados(String elementosOtorgados) {
        this.elementosOtorgados = elementosOtorgados;
    }

    public String getResposableSegTrabajo() {
        return resposableSegTrabajo;
    }

    public void setResposableSegTrabajo(String resposableSegTrabajo) {
        this.resposableSegTrabajo = resposableSegTrabajo;
    }

    public Empleos getIdEmpleo() {
        return idEmpleo;
    }

    public void setIdEmpleo(Empleos idEmpleo) {
        this.idEmpleo = idEmpleo;
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
        if (!(object instanceof AccionesPreventivas)) {
            return false;
        }
        AccionesPreventivas other = (AccionesPreventivas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.fcm.hcdl.model.AccionesPreventivas[ id=" + id + " ]";
    }
    
}
