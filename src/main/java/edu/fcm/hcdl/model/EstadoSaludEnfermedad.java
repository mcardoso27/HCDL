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
@Table(name = "EstadoSaludEnfermedad")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EstadoSaludEnfermedad.findAll", query = "SELECT e FROM EstadoSaludEnfermedad e")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findById", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.id = :id")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findByIdPersona", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.idPersona = :idPersona")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findByFechaRealizacion", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.fechaRealizacion = :fechaRealizacion")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findByCantidadCigarrillos", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.cantidadCigarrillos = :cantidadCigarrillos")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findByAlcohol", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.alcohol = :alcohol")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findByMedicamentos", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.medicamentos = :medicamentos")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findByTranquilizantes", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.tranquilizantes = :tranquilizantes")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findByPeso", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.peso = :peso")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findByEstatura", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.estatura = :estatura")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findBySintAlteracionesEnVision", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.sintAlteracionesEnVision = :sintAlteracionesEnVision")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findBySintDecaimiento", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.sintDecaimiento = :sintDecaimiento")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findBySintPesadezEnPiernas", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.sintPesadezEnPiernas = :sintPesadezEnPiernas")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findBySintInsomnio", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.sintInsomnio = :sintInsomnio")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findBySintDificultadParaConcentrarse", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.sintDificultadParaConcentrarse = :sintDificultadParaConcentrarse")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findBySintInapetencia", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.sintInapetencia = :sintInapetencia")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findBySintLlantofacil", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.sintLlantofacil = :sintLlantofacil")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findBySintIrritabilidad", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.sintIrritabilidad = :sintIrritabilidad")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findBySintPerdidaDememoria", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.sintPerdidaDememoria = :sintPerdidaDememoria")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findBySintAngustia", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.sintAngustia = :sintAngustia")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findBySintAcidez", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.sintAcidez = :sintAcidez")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findBySintNauseas", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.sintNauseas = :sintNauseas")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findBySintVomitos", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.sintVomitos = :sintVomitos")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findBySintDiarreas", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.sintDiarreas = :sintDiarreas")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findBySintConstipacion", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.sintConstipacion = :sintConstipacion")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findBySintTrastornosRespiratorios", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.sintTrastornosRespiratorios = :sintTrastornosRespiratorios")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findBySintPalpitaciones", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.sintPalpitaciones = :sintPalpitaciones")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findBySintMareos", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.sintMareos = :sintMareos")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findBySintAfonia", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.sintAfonia = :sintAfonia")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findBySintAumentoDePeso", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.sintAumentoDePeso = :sintAumentoDePeso")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findBySintDisminucionDePeso", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.sintDisminucionDePeso = :sintDisminucionDePeso")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findBySintTosPermanente", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.sintTosPermanente = :sintTosPermanente")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findBySintHormigueoManosPies", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.sintHormigueoManosPies = :sintHormigueoManosPies")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findBySintDoloresArticulares", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.sintDoloresArticulares = :sintDoloresArticulares")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findBySintDoloresEspalda", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.sintDoloresEspalda = :sintDoloresEspalda")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findBySintDoloresCuello", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.sintDoloresCuello = :sintDoloresCuello")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findBySintDoloresLumbares", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.sintDoloresLumbares = :sintDoloresLumbares")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findBySintDolorMuscularGeneral", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.sintDolorMuscularGeneral = :sintDolorMuscularGeneral")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findBySintConvulsiones", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.sintConvulsiones = :sintConvulsiones")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findBySintEpilepsia", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.sintEpilepsia = :sintEpilepsia")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findByEdLuecemia", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.edLuecemia = :edLuecemia")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findByEdDisfonia", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.edDisfonia = :edDisfonia")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findByEdMiopia", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.edMiopia = :edMiopia")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findByEdAstigmatismo", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.edAstigmatismo = :edAstigmatismo")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findByEdAsma", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.edAsma = :edAsma")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findByEdFibromialgia", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.edFibromialgia = :edFibromialgia")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findByEdCistitis", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.edCistitis = :edCistitis")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findByEdTumores", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.edTumores = :edTumores")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findByEdAlergia", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.edAlergia = :edAlergia")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findByEdHipoacusia", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.edHipoacusia = :edHipoacusia")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findByEdDiabetes", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.edDiabetes = :edDiabetes")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findByEdVertigos", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.edVertigos = :edVertigos")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findByEdRinitis", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.edRinitis = :edRinitis")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findByEdBronquitis", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.edBronquitis = :edBronquitis")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findByEdHipertension", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.edHipertension = :edHipertension")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findByEdEnfCardiacasCoronarias", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.edEnfCardiacasCoronarias = :edEnfCardiacasCoronarias")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findByEdTendinitis", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.edTendinitis = :edTendinitis")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findByEdStress", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.edStress = :edStress")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findByEdLumbagia", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.edLumbagia = :edLumbagia")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findByEdUlceraEstomago", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.edUlceraEstomago = :edUlceraEstomago")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findByEdGastritis", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.edGastritis = :edGastritis")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findByEdReumatismo", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.edReumatismo = :edReumatismo")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findByEdNeurosis", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.edNeurosis = :edNeurosis")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findByEdDepresion", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.edDepresion = :edDepresion")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findByEdVaricocele", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.edVaricocele = :edVaricocele")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findByExamenPreIngreso", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.examenPreIngreso = :examenPreIngreso")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findByExamenesperiodicos", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.examenesperiodicos = :examenesperiodicos")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findByExamPeriodicoMedico", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.examPeriodicoMedico = :examPeriodicoMedico")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findByMedicoEmpresa", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.medicoEmpresa = :medicoEmpresa")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findByExaminadoAusencia", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.examinadoAusencia = :examinadoAusencia")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findByRecibioCapacitacion", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.recibioCapacitacion = :recibioCapacitacion")
    , @NamedQuery(name = "EstadoSaludEnfermedad.findByIdAccidentes", query = "SELECT e FROM EstadoSaludEnfermedad e WHERE e.idAccidentes = :idAccidentes")})
