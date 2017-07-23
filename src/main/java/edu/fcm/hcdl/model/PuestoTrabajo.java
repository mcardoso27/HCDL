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
@Table(name = "PuestoTrabajo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PuestoTrabajo.findAll", query = "SELECT p FROM PuestoTrabajo p")
    , @NamedQuery(name = "PuestoTrabajo.findById", query = "SELECT p FROM PuestoTrabajo p WHERE p.id = :id")
    , @NamedQuery(name = "PuestoTrabajo.findByIdEmpleo", query = "SELECT p FROM PuestoTrabajo p WHERE p.idEmpleo = :idEmpleo")
    , @NamedQuery(name = "PuestoTrabajo.findByRfCargaTermica", query = "SELECT p FROM PuestoTrabajo p WHERE p.rfCargaTermica = :rfCargaTermica")
    , @NamedQuery(name = "PuestoTrabajo.findByRfHumedad", query = "SELECT p FROM PuestoTrabajo p WHERE p.rfHumedad = :rfHumedad")
    , @NamedQuery(name = "PuestoTrabajo.findByRfRuidos", query = "SELECT p FROM PuestoTrabajo p WHERE p.rfRuidos = :rfRuidos")
    , @NamedQuery(name = "PuestoTrabajo.findByRfVibraciones", query = "SELECT p FROM PuestoTrabajo p WHERE p.rfVibraciones = :rfVibraciones")
    , @NamedQuery(name = "PuestoTrabajo.findByRfGases", query = "SELECT p FROM PuestoTrabajo p WHERE p.rfGases = :rfGases")
    , @NamedQuery(name = "PuestoTrabajo.findByRfPolvos", query = "SELECT p FROM PuestoTrabajo p WHERE p.rfPolvos = :rfPolvos")
    , @NamedQuery(name = "PuestoTrabajo.findByRfLiquidos", query = "SELECT p FROM PuestoTrabajo p WHERE p.rfLiquidos = :rfLiquidos")
    , @NamedQuery(name = "PuestoTrabajo.findByRfVentilacion", query = "SELECT p FROM PuestoTrabajo p WHERE p.rfVentilacion = :rfVentilacion")
    , @NamedQuery(name = "PuestoTrabajo.findByRfIluminacion", query = "SELECT p FROM PuestoTrabajo p WHERE p.rfIluminacion = :rfIluminacion")
    , @NamedQuery(name = "PuestoTrabajo.findByRiesgosQuimicos", query = "SELECT p FROM PuestoTrabajo p WHERE p.riesgosQuimicos = :riesgosQuimicos")
    , @NamedQuery(name = "PuestoTrabajo.findByRiesgosBiologicos", query = "SELECT p FROM PuestoTrabajo p WHERE p.riesgosBiologicos = :riesgosBiologicos")
    , @NamedQuery(name = "PuestoTrabajo.findByPymEsfuerzoFisico", query = "SELECT p FROM PuestoTrabajo p WHERE p.pymEsfuerzoFisico = :pymEsfuerzoFisico")
    , @NamedQuery(name = "PuestoTrabajo.findByPymEsfuerzoVoz", query = "SELECT p FROM PuestoTrabajo p WHERE p.pymEsfuerzoVoz = :pymEsfuerzoVoz")
    , @NamedQuery(name = "PuestoTrabajo.findByPymEstardePie", query = "SELECT p FROM PuestoTrabajo p WHERE p.pymEstardePie = :pymEstardePie")
    , @NamedQuery(name = "PuestoTrabajo.findByPymSentadoIncomodo", query = "SELECT p FROM PuestoTrabajo p WHERE p.pymSentadoIncomodo = :pymSentadoIncomodo")
    , @NamedQuery(name = "PuestoTrabajo.findByPymPosicionIncomoda", query = "SELECT p FROM PuestoTrabajo p WHERE p.pymPosicionIncomoda = :pymPosicionIncomoda")
    , @NamedQuery(name = "PuestoTrabajo.findByPymMovRepetitivosCuerpo", query = "SELECT p FROM PuestoTrabajo p WHERE p.pymMovRepetitivosCuerpo = :pymMovRepetitivosCuerpo")
    , @NamedQuery(name = "PuestoTrabajo.findByPymMovRepetitivosBrazos", query = "SELECT p FROM PuestoTrabajo p WHERE p.pymMovRepetitivosBrazos = :pymMovRepetitivosBrazos")
    , @NamedQuery(name = "PuestoTrabajo.findByPymMovRepetitivosPiernas", query = "SELECT p FROM PuestoTrabajo p WHERE p.pymMovRepetitivosPiernas = :pymMovRepetitivosPiernas")
    , @NamedQuery(name = "PuestoTrabajo.findByPymTraslados", query = "SELECT p FROM PuestoTrabajo p WHERE p.pymTraslados = :pymTraslados")
    , @NamedQuery(name = "PuestoTrabajo.findByPsAtencionPublico", query = "SELECT p FROM PuestoTrabajo p WHERE p.psAtencionPublico = :psAtencionPublico")
    , @NamedQuery(name = "PuestoTrabajo.findByPsTareaOtrosTrabajadores", query = "SELECT p FROM PuestoTrabajo p WHERE p.psTareaOtrosTrabajadores = :psTareaOtrosTrabajadores")
    , @NamedQuery(name = "PuestoTrabajo.findByPsTurnosFijos", query = "SELECT p FROM PuestoTrabajo p WHERE p.psTurnosFijos = :psTurnosFijos")
    , @NamedQuery(name = "PuestoTrabajo.findByPsTurnosRotativos", query = "SELECT p FROM PuestoTrabajo p WHERE p.psTurnosRotativos = :psTurnosRotativos")
    , @NamedQuery(name = "PuestoTrabajo.findByPsDescansoDuranteTrabajo", query = "SELECT p FROM PuestoTrabajo p WHERE p.psDescansoDuranteTrabajo = :psDescansoDuranteTrabajo")
    , @NamedQuery(name = "PuestoTrabajo.findByPsTrabajaDomingos", query = "SELECT p FROM PuestoTrabajo p WHERE p.psTrabajaDomingos = :psTrabajaDomingos")
    , @NamedQuery(name = "PuestoTrabajo.findByPsTrabajaFeriados", query = "SELECT p FROM PuestoTrabajo p WHERE p.psTrabajaFeriados = :psTrabajaFeriados")
    , @NamedQuery(name = "PuestoTrabajo.findByPsHaySupervisor", query = "SELECT p FROM PuestoTrabajo p WHERE p.psHaySupervisor = :psHaySupervisor")
    , @NamedQuery(name = "PuestoTrabajo.findByPsTrabajoAburrido", query = "SELECT p FROM PuestoTrabajo p WHERE p.psTrabajoAburrido = :psTrabajoAburrido")
    , @NamedQuery(name = "PuestoTrabajo.findByPsSienteMalTrabajar", query = "SELECT p FROM PuestoTrabajo p WHERE p.psSienteMalTrabajar = :psSienteMalTrabajar")
    , @NamedQuery(name = "PuestoTrabajo.findByPsIniciativasDesempe\u00f1oTrabajo", query = "SELECT p FROM PuestoTrabajo p WHERE p.psIniciativasDesempe\u00f1oTrabajo = :psIniciativasDesempe\u00f1oTrabajo")
    , @NamedQuery(name = "PuestoTrabajo.findByPsParteDeLaEmpresa", query = "SELECT p FROM PuestoTrabajo p WHERE p.psParteDeLaEmpresa = :psParteDeLaEmpresa")
    , @NamedQuery(name = "PuestoTrabajo.findByPsAgotado", query = "SELECT p FROM PuestoTrabajo p WHERE p.psAgotado = :psAgotado")
    , @NamedQuery(name = "PuestoTrabajo.findByPsAgresivo", query = "SELECT p FROM PuestoTrabajo p WHERE p.psAgresivo = :psAgresivo")
    , @NamedQuery(name = "PuestoTrabajo.findByPsTensionado", query = "SELECT p FROM PuestoTrabajo p WHERE p.psTensionado = :psTensionado")
    , @NamedQuery(name = "PuestoTrabajo.findByPsSatisfecho", query = "SELECT p FROM PuestoTrabajo p WHERE p.psSatisfecho = :psSatisfecho")
    , @NamedQuery(name = "PuestoTrabajo.findByPsNervioso", query = "SELECT p FROM PuestoTrabajo p WHERE p.psNervioso = :psNervioso")
    , @NamedQuery(name = "PuestoTrabajo.findByPsContento", query = "SELECT p FROM PuestoTrabajo p WHERE p.psContento = :psContento")
    , @NamedQuery(name = "PuestoTrabajo.findByPsIndiferente", query = "SELECT p FROM PuestoTrabajo p WHERE p.psIndiferente = :psIndiferente")
    , @NamedQuery(name = "PuestoTrabajo.findByPsSuperioresExigenDemas", query = "SELECT p FROM PuestoTrabajo p WHERE p.psSuperioresExigenDemas = :psSuperioresExigenDemas")
    , @NamedQuery(name = "PuestoTrabajo.findByPsCompanierosAgreden", query = "SELECT p FROM PuestoTrabajo p WHERE p.psCompanierosAgreden = :psCompanierosAgreden")
    , @NamedQuery(name = "PuestoTrabajo.findByPsTareasGranResponsabilidad", query = "SELECT p FROM PuestoTrabajo p WHERE p.psTareasGranResponsabilidad = :psTareasGranResponsabilidad")
    , @NamedQuery(name = "PuestoTrabajo.findByPsNoReconocimientoSuperiores", query = "SELECT p FROM PuestoTrabajo p WHERE p.psNoReconocimientoSuperiores = :psNoReconocimientoSuperiores")
    , @NamedQuery(name = "PuestoTrabajo.findByPsNoReconocimientoEmpresa", query = "SELECT p FROM PuestoTrabajo p WHERE p.psNoReconocimientoEmpresa = :psNoReconocimientoEmpresa")
    , @NamedQuery(name = "PuestoTrabajo.findByPsNoReconocimientoCompanieros", query = "SELECT p FROM PuestoTrabajo p WHERE p.psNoReconocimientoCompanieros = :psNoReconocimientoCompanieros")
    , @NamedQuery(name = "PuestoTrabajo.findByAsReconocimientoSocial", query = "SELECT p FROM PuestoTrabajo p WHERE p.asReconocimientoSocial = :asReconocimientoSocial")
    , @NamedQuery(name = "PuestoTrabajo.findByAsImportanciaSocial", query = "SELECT p FROM PuestoTrabajo p WHERE p.asImportanciaSocial = :asImportanciaSocial")
    , @NamedQuery(name = "PuestoTrabajo.findByAsSueldoInsuficiente", query = "SELECT p FROM PuestoTrabajo p WHERE p.asSueldoInsuficiente = :asSueldoInsuficiente")
    , @NamedQuery(name = "PuestoTrabajo.findByAsLeeLibros", query = "SELECT p FROM PuestoTrabajo p WHERE p.asLeeLibros = :asLeeLibros")
    , @NamedQuery(name = "PuestoTrabajo.findByAsSinFinLucro", query = "SELECT p FROM PuestoTrabajo p WHERE p.asSinFinLucro = :asSinFinLucro")
    , @NamedQuery(name = "PuestoTrabajo.findByAsVerTelevision", query = "SELECT p FROM PuestoTrabajo p WHERE p.asVerTelevision = :asVerTelevision")
    , @NamedQuery(name = "PuestoTrabajo.findByAsAmadeCasa", query = "SELECT p FROM PuestoTrabajo p WHERE p.asAmadeCasa = :asAmadeCasa")
    , @NamedQuery(name = "PuestoTrabajo.findByAsPracticaDeportes", query = "SELECT p FROM PuestoTrabajo p WHERE p.asPracticaDeportes = :asPracticaDeportes")
    , @NamedQuery(name = "PuestoTrabajo.findByAsAltoRiesgoLaboral", query = "SELECT p FROM PuestoTrabajo p WHERE p.asAltoRiesgoLaboral = :asAltoRiesgoLaboral")})
