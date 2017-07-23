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
@Table(name = "AccionPreventiva")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "AccionPreventiva.findAll", query = "SELECT a FROM AccionPreventiva a")
    , @NamedQuery(name = "AccionPreventiva.findById", query = "SELECT a FROM AccionPreventiva a WHERE a.id = :id")
    , @NamedQuery(name = "AccionPreventiva.findByIdEmpleo", query = "SELECT a FROM AccionPreventiva a WHERE a.idEmpleo = :idEmpleo")
    , @NamedQuery(name = "AccionPreventiva.findByRecibioCapacitacion", query = "SELECT a FROM AccionPreventiva a WHERE a.recibioCapacitacion = :recibioCapacitacion")
    , @NamedQuery(name = "AccionPreventiva.findByRecibioCapacitacionART", query = "SELECT a FROM AccionPreventiva a WHERE a.recibioCapacitacionART = :recibioCapacitacionART")
    , @NamedQuery(name = "AccionPreventiva.findByElementosOtorgados", query = "SELECT a FROM AccionPreventiva a WHERE a.elementosOtorgados = :elementosOtorgados")
    , @NamedQuery(name = "AccionPreventiva.findByResposableSegTrabajo", query = "SELECT a FROM AccionPreventiva a WHERE a.resposableSegTrabajo = :resposableSegTrabajo")})
public class AccionPreventiva implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_empleo")
    private int idEmpleo;
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

    public AccionPreventiva() {
    }

    public AccionPreventiva(Integer id) {
        this.id = id;
    }

    public AccionPreventiva(Integer id, int idEmpleo, boolean recibioCapacitacion, boolean recibioCapacitacionART, String elementosOtorgados, String resposableSegTrabajo) {
        this.id = id;
        this.idEmpleo = idEmpleo;
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

    public int getIdEmpleo() {
        return idEmpleo;
    }

    public void setIdEmpleo(int idEmpleo) {
        this.idEmpleo = idEmpleo;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof AccionPreventiva)) {
            return false;
        }
        AccionPreventiva other = (AccionPreventiva) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.fcm.hcdl.model.AccionPreventiva[ id=" + id + " ]";
    }
    
}
