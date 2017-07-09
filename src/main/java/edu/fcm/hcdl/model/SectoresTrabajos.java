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
@Table(name = "SectoresTrabajos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "SectoresTrabajos.findAll", query = "SELECT s FROM SectoresTrabajos s")
    , @NamedQuery(name = "SectoresTrabajos.findById", query = "SELECT s FROM SectoresTrabajos s WHERE s.id = :id")
    , @NamedQuery(name = "SectoresTrabajos.findByNombre", query = "SELECT s FROM SectoresTrabajos s WHERE s.nombre = :nombre")
    , @NamedQuery(name = "SectoresTrabajos.findByEstadoEdificio", query = "SELECT s FROM SectoresTrabajos s WHERE s.estadoEdificio = :estadoEdificio")
    , @NamedQuery(name = "SectoresTrabajos.findByEstadoPisos", query = "SELECT s FROM SectoresTrabajos s WHERE s.estadoPisos = :estadoPisos")
    , @NamedQuery(name = "SectoresTrabajos.findByEstadoRampas", query = "SELECT s FROM SectoresTrabajos s WHERE s.estadoRampas = :estadoRampas")
    , @NamedQuery(name = "SectoresTrabajos.findByEstadoAscensores", query = "SELECT s FROM SectoresTrabajos s WHERE s.estadoAscensores = :estadoAscensores")
    , @NamedQuery(name = "SectoresTrabajos.findByEstadoSalidaEmergencia", query = "SELECT s FROM SectoresTrabajos s WHERE s.estadoSalidaEmergencia = :estadoSalidaEmergencia")
    , @NamedQuery(name = "SectoresTrabajos.findByEstadoBanios", query = "SELECT s FROM SectoresTrabajos s WHERE s.estadoBanios = :estadoBanios")
    , @NamedQuery(name = "SectoresTrabajos.findByEstadoInstElectricas", query = "SELECT s FROM SectoresTrabajos s WHERE s.estadoInstElectricas = :estadoInstElectricas")
    , @NamedQuery(name = "SectoresTrabajos.findByEstadoInstAgua", query = "SELECT s FROM SectoresTrabajos s WHERE s.estadoInstAgua = :estadoInstAgua")
    , @NamedQuery(name = "SectoresTrabajos.findByEstadoInstGas", query = "SELECT s FROM SectoresTrabajos s WHERE s.estadoInstGas = :estadoInstGas")
    , @NamedQuery(name = "SectoresTrabajos.findByOrdenSector", query = "SELECT s FROM SectoresTrabajos s WHERE s.ordenSector = :ordenSector")
    , @NamedQuery(name = "SectoresTrabajos.findByLimpiezaSector", query = "SELECT s FROM SectoresTrabajos s WHERE s.limpiezaSector = :limpiezaSector")
    , @NamedQuery(name = "SectoresTrabajos.findBySe\u00f1alizacionSector", query = "SELECT s FROM SectoresTrabajos s WHERE s.se\u00f1alizacionSector = :se\u00f1alizacionSector")
    , @NamedQuery(name = "SectoresTrabajos.findBySistContraIncendio", query = "SELECT s FROM SectoresTrabajos s WHERE s.sistContraIncendio = :sistContraIncendio")
    , @NamedQuery(name = "SectoresTrabajos.findByMueblesSector", query = "SELECT s FROM SectoresTrabajos s WHERE s.mueblesSector = :mueblesSector")
    , @NamedQuery(name = "SectoresTrabajos.findByMaquinasSector", query = "SELECT s FROM SectoresTrabajos s WHERE s.maquinasSector = :maquinasSector")
    , @NamedQuery(name = "SectoresTrabajos.findByHerramientasSector", query = "SELECT s FROM SectoresTrabajos s WHERE s.herramientasSector = :herramientasSector")
    , @NamedQuery(name = "SectoresTrabajos.findByOrdenamientoSector", query = "SELECT s FROM SectoresTrabajos s WHERE s.ordenamientoSector = :ordenamientoSector")
    , @NamedQuery(name = "SectoresTrabajos.findByAmbTemperatura", query = "SELECT s FROM SectoresTrabajos s WHERE s.ambTemperatura = :ambTemperatura")
    , @NamedQuery(name = "SectoresTrabajos.findByAmbHumedad", query = "SELECT s FROM SectoresTrabajos s WHERE s.ambHumedad = :ambHumedad")
    , @NamedQuery(name = "SectoresTrabajos.findByAmbRuido", query = "SELECT s FROM SectoresTrabajos s WHERE s.ambRuido = :ambRuido")
    , @NamedQuery(name = "SectoresTrabajos.findByAmbVibraciones", query = "SELECT s FROM SectoresTrabajos s WHERE s.ambVibraciones = :ambVibraciones")
    , @NamedQuery(name = "SectoresTrabajos.findByAmbPolvos", query = "SELECT s FROM SectoresTrabajos s WHERE s.ambPolvos = :ambPolvos")
    , @NamedQuery(name = "SectoresTrabajos.findByAmbGases", query = "SELECT s FROM SectoresTrabajos s WHERE s.ambGases = :ambGases")
    , @NamedQuery(name = "SectoresTrabajos.findByAmbLiquidos", query = "SELECT s FROM SectoresTrabajos s WHERE s.ambLiquidos = :ambLiquidos")
    , @NamedQuery(name = "SectoresTrabajos.findByAmbAerosoles", query = "SELECT s FROM SectoresTrabajos s WHERE s.ambAerosoles = :ambAerosoles")
    , @NamedQuery(name = "SectoresTrabajos.findByAmbMaterialBiologico", query = "SELECT s FROM SectoresTrabajos s WHERE s.ambMaterialBiologico = :ambMaterialBiologico")
    , @NamedQuery(name = "SectoresTrabajos.findByConsideraciones", query = "SELECT s FROM SectoresTrabajos s WHERE s.consideraciones = :consideraciones")})