public class PuestoTrabajo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_empleo")
    private int idEmpleo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 14)
    @Column(name = "rf_carga_termica")
    private String rfCargaTermica;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 14)
    @Column(name = "rf_humedad")
    private String rfHumedad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 14)
    @Column(name = "rf_ruidos")
    private String rfRuidos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 14)
    @Column(name = "rf_vibraciones")
    private String rfVibraciones;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 14)
    @Column(name = "rf_gases")
    private String rfGases;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 14)
    @Column(name = "rf_polvos")
    private String rfPolvos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 14)
    @Column(name = "rf_liquidos")
    private String rfLiquidos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "rf_ventilacion")
    private String rfVentilacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "rf_iluminacion")
    private String rfIluminacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "riesgosQuimicos")
    private String riesgosQuimicos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "riesgosBiologicos")
    private String riesgosBiologicos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "pym_EsfuerzoFisico")
    private String pymEsfuerzoFisico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "pym_EsfuerzoVoz")
    private String pymEsfuerzoVoz;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "pym_EstardePie")
    private String pymEstardePie;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "pym_SentadoIncomodo")
    private String pymSentadoIncomodo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "pym_PosicionIncomoda")
    private String pymPosicionIncomoda;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "pym_MovRepetitivosCuerpo")
    private String pymMovRepetitivosCuerpo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "pym_MovRepetitivosBrazos")
    private String pymMovRepetitivosBrazos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "pym_MovRepetitivosPiernas")
    private String pymMovRepetitivosPiernas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "pym_Traslados")
    private String pymTraslados;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "ps_AtencionPublico")
    private String psAtencionPublico;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "ps_TareaOtrosTrabajadores")
    private String psTareaOtrosTrabajadores;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "ps_TurnosFijos")
    private String psTurnosFijos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "ps_TurnosRotativos")
    private String psTurnosRotativos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "ps_DescansoDuranteTrabajo")
    private String psDescansoDuranteTrabajo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "ps_TrabajaDomingos")
    private String psTrabajaDomingos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "ps_TrabajaFeriados")
    private String psTrabajaFeriados;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 8)
    @Column(name = "ps_HaySupervisor")
    private String psHaySupervisor;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ps_TrabajoAburrido")
    private String psTrabajoAburrido;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ps_SienteMalTrabajar")
    private String psSienteMalTrabajar;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ps_IniciativasDesempe\u00f1oTrabajo")
    private String psIniciativasDesempeñoTrabajo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ps_ParteDeLaEmpresa")
    private String psParteDeLaEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ps_Agotado")
    private String psAgotado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ps_Agresivo")
    private String psAgresivo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ps_Tensionado")
    private String psTensionado;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ps_Satisfecho")
    private String psSatisfecho;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ps_Nervioso")
    private String psNervioso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ps_Contento")
    private String psContento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ps_Indiferente")
    private String psIndiferente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ps_SuperioresExigenDemas")
    private String psSuperioresExigenDemas;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ps_CompanierosAgreden")
    private String psCompanierosAgreden;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ps_TareasGranResponsabilidad")
    private String psTareasGranResponsabilidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ps_NoReconocimientoSuperiores")
    private String psNoReconocimientoSuperiores;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ps_NoReconocimientoEmpresa")
    private String psNoReconocimientoEmpresa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ps_NoReconocimientoCompanieros")
    private String psNoReconocimientoCompanieros;
    @Basic(optional = false)
    @NotNull
    @Column(name = "as_ReconocimientoSocial")
    private boolean asReconocimientoSocial;
    @Basic(optional = false)
    @NotNull
    @Column(name = "as_ImportanciaSocial")
    private boolean asImportanciaSocial;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 14)
    @Column(name = "as_SueldoInsuficiente")
    private String asSueldoInsuficiente;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 14)
    @Column(name = "as_LeeLibros")
    private String asLeeLibros;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 14)
    @Column(name = "as_SinFinLucro")
    private String asSinFinLucro;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 14)
    @Column(name = "as_VerTelevision")
    private String asVerTelevision;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 14)
    @Column(name = "as_AmadeCasa")
    private String asAmadeCasa;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 14)
    @Column(name = "as_PracticaDeportes")
    private String asPracticaDeportes;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "as_AltoRiesgoLaboral")
    private String asAltoRiesgoLaboral;

    public PuestoTrabajo() {
    }

    public PuestoTrabajo(Integer id) {
        this.id = id;
    }

    public PuestoTrabajo(Integer id, int idEmpleo, String rfCargaTermica, String rfHumedad, String rfRuidos, String rfVibraciones, String rfGases, String rfPolvos, String rfLiquidos, String rfVentilacion, String rfIluminacion, String riesgosQuimicos, String riesgosBiologicos, String pymEsfuerzoFisico, String pymEsfuerzoVoz, String pymEstardePie, String pymSentadoIncomodo, String pymPosicionIncomoda, String pymMovRepetitivosCuerpo, String pymMovRepetitivosBrazos, String pymMovRepetitivosPiernas, String pymTraslados, String psAtencionPublico, String psTareaOtrosTrabajadores, String psTurnosFijos, String psTurnosRotativos, String psDescansoDuranteTrabajo, String psTrabajaDomingos, String psTrabajaFeriados, String psHaySupervisor, String psTrabajoAburrido, String psSienteMalTrabajar, String psIniciativasDesempeñoTrabajo, String psParteDeLaEmpresa, String psAgotado, String psAgresivo, String psTensionado, String psSatisfecho, String psNervioso, String psContento, String psIndiferente, String psSuperioresExigenDemas, String psCompanierosAgreden, String psTareasGranResponsabilidad, String psNoReconocimientoSuperiores, String psNoReconocimientoEmpresa, String psNoReconocimientoCompanieros, boolean asReconocimientoSocial, boolean asImportanciaSocial, String asSueldoInsuficiente, String asLeeLibros, String asSinFinLucro, String asVerTelevision, String asAmadeCasa, String asPracticaDeportes, String asAltoRiesgoLaboral) {
        this.id = id;
        this.idEmpleo = idEmpleo;
        this.rfCargaTermica = rfCargaTermica;
        this.rfHumedad = rfHumedad;
        this.rfRuidos = rfRuidos;
        this.rfVibraciones = rfVibraciones;
        this.rfGases = rfGases;
        this.rfPolvos = rfPolvos;
        this.rfLiquidos = rfLiquidos;
        this.rfVentilacion = rfVentilacion;
        this.rfIluminacion = rfIluminacion;
        this.riesgosQuimicos = riesgosQuimicos;
        this.riesgosBiologicos = riesgosBiologicos;
        this.pymEsfuerzoFisico = pymEsfuerzoFisico;
        this.pymEsfuerzoVoz = pymEsfuerzoVoz;
        this.pymEstardePie = pymEstardePie;
        this.pymSentadoIncomodo = pymSentadoIncomodo;
        this.pymPosicionIncomoda = pymPosicionIncomoda;
        this.pymMovRepetitivosCuerpo = pymMovRepetitivosCuerpo;
        this.pymMovRepetitivosBrazos = pymMovRepetitivosBrazos;
        this.pymMovRepetitivosPiernas = pymMovRepetitivosPiernas;
        this.pymTraslados = pymTraslados;
        this.psAtencionPublico = psAtencionPublico;
        this.psTareaOtrosTrabajadores = psTareaOtrosTrabajadores;
        this.psTurnosFijos = psTurnosFijos;
        this.psTurnosRotativos = psTurnosRotativos;
        this.psDescansoDuranteTrabajo = psDescansoDuranteTrabajo;
        this.psTrabajaDomingos = psTrabajaDomingos;
        this.psTrabajaFeriados = psTrabajaFeriados;
        this.psHaySupervisor = psHaySupervisor;
        this.psTrabajoAburrido = psTrabajoAburrido;
        this.psSienteMalTrabajar = psSienteMalTrabajar;
        this.psIniciativasDesempeñoTrabajo = psIniciativasDesempeñoTrabajo;
        this.psParteDeLaEmpresa = psParteDeLaEmpresa;
        this.psAgotado = psAgotado;
        this.psAgresivo = psAgresivo;
        this.psTensionado = psTensionado;
        this.psSatisfecho = psSatisfecho;
        this.psNervioso = psNervioso;
        this.psContento = psContento;
        this.psIndiferente = psIndiferente;
        this.psSuperioresExigenDemas = psSuperioresExigenDemas;
        this.psCompanierosAgreden = psCompanierosAgreden;
        this.psTareasGranResponsabilidad = psTareasGranResponsabilidad;
        this.psNoReconocimientoSuperiores = psNoReconocimientoSuperiores;
        this.psNoReconocimientoEmpresa = psNoReconocimientoEmpresa;
        this.psNoReconocimientoCompanieros = psNoReconocimientoCompanieros;
        this.asReconocimientoSocial = asReconocimientoSocial;
        this.asImportanciaSocial = asImportanciaSocial;
        this.asSueldoInsuficiente = asSueldoInsuficiente;
        this.asLeeLibros = asLeeLibros;
        this.asSinFinLucro = asSinFinLucro;
        this.asVerTelevision = asVerTelevision;
        this.asAmadeCasa = asAmadeCasa;
        this.asPracticaDeportes = asPracticaDeportes;
        this.asAltoRiesgoLaboral = asAltoRiesgoLaboral;
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

    public String getRfCargaTermica() {
        return rfCargaTermica;
    }

    public void setRfCargaTermica(String rfCargaTermica) {
        this.rfCargaTermica = rfCargaTermica;
    }

    public String getRfHumedad() {
        return rfHumedad;
    }

    public void setRfHumedad(String rfHumedad) {
        this.rfHumedad = rfHumedad;
    }

    public String getRfRuidos() {
        return rfRuidos;
    }

    public void setRfRuidos(String rfRuidos) {
        this.rfRuidos = rfRuidos;
    }

    public String getRfVibraciones() {
        return rfVibraciones;
    }

    public void setRfVibraciones(String rfVibraciones) {
        this.rfVibraciones = rfVibraciones;
    }

    public String getRfGases() {
        return rfGases;
    }

    public void setRfGases(String rfGases) {
        this.rfGases = rfGases;
    }

    public String getRfPolvos() {
        return rfPolvos;
    }

    public void setRfPolvos(String rfPolvos) {
        this.rfPolvos = rfPolvos;
    }

    public String getRfLiquidos() {
        return rfLiquidos;
    }

    public void setRfLiquidos(String rfLiquidos) {
        this.rfLiquidos = rfLiquidos;
    }

    public String getRfVentilacion() {
        return rfVentilacion;
    }

    public void setRfVentilacion(String rfVentilacion) {
        this.rfVentilacion = rfVentilacion;
    }

    public String getRfIluminacion() {
        return rfIluminacion;
    }

    public void setRfIluminacion(String rfIluminacion) {
        this.rfIluminacion = rfIluminacion;
    }

    public String getRiesgosQuimicos() {
        return riesgosQuimicos;
    }

    public void setRiesgosQuimicos(String riesgosQuimicos) {
        this.riesgosQuimicos = riesgosQuimicos;
    }

    public String getRiesgosBiologicos() {
        return riesgosBiologicos;
    }

    public void setRiesgosBiologicos(String riesgosBiologicos) {
        this.riesgosBiologicos = riesgosBiologicos;
    }

    public String getPymEsfuerzoFisico() {
        return pymEsfuerzoFisico;
    }

    public void setPymEsfuerzoFisico(String pymEsfuerzoFisico) {
        this.pymEsfuerzoFisico = pymEsfuerzoFisico;
    }

    public String getPymEsfuerzoVoz() {
        return pymEsfuerzoVoz;
    }

    public void setPymEsfuerzoVoz(String pymEsfuerzoVoz) {
        this.pymEsfuerzoVoz = pymEsfuerzoVoz;
    }

    public String getPymEstardePie() {
        return pymEstardePie;
    }

    public void setPymEstardePie(String pymEstardePie) {
        this.pymEstardePie = pymEstardePie;
    }

    public String getPymSentadoIncomodo() {
        return pymSentadoIncomodo;
    }

    public void setPymSentadoIncomodo(String pymSentadoIncomodo) {
        this.pymSentadoIncomodo = pymSentadoIncomodo;
    }

    public String getPymPosicionIncomoda() {
        return pymPosicionIncomoda;
    }

    public void setPymPosicionIncomoda(String pymPosicionIncomoda) {
        this.pymPosicionIncomoda = pymPosicionIncomoda;
    }

    public String getPymMovRepetitivosCuerpo() {
        return pymMovRepetitivosCuerpo;
    }

    public void setPymMovRepetitivosCuerpo(String pymMovRepetitivosCuerpo) {
        this.pymMovRepetitivosCuerpo = pymMovRepetitivosCuerpo;
    }

    public String getPymMovRepetitivosBrazos() {
        return pymMovRepetitivosBrazos;
    }

    public void setPymMovRepetitivosBrazos(String pymMovRepetitivosBrazos) {
        this.pymMovRepetitivosBrazos = pymMovRepetitivosBrazos;
    }

    public String getPymMovRepetitivosPiernas() {
        return pymMovRepetitivosPiernas;
    }

    public void setPymMovRepetitivosPiernas(String pymMovRepetitivosPiernas) {
        this.pymMovRepetitivosPiernas = pymMovRepetitivosPiernas;
    }

    public String getPymTraslados() {
        return pymTraslados;
    }

    public void setPymTraslados(String pymTraslados) {
        this.pymTraslados = pymTraslados;
    }

    public String getPsAtencionPublico() {
        return psAtencionPublico;
    }

    public void setPsAtencionPublico(String psAtencionPublico) {
        this.psAtencionPublico = psAtencionPublico;
    }

    public String getPsTareaOtrosTrabajadores() {
        return psTareaOtrosTrabajadores;
    }

    public void setPsTareaOtrosTrabajadores(String psTareaOtrosTrabajadores) {
        this.psTareaOtrosTrabajadores = psTareaOtrosTrabajadores;
    }

    public String getPsTurnosFijos() {
        return psTurnosFijos;
    }

    public void setPsTurnosFijos(String psTurnosFijos) {
        this.psTurnosFijos = psTurnosFijos;
    }

    public String getPsTurnosRotativos() {
        return psTurnosRotativos;
    }

    public void setPsTurnosRotativos(String psTurnosRotativos) {
        this.psTurnosRotativos = psTurnosRotativos;
    }

    public String getPsDescansoDuranteTrabajo() {
        return psDescansoDuranteTrabajo;
    }

    public void setPsDescansoDuranteTrabajo(String psDescansoDuranteTrabajo) {
        this.psDescansoDuranteTrabajo = psDescansoDuranteTrabajo;
    }

    public String getPsTrabajaDomingos() {
        return psTrabajaDomingos;
    }

    public void setPsTrabajaDomingos(String psTrabajaDomingos) {
        this.psTrabajaDomingos = psTrabajaDomingos;
    }

    public String getPsTrabajaFeriados() {
        return psTrabajaFeriados;
    }

    public void setPsTrabajaFeriados(String psTrabajaFeriados) {
        this.psTrabajaFeriados = psTrabajaFeriados;
    }

    public String getPsHaySupervisor() {
        return psHaySupervisor;
    }

    public void setPsHaySupervisor(String psHaySupervisor) {
        this.psHaySupervisor = psHaySupervisor;
    }

    public String getPsTrabajoAburrido() {
        return psTrabajoAburrido;
    }

    public void setPsTrabajoAburrido(String psTrabajoAburrido) {
        this.psTrabajoAburrido = psTrabajoAburrido;
    }

    public String getPsSienteMalTrabajar() {
        return psSienteMalTrabajar;
    }

    public void setPsSienteMalTrabajar(String psSienteMalTrabajar) {
        this.psSienteMalTrabajar = psSienteMalTrabajar;
    }

    public String getPsIniciativasDesempeñoTrabajo() {
        return psIniciativasDesempeñoTrabajo;
    }

    public void setPsIniciativasDesempeñoTrabajo(String psIniciativasDesempeñoTrabajo) {
        this.psIniciativasDesempeñoTrabajo = psIniciativasDesempeñoTrabajo;
    }

    public String getPsParteDeLaEmpresa() {
        return psParteDeLaEmpresa;
    }

    public void setPsParteDeLaEmpresa(String psParteDeLaEmpresa) {
        this.psParteDeLaEmpresa = psParteDeLaEmpresa;
    }

    public String getPsAgotado() {
        return psAgotado;
    }

    public void setPsAgotado(String psAgotado) {
        this.psAgotado = psAgotado;
    }

    public String getPsAgresivo() {
        return psAgresivo;
    }

    public void setPsAgresivo(String psAgresivo) {
        this.psAgresivo = psAgresivo;
    }

    public String getPsTensionado() {
        return psTensionado;
    }

    public void setPsTensionado(String psTensionado) {
        this.psTensionado = psTensionado;
    }

    public String getPsSatisfecho() {
        return psSatisfecho;
    }

    public void setPsSatisfecho(String psSatisfecho) {
        this.psSatisfecho = psSatisfecho;
    }

    public String getPsNervioso() {
        return psNervioso;
    }

    public void setPsNervioso(String psNervioso) {
        this.psNervioso = psNervioso;
    }

    public String getPsContento() {
        return psContento;
    }

    public void setPsContento(String psContento) {
        this.psContento = psContento;
    }

    public String getPsIndiferente() {
        return psIndiferente;
    }

    public void setPsIndiferente(String psIndiferente) {
        this.psIndiferente = psIndiferente;
    }

    public String getPsSuperioresExigenDemas() {
        return psSuperioresExigenDemas;
    }

    public void setPsSuperioresExigenDemas(String psSuperioresExigenDemas) {
        this.psSuperioresExigenDemas = psSuperioresExigenDemas;
    }

    public String getPsCompanierosAgreden() {
        return psCompanierosAgreden;
    }

    public void setPsCompanierosAgreden(String psCompanierosAgreden) {
        this.psCompanierosAgreden = psCompanierosAgreden;
    }

    public String getPsTareasGranResponsabilidad() {
        return psTareasGranResponsabilidad;
    }

    public void setPsTareasGranResponsabilidad(String psTareasGranResponsabilidad) {
        this.psTareasGranResponsabilidad = psTareasGranResponsabilidad;
    }

    public String getPsNoReconocimientoSuperiores() {
        return psNoReconocimientoSuperiores;
    }

    public void setPsNoReconocimientoSuperiores(String psNoReconocimientoSuperiores) {
        this.psNoReconocimientoSuperiores = psNoReconocimientoSuperiores;
    }

    public String getPsNoReconocimientoEmpresa() {
        return psNoReconocimientoEmpresa;
    }

    public void setPsNoReconocimientoEmpresa(String psNoReconocimientoEmpresa) {
        this.psNoReconocimientoEmpresa = psNoReconocimientoEmpresa;
    }

    public String getPsNoReconocimientoCompanieros() {
        return psNoReconocimientoCompanieros;
    }

    public void setPsNoReconocimientoCompanieros(String psNoReconocimientoCompanieros) {
        this.psNoReconocimientoCompanieros = psNoReconocimientoCompanieros;
    }

    public boolean getAsReconocimientoSocial() {
        return asReconocimientoSocial;
    }

    public void setAsReconocimientoSocial(boolean asReconocimientoSocial) {
        this.asReconocimientoSocial = asReconocimientoSocial;
    }

    public boolean getAsImportanciaSocial() {
        return asImportanciaSocial;
    }

    public void setAsImportanciaSocial(boolean asImportanciaSocial) {
        this.asImportanciaSocial = asImportanciaSocial;
    }

    public String getAsSueldoInsuficiente() {
        return asSueldoInsuficiente;
    }

    public void setAsSueldoInsuficiente(String asSueldoInsuficiente) {
        this.asSueldoInsuficiente = asSueldoInsuficiente;
    }

    public String getAsLeeLibros() {
        return asLeeLibros;
    }

    public void setAsLeeLibros(String asLeeLibros) {
        this.asLeeLibros = asLeeLibros;
    }

    public String getAsSinFinLucro() {
        return asSinFinLucro;
    }

    public void setAsSinFinLucro(String asSinFinLucro) {
        this.asSinFinLucro = asSinFinLucro;
    }

    public String getAsVerTelevision() {
        return asVerTelevision;
    }

    public void setAsVerTelevision(String asVerTelevision) {
        this.asVerTelevision = asVerTelevision;
    }

    public String getAsAmadeCasa() {
        return asAmadeCasa;
    }

    public void setAsAmadeCasa(String asAmadeCasa) {
        this.asAmadeCasa = asAmadeCasa;
    }

    public String getAsPracticaDeportes() {
        return asPracticaDeportes;
    }

    public void setAsPracticaDeportes(String asPracticaDeportes) {
        this.asPracticaDeportes = asPracticaDeportes;
    }

    public String getAsAltoRiesgoLaboral() {
        return asAltoRiesgoLaboral;
    }

    public void setAsAltoRiesgoLaboral(String asAltoRiesgoLaboral) {
        this.asAltoRiesgoLaboral = asAltoRiesgoLaboral;
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
        if (!(object instanceof PuestoTrabajo)) {
            return false;
        }
        PuestoTrabajo other = (PuestoTrabajo) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.fcm.hcdl.model.PuestoTrabajo[ id=" + id + " ]";
    }
    
}