public class EstadoSaludEnfermedad implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "id_persona")
    private int idPersona;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_realizacion")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaRealizacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "cantidad_cigarrillos")
    private int cantidadCigarrillos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "alcohol")
    private boolean alcohol;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 256)
    @Column(name = "medicamentos")
    private String medicamentos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "tranquilizantes")
    private boolean tranquilizantes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "peso")
    private float peso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "estatura")
    private float estatura;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sint_AlteracionesEnVision")
    private boolean sintAlteracionesEnVision;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sint_Decaimiento")
    private boolean sintDecaimiento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sint_PesadezEnPiernas")
    private boolean sintPesadezEnPiernas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sint_Insomnio")
    private boolean sintInsomnio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sint_DificultadParaConcentrarse")
    private boolean sintDificultadParaConcentrarse;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sint_Inapetencia")
    private boolean sintInapetencia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sint_Llanto facil")
    private boolean sintLlantofacil;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sint_Irritabilidad")
    private boolean sintIrritabilidad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sint_PerdidaDememoria")
    private boolean sintPerdidaDememoria;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sint_Angustia")
    private boolean sintAngustia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sint_Acidez")
    private boolean sintAcidez;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sint_Nauseas")
    private boolean sintNauseas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sint_Vomitos")
    private boolean sintVomitos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sint_Diarreas")
    private boolean sintDiarreas;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sint_Constipacion")
    private boolean sintConstipacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sint_TrastornosRespiratorios")
    private boolean sintTrastornosRespiratorios;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sint_Palpitaciones")
    private boolean sintPalpitaciones;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sint_Mareos")
    private boolean sintMareos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sint_Afonia")
    private boolean sintAfonia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sint_AumentoDePeso")
    private boolean sintAumentoDePeso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sint_DisminucionDePeso")
    private boolean sintDisminucionDePeso;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sint_TosPermanente")
    private boolean sintTosPermanente;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sint_HormigueoManosPies")
    private boolean sintHormigueoManosPies;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sint_DoloresArticulares")
    private boolean sintDoloresArticulares;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sint_DoloresEspalda")
    private boolean sintDoloresEspalda;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sint_DoloresCuello")
    private boolean sintDoloresCuello;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sint_DoloresLumbares")
    private boolean sintDoloresLumbares;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sint_DolorMuscularGeneral")
    private boolean sintDolorMuscularGeneral;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sint_Convulsiones")
    private boolean sintConvulsiones;
    @Basic(optional = false)
    @NotNull
    @Column(name = "sint_Epilepsia")
    private boolean sintEpilepsia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ed_Luecemia")
    private boolean edLuecemia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ed_Disfonia")
    private boolean edDisfonia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ed_Miopia")
    private boolean edMiopia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ed_Astigmatismo")
    private boolean edAstigmatismo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ed_Asma")
    private boolean edAsma;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ed_Fibromialgia")
    private boolean edFibromialgia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ed_Cistitis")
    private boolean edCistitis;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ed_Tumores")
    private boolean edTumores;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ed_Alergia")
    private boolean edAlergia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ed_Hipoacusia")
    private boolean edHipoacusia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ed_Diabetes")
    private boolean edDiabetes;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ed_Vertigos")
    private boolean edVertigos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ed_Rinitis")
    private boolean edRinitis;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ed_Bronquitis")
    private boolean edBronquitis;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ed_Hipertension")
    private boolean edHipertension;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ed_EnfCardiacasCoronarias")
    private boolean edEnfCardiacasCoronarias;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ed_Tendinitis")
    private boolean edTendinitis;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ed_Stress")
    private boolean edStress;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ed_Lumbagia")
    private boolean edLumbagia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ed_UlceraEstomago")
    private boolean edUlceraEstomago;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ed_Gastritis")
    private boolean edGastritis;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ed_Reumatismo")
    private boolean edReumatismo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ed_Neurosis")
    private boolean edNeurosis;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ed_Depresion")
    private boolean edDepresion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ed_Varicocele")
    private boolean edVaricocele;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 22)
    @Column(name = "ExamenPreIngreso")
    private String examenPreIngreso;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 21)
    @Column(name = "Examenesperiodicos")
    private String examenesperiodicos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "ExamPeriodicoMedico")
    private String examPeriodicoMedico;
    @Basic(optional = false)
    @NotNull
    @Column(name = "MedicoEmpresa")
    private boolean medicoEmpresa;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ExaminadoAusencia")
    private boolean examinadoAusencia;
    @Basic(optional = false)
    @NotNull
    @Column(name = "RecibioCapacitacion")
    private boolean recibioCapacitacion;
    @Column(name = "id_accidentes")
    private Integer idAccidentes;

    public EstadoSaludEnfermedad() {
    }

    public EstadoSaludEnfermedad(Integer id) {
        this.id = id;
    }

    public EstadoSaludEnfermedad(Integer id, int idPersona, Date fechaRealizacion, int cantidadCigarrillos, boolean alcohol, String medicamentos, boolean tranquilizantes, float peso, float estatura, boolean sintAlteracionesEnVision, boolean sintDecaimiento, boolean sintPesadezEnPiernas, boolean sintInsomnio, boolean sintDificultadParaConcentrarse, boolean sintInapetencia, boolean sintLlantofacil, boolean sintIrritabilidad, boolean sintPerdidaDememoria, boolean sintAngustia, boolean sintAcidez, boolean sintNauseas, boolean sintVomitos, boolean sintDiarreas, boolean sintConstipacion, boolean sintTrastornosRespiratorios, boolean sintPalpitaciones, boolean sintMareos, boolean sintAfonia, boolean sintAumentoDePeso, boolean sintDisminucionDePeso, boolean sintTosPermanente, boolean sintHormigueoManosPies, boolean sintDoloresArticulares, boolean sintDoloresEspalda, boolean sintDoloresCuello, boolean sintDoloresLumbares, boolean sintDolorMuscularGeneral, boolean sintConvulsiones, boolean sintEpilepsia, boolean edLuecemia, boolean edDisfonia, boolean edMiopia, boolean edAstigmatismo, boolean edAsma, boolean edFibromialgia, boolean edCistitis, boolean edTumores, boolean edAlergia, boolean edHipoacusia, boolean edDiabetes, boolean edVertigos, boolean edRinitis, boolean edBronquitis, boolean edHipertension, boolean edEnfCardiacasCoronarias, boolean edTendinitis, boolean edStress, boolean edLumbagia, boolean edUlceraEstomago, boolean edGastritis, boolean edReumatismo, boolean edNeurosis, boolean edDepresion, boolean edVaricocele, String examenPreIngreso, String examenesperiodicos, String examPeriodicoMedico, boolean medicoEmpresa, boolean examinadoAusencia, boolean recibioCapacitacion) {
        this.id = id;
        this.idPersona = idPersona;
        this.fechaRealizacion = fechaRealizacion;
        this.cantidadCigarrillos = cantidadCigarrillos;
        this.alcohol = alcohol;
        this.medicamentos = medicamentos;
        this.tranquilizantes = tranquilizantes;
        this.peso = peso;
        this.estatura = estatura;
        this.sintAlteracionesEnVision = sintAlteracionesEnVision;
        this.sintDecaimiento = sintDecaimiento;
        this.sintPesadezEnPiernas = sintPesadezEnPiernas;
        this.sintInsomnio = sintInsomnio;
        this.sintDificultadParaConcentrarse = sintDificultadParaConcentrarse;
        this.sintInapetencia = sintInapetencia;
        this.sintLlantofacil = sintLlantofacil;
        this.sintIrritabilidad = sintIrritabilidad;
        this.sintPerdidaDememoria = sintPerdidaDememoria;
        this.sintAngustia = sintAngustia;
        this.sintAcidez = sintAcidez;
        this.sintNauseas = sintNauseas;
        this.sintVomitos = sintVomitos;
        this.sintDiarreas = sintDiarreas;
        this.sintConstipacion = sintConstipacion;
        this.sintTrastornosRespiratorios = sintTrastornosRespiratorios;
        this.sintPalpitaciones = sintPalpitaciones;
        this.sintMareos = sintMareos;
        this.sintAfonia = sintAfonia;
        this.sintAumentoDePeso = sintAumentoDePeso;
        this.sintDisminucionDePeso = sintDisminucionDePeso;
        this.sintTosPermanente = sintTosPermanente;
        this.sintHormigueoManosPies = sintHormigueoManosPies;
        this.sintDoloresArticulares = sintDoloresArticulares;
        this.sintDoloresEspalda = sintDoloresEspalda;
        this.sintDoloresCuello = sintDoloresCuello;
        this.sintDoloresLumbares = sintDoloresLumbares;
        this.sintDolorMuscularGeneral = sintDolorMuscularGeneral;
        this.sintConvulsiones = sintConvulsiones;
        this.sintEpilepsia = sintEpilepsia;
        this.edLuecemia = edLuecemia;
        this.edDisfonia = edDisfonia;
        this.edMiopia = edMiopia;
        this.edAstigmatismo = edAstigmatismo;
        this.edAsma = edAsma;
        this.edFibromialgia = edFibromialgia;
        this.edCistitis = edCistitis;
        this.edTumores = edTumores;
        this.edAlergia = edAlergia;
        this.edHipoacusia = edHipoacusia;
        this.edDiabetes = edDiabetes;
        this.edVertigos = edVertigos;
        this.edRinitis = edRinitis;
        this.edBronquitis = edBronquitis;
        this.edHipertension = edHipertension;
        this.edEnfCardiacasCoronarias = edEnfCardiacasCoronarias;
        this.edTendinitis = edTendinitis;
        this.edStress = edStress;
        this.edLumbagia = edLumbagia;
        this.edUlceraEstomago = edUlceraEstomago;
        this.edGastritis = edGastritis;
        this.edReumatismo = edReumatismo;
        this.edNeurosis = edNeurosis;
        this.edDepresion = edDepresion;
        this.edVaricocele = edVaricocele;
        this.examenPreIngreso = examenPreIngreso;
        this.examenesperiodicos = examenesperiodicos;
        this.examPeriodicoMedico = examPeriodicoMedico;
        this.medicoEmpresa = medicoEmpresa;
        this.examinadoAusencia = examinadoAusencia;
        this.recibioCapacitacion = recibioCapacitacion;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public Date getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(Date fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public int getCantidadCigarrillos() {
        return cantidadCigarrillos;
    }

    public void setCantidadCigarrillos(int cantidadCigarrillos) {
        this.cantidadCigarrillos = cantidadCigarrillos;
    }

    public boolean getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(boolean alcohol) {
        this.alcohol = alcohol;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public boolean getTranquilizantes() {
        return tranquilizantes;
    }

    public void setTranquilizantes(boolean tranquilizantes) {
        this.tranquilizantes = tranquilizantes;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public boolean getSintAlteracionesEnVision() {
        return sintAlteracionesEnVision;
    }

    public void setSintAlteracionesEnVision(boolean sintAlteracionesEnVision) {
        this.sintAlteracionesEnVision = sintAlteracionesEnVision;
    }

    public boolean getSintDecaimiento() {
        return sintDecaimiento;
    }

    public void setSintDecaimiento(boolean sintDecaimiento) {
        this.sintDecaimiento = sintDecaimiento;
    }

    public boolean getSintPesadezEnPiernas() {
        return sintPesadezEnPiernas;
    }

    public void setSintPesadezEnPiernas(boolean sintPesadezEnPiernas) {
        this.sintPesadezEnPiernas = sintPesadezEnPiernas;
    }

    public boolean getSintInsomnio() {
        return sintInsomnio;
    }

    public void setSintInsomnio(boolean sintInsomnio) {
        this.sintInsomnio = sintInsomnio;
    }

    public boolean getSintDificultadParaConcentrarse() {
        return sintDificultadParaConcentrarse;
    }

    public void setSintDificultadParaConcentrarse(boolean sintDificultadParaConcentrarse) {
        this.sintDificultadParaConcentrarse = sintDificultadParaConcentrarse;
    }

    public boolean getSintInapetencia() {
        return sintInapetencia;
    }

    public void setSintInapetencia(boolean sintInapetencia) {
        this.sintInapetencia = sintInapetencia;
    }

    public boolean getSintLlantofacil() {
        return sintLlantofacil;
    }

    public void setSintLlantofacil(boolean sintLlantofacil) {
        this.sintLlantofacil = sintLlantofacil;
    }

    public boolean getSintIrritabilidad() {
        return sintIrritabilidad;
    }

    public void setSintIrritabilidad(boolean sintIrritabilidad) {
        this.sintIrritabilidad = sintIrritabilidad;
    }

    public boolean getSintPerdidaDememoria() {
        return sintPerdidaDememoria;
    }

    public void setSintPerdidaDememoria(boolean sintPerdidaDememoria) {
        this.sintPerdidaDememoria = sintPerdidaDememoria;
    }

    public boolean getSintAngustia() {
        return sintAngustia;
    }

    public void setSintAngustia(boolean sintAngustia) {
        this.sintAngustia = sintAngustia;
    }

    public boolean getSintAcidez() {
        return sintAcidez;
    }

    public void setSintAcidez(boolean sintAcidez) {
        this.sintAcidez = sintAcidez;
    }

    public boolean getSintNauseas() {
        return sintNauseas;
    }

    public void setSintNauseas(boolean sintNauseas) {
        this.sintNauseas = sintNauseas;
    }

    public boolean getSintVomitos() {
        return sintVomitos;
    }

    public void setSintVomitos(boolean sintVomitos) {
        this.sintVomitos = sintVomitos;
    }

    public boolean getSintDiarreas() {
        return sintDiarreas;
    }

    public void setSintDiarreas(boolean sintDiarreas) {
        this.sintDiarreas = sintDiarreas;
    }

    public boolean getSintConstipacion() {
        return sintConstipacion;
    }

    public void setSintConstipacion(boolean sintConstipacion) {
        this.sintConstipacion = sintConstipacion;
    }

    public boolean getSintTrastornosRespiratorios() {
        return sintTrastornosRespiratorios;
    }

    public void setSintTrastornosRespiratorios(boolean sintTrastornosRespiratorios) {
        this.sintTrastornosRespiratorios = sintTrastornosRespiratorios;
    }

    public boolean getSintPalpitaciones() {
        return sintPalpitaciones;
    }

    public void setSintPalpitaciones(boolean sintPalpitaciones) {
        this.sintPalpitaciones = sintPalpitaciones;
    }

    public boolean getSintMareos() {
        return sintMareos;
    }

    public void setSintMareos(boolean sintMareos) {
        this.sintMareos = sintMareos;
    }

    public boolean getSintAfonia() {
        return sintAfonia;
    }

    public void setSintAfonia(boolean sintAfonia) {
        this.sintAfonia = sintAfonia;
    }

    public boolean getSintAumentoDePeso() {
        return sintAumentoDePeso;
    }

    public void setSintAumentoDePeso(boolean sintAumentoDePeso) {
        this.sintAumentoDePeso = sintAumentoDePeso;
    }

    public boolean getSintDisminucionDePeso() {
        return sintDisminucionDePeso;
    }

    public void setSintDisminucionDePeso(boolean sintDisminucionDePeso) {
        this.sintDisminucionDePeso = sintDisminucionDePeso;
    }

    public boolean getSintTosPermanente() {
        return sintTosPermanente;
    }

    public void setSintTosPermanente(boolean sintTosPermanente) {
        this.sintTosPermanente = sintTosPermanente;
    }

    public boolean getSintHormigueoManosPies() {
        return sintHormigueoManosPies;
    }

    public void setSintHormigueoManosPies(boolean sintHormigueoManosPies) {
        this.sintHormigueoManosPies = sintHormigueoManosPies;
    }

    public boolean getSintDoloresArticulares() {
        return sintDoloresArticulares;
    }

    public void setSintDoloresArticulares(boolean sintDoloresArticulares) {
        this.sintDoloresArticulares = sintDoloresArticulares;
    }

    public boolean getSintDoloresEspalda() {
        return sintDoloresEspalda;
    }

    public void setSintDoloresEspalda(boolean sintDoloresEspalda) {
        this.sintDoloresEspalda = sintDoloresEspalda;
    }

    public boolean getSintDoloresCuello() {
        return sintDoloresCuello;
    }

    public void setSintDoloresCuello(boolean sintDoloresCuello) {
        this.sintDoloresCuello = sintDoloresCuello;
    }

    public boolean getSintDoloresLumbares() {
        return sintDoloresLumbares;
    }

    public void setSintDoloresLumbares(boolean sintDoloresLumbares) {
        this.sintDoloresLumbares = sintDoloresLumbares;
    }

    public boolean getSintDolorMuscularGeneral() {
        return sintDolorMuscularGeneral;
    }

    public void setSintDolorMuscularGeneral(boolean sintDolorMuscularGeneral) {
        this.sintDolorMuscularGeneral = sintDolorMuscularGeneral;
    }

    public boolean getSintConvulsiones() {
        return sintConvulsiones;
    }

    public void setSintConvulsiones(boolean sintConvulsiones) {
        this.sintConvulsiones = sintConvulsiones;
    }

    public boolean getSintEpilepsia() {
        return sintEpilepsia;
    }

    public void setSintEpilepsia(boolean sintEpilepsia) {
        this.sintEpilepsia = sintEpilepsia;
    }

    public boolean getEdLuecemia() {
        return edLuecemia;
    }

    public void setEdLuecemia(boolean edLuecemia) {
        this.edLuecemia = edLuecemia;
    }

    public boolean getEdDisfonia() {
        return edDisfonia;
    }

    public void setEdDisfonia(boolean edDisfonia) {
        this.edDisfonia = edDisfonia;
    }

    public boolean getEdMiopia() {
        return edMiopia;
    }

    public void setEdMiopia(boolean edMiopia) {
        this.edMiopia = edMiopia;
    }

    public boolean getEdAstigmatismo() {
        return edAstigmatismo;
    }

    public void setEdAstigmatismo(boolean edAstigmatismo) {
        this.edAstigmatismo = edAstigmatismo;
    }

    public boolean getEdAsma() {
        return edAsma;
    }

    public void setEdAsma(boolean edAsma) {
        this.edAsma = edAsma;
    }

    public boolean getEdFibromialgia() {
        return edFibromialgia;
    }

    public void setEdFibromialgia(boolean edFibromialgia) {
        this.edFibromialgia = edFibromialgia;
    }

    public boolean getEdCistitis() {
        return edCistitis;
    }

    public void setEdCistitis(boolean edCistitis) {
        this.edCistitis = edCistitis;
    }

    public boolean getEdTumores() {
        return edTumores;
    }

    public void setEdTumores(boolean edTumores) {
        this.edTumores = edTumores;
    }

    public boolean getEdAlergia() {
        return edAlergia;
    }

    public void setEdAlergia(boolean edAlergia) {
        this.edAlergia = edAlergia;
    }

    public boolean getEdHipoacusia() {
        return edHipoacusia;
    }

    public void setEdHipoacusia(boolean edHipoacusia) {
        this.edHipoacusia = edHipoacusia;
    }

    public boolean getEdDiabetes() {
        return edDiabetes;
    }

    public void setEdDiabetes(boolean edDiabetes) {
        this.edDiabetes = edDiabetes;
    }

    public boolean getEdVertigos() {
        return edVertigos;
    }

    public void setEdVertigos(boolean edVertigos) {
        this.edVertigos = edVertigos;
    }

    public boolean getEdRinitis() {
        return edRinitis;
    }

    public void setEdRinitis(boolean edRinitis) {
        this.edRinitis = edRinitis;
    }

    public boolean getEdBronquitis() {
        return edBronquitis;
    }

    public void setEdBronquitis(boolean edBronquitis) {
        this.edBronquitis = edBronquitis;
    }

    public boolean getEdHipertension() {
        return edHipertension;
    }

    public void setEdHipertension(boolean edHipertension) {
        this.edHipertension = edHipertension;
    }

    public boolean getEdEnfCardiacasCoronarias() {
        return edEnfCardiacasCoronarias;
    }

    public void setEdEnfCardiacasCoronarias(boolean edEnfCardiacasCoronarias) {
        this.edEnfCardiacasCoronarias = edEnfCardiacasCoronarias;
    }

    public boolean getEdTendinitis() {
        return edTendinitis;
    }

    public void setEdTendinitis(boolean edTendinitis) {
        this.edTendinitis = edTendinitis;
    }

    public boolean getEdStress() {
        return edStress;
    }

    public void setEdStress(boolean edStress) {
        this.edStress = edStress;
    }

    public boolean getEdLumbagia() {
        return edLumbagia;
    }

    public void setEdLumbagia(boolean edLumbagia) {
        this.edLumbagia = edLumbagia;
    }

    public boolean getEdUlceraEstomago() {
        return edUlceraEstomago;
    }

    public void setEdUlceraEstomago(boolean edUlceraEstomago) {
        this.edUlceraEstomago = edUlceraEstomago;
    }

    public boolean getEdGastritis() {
        return edGastritis;
    }

    public void setEdGastritis(boolean edGastritis) {
        this.edGastritis = edGastritis;
    }

    public boolean getEdReumatismo() {
        return edReumatismo;
    }

    public void setEdReumatismo(boolean edReumatismo) {
        this.edReumatismo = edReumatismo;
    }

    public boolean getEdNeurosis() {
        return edNeurosis;
    }

    public void setEdNeurosis(boolean edNeurosis) {
        this.edNeurosis = edNeurosis;
    }

    public boolean getEdDepresion() {
        return edDepresion;
    }

    public void setEdDepresion(boolean edDepresion) {
        this.edDepresion = edDepresion;
    }

    public boolean getEdVaricocele() {
        return edVaricocele;
    }

    public void setEdVaricocele(boolean edVaricocele) {
        this.edVaricocele = edVaricocele;
    }

    public String getExamenPreIngreso() {
        return examenPreIngreso;
    }

    public void setExamenPreIngreso(String examenPreIngreso) {
        this.examenPreIngreso = examenPreIngreso;
    }

    public String getExamenesperiodicos() {
        return examenesperiodicos;
    }

    public void setExamenesperiodicos(String examenesperiodicos) {
        this.examenesperiodicos = examenesperiodicos;
    }

    public String getExamPeriodicoMedico() {
        return examPeriodicoMedico;
    }

    public void setExamPeriodicoMedico(String examPeriodicoMedico) {
        this.examPeriodicoMedico = examPeriodicoMedico;
    }

    public boolean getMedicoEmpresa() {
        return medicoEmpresa;
    }

    public void setMedicoEmpresa(boolean medicoEmpresa) {
        this.medicoEmpresa = medicoEmpresa;
    }

    public boolean getExaminadoAusencia() {
        return examinadoAusencia;
    }

    public void setExaminadoAusencia(boolean examinadoAusencia) {
        this.examinadoAusencia = examinadoAusencia;
    }

    public boolean getRecibioCapacitacion() {
        return recibioCapacitacion;
    }

    public void setRecibioCapacitacion(boolean recibioCapacitacion) {
        this.recibioCapacitacion = recibioCapacitacion;
    }

    public Integer getIdAccidentes() {
        return idAccidentes;
    }

    public void setIdAccidentes(Integer idAccidentes) {
        this.idAccidentes = idAccidentes;
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
        if (!(object instanceof EstadoSaludEnfermedad)) {
            return false;
        }
        EstadoSaludEnfermedad other = (EstadoSaludEnfermedad) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.fcm.hcdl.model.EstadoSaludEnfermedad[ id=" + id + " ]";
    }
    
}