public class SectoresTrabajos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Nombre")
    private String nombre;
    @Size(max = 10)
    @Column(name = "estadoEdificio")
    private String estadoEdificio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "estadoPisos")
    private String estadoPisos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "estadoRampas")
    private String estadoRampas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "estadoAscensores")
    private String estadoAscensores;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "estadoSalidaEmergencia")
    private String estadoSalidaEmergencia;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "estadoBanios")
    private String estadoBanios;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "estadoInstElectricas")
    private String estadoInstElectricas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "estadoInstAgua")
    private String estadoInstAgua;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "estadoInstGas")
    private String estadoInstGas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ordenSector")
    private String ordenSector;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "limpiezaSector")
    private String limpiezaSector;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "se\u00f1alizacionSector")
    private String señalizacionSector;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "sistContraIncendio")
    private String sistContraIncendio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "mueblesSector")
    private String mueblesSector;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "maquinasSector")
    private String maquinasSector;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "herramientasSector")
    private String herramientasSector;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ordenamientoSector")
    private String ordenamientoSector;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "ambTemperatura")
    private String ambTemperatura;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "ambHumedad")
    private String ambHumedad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "ambRuido")
    private String ambRuido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "ambVibraciones")
    private String ambVibraciones;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "ambPolvos")
    private String ambPolvos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "ambGases")
    private String ambGases;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "ambLiquidos")
    private String ambLiquidos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "ambAerosoles")
    private String ambAerosoles;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 9)
    @Column(name = "ambMaterialBiologico")
    private String ambMaterialBiologico;
    @Size(max = 256)
    @Column(name = "consideraciones")
    private String consideraciones;
    @JoinColumn(name = "idEmpleo", referencedColumnName = "id")
    @OneToOne(optional = false)
    private Empleos idEmpleo;

    public SectoresTrabajos() {
    }

    public SectoresTrabajos(Integer id) {
        this.id = id;
    }

    public SectoresTrabajos(Integer id, String nombre, String estadoPisos, String estadoRampas, String estadoAscensores, String estadoSalidaEmergencia, String estadoBanios, String estadoInstElectricas, String estadoInstAgua, String estadoInstGas, String ordenSector, String limpiezaSector, String señalizacionSector, String sistContraIncendio, String mueblesSector, String maquinasSector, String herramientasSector, String ordenamientoSector, String ambTemperatura, String ambHumedad, String ambRuido, String ambVibraciones, String ambPolvos, String ambGases, String ambLiquidos, String ambAerosoles, String ambMaterialBiologico) {
        this.id = id;
        this.nombre = nombre;
        this.estadoPisos = estadoPisos;
        this.estadoRampas = estadoRampas;
        this.estadoAscensores = estadoAscensores;
        this.estadoSalidaEmergencia = estadoSalidaEmergencia;
        this.estadoBanios = estadoBanios;
        this.estadoInstElectricas = estadoInstElectricas;
        this.estadoInstAgua = estadoInstAgua;
        this.estadoInstGas = estadoInstGas;
        this.ordenSector = ordenSector;
        this.limpiezaSector = limpiezaSector;
        this.señalizacionSector = señalizacionSector;
        this.sistContraIncendio = sistContraIncendio;
        this.mueblesSector = mueblesSector;
        this.maquinasSector = maquinasSector;
        this.herramientasSector = herramientasSector;
        this.ordenamientoSector = ordenamientoSector;
        this.ambTemperatura = ambTemperatura;
        this.ambHumedad = ambHumedad;
        this.ambRuido = ambRuido;
        this.ambVibraciones = ambVibraciones;
        this.ambPolvos = ambPolvos;
        this.ambGases = ambGases;
        this.ambLiquidos = ambLiquidos;
        this.ambAerosoles = ambAerosoles;
        this.ambMaterialBiologico = ambMaterialBiologico;
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

    public String getEstadoEdificio() {
        return estadoEdificio;
    }

    public void setEstadoEdificio(String estadoEdificio) {
        this.estadoEdificio = estadoEdificio;
    }

    public String getEstadoPisos() {
        return estadoPisos;
    }

    public void setEstadoPisos(String estadoPisos) {
        this.estadoPisos = estadoPisos;
    }

    public String getEstadoRampas() {
        return estadoRampas;
    }

    public void setEstadoRampas(String estadoRampas) {
        this.estadoRampas = estadoRampas;
    }

    public String getEstadoAscensores() {
        return estadoAscensores;
    }

    public void setEstadoAscensores(String estadoAscensores) {
        this.estadoAscensores = estadoAscensores;
    }

    public String getEstadoSalidaEmergencia() {
        return estadoSalidaEmergencia;
    }

    public void setEstadoSalidaEmergencia(String estadoSalidaEmergencia) {
        this.estadoSalidaEmergencia = estadoSalidaEmergencia;
    }

    public String getEstadoBanios() {
        return estadoBanios;
    }

    public void setEstadoBanios(String estadoBanios) {
        this.estadoBanios = estadoBanios;
    }

    public String getEstadoInstElectricas() {
        return estadoInstElectricas;
    }

    public void setEstadoInstElectricas(String estadoInstElectricas) {
        this.estadoInstElectricas = estadoInstElectricas;
    }

    public String getEstadoInstAgua() {
        return estadoInstAgua;
    }

    public void setEstadoInstAgua(String estadoInstAgua) {
        this.estadoInstAgua = estadoInstAgua;
    }

    public String getEstadoInstGas() {
        return estadoInstGas;
    }

    public void setEstadoInstGas(String estadoInstGas) {
        this.estadoInstGas = estadoInstGas;
    }

    public String getOrdenSector() {
        return ordenSector;
    }

    public void setOrdenSector(String ordenSector) {
        this.ordenSector = ordenSector;
    }

    public String getLimpiezaSector() {
        return limpiezaSector;
    }

    public void setLimpiezaSector(String limpiezaSector) {
        this.limpiezaSector = limpiezaSector;
    }

    public String getSeñalizacionSector() {
        return señalizacionSector;
    }

    public void setSeñalizacionSector(String señalizacionSector) {
        this.señalizacionSector = señalizacionSector;
    }

    public String getSistContraIncendio() {
        return sistContraIncendio;
    }

    public void setSistContraIncendio(String sistContraIncendio) {
        this.sistContraIncendio = sistContraIncendio;
    }

    public String getMueblesSector() {
        return mueblesSector;
    }

    public void setMueblesSector(String mueblesSector) {
        this.mueblesSector = mueblesSector;
    }

    public String getMaquinasSector() {
        return maquinasSector;
    }

    public void setMaquinasSector(String maquinasSector) {
        this.maquinasSector = maquinasSector;
    }

    public String getHerramientasSector() {
        return herramientasSector;
    }

    public void setHerramientasSector(String herramientasSector) {
        this.herramientasSector = herramientasSector;
    }

    public String getOrdenamientoSector() {
        return ordenamientoSector;
    }

    public void setOrdenamientoSector(String ordenamientoSector) {
        this.ordenamientoSector = ordenamientoSector;
    }

    public String getAmbTemperatura() {
        return ambTemperatura;
    }

    public void setAmbTemperatura(String ambTemperatura) {
        this.ambTemperatura = ambTemperatura;
    }

    public String getAmbHumedad() {
        return ambHumedad;
    }

    public void setAmbHumedad(String ambHumedad) {
        this.ambHumedad = ambHumedad;
    }

    public String getAmbRuido() {
        return ambRuido;
    }

    public void setAmbRuido(String ambRuido) {
        this.ambRuido = ambRuido;
    }

    public String getAmbVibraciones() {
        return ambVibraciones;
    }

    public void setAmbVibraciones(String ambVibraciones) {
        this.ambVibraciones = ambVibraciones;
    }

    public String getAmbPolvos() {
        return ambPolvos;
    }

    public void setAmbPolvos(String ambPolvos) {
        this.ambPolvos = ambPolvos;
    }

    public String getAmbGases() {
        return ambGases;
    }

    public void setAmbGases(String ambGases) {
        this.ambGases = ambGases;
    }

    public String getAmbLiquidos() {
        return ambLiquidos;
    }

    public void setAmbLiquidos(String ambLiquidos) {
        this.ambLiquidos = ambLiquidos;
    }

    public String getAmbAerosoles() {
        return ambAerosoles;
    }

    public void setAmbAerosoles(String ambAerosoles) {
        this.ambAerosoles = ambAerosoles;
    }

    public String getAmbMaterialBiologico() {
        return ambMaterialBiologico;
    }

    public void setAmbMaterialBiologico(String ambMaterialBiologico) {
        this.ambMaterialBiologico = ambMaterialBiologico;
    }

    public String getConsideraciones() {
        return consideraciones;
    }

    public void setConsideraciones(String consideraciones) {
        this.consideraciones = consideraciones;
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
        if (!(object instanceof SectoresTrabajos)) {
            return false;
        }
        SectoresTrabajos other = (SectoresTrabajos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.fcm.hcdl.model.SectoresTrabajos[ id=" + id + " ]";
    }
    
}
