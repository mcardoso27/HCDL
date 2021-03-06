CREATE DATABASE  IF NOT EXISTS `medicina` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `medicina`;
-- MySQL dump 10.13  Distrib 5.5.55, for debian-linux-gnu (x86_64)
--
-- Host: localhost    Database: medicina
-- ------------------------------------------------------
-- Server version	5.5.55-0+deb8u1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Accidente`
--

DROP TABLE IF EXISTS `Accidente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Accidente` (
  `idAccidentes` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(400) DEFAULT NULL,
  `fecha_inicio` date NOT NULL,
  `fecha_fin` date NOT NULL,
  `id_estadoSaludEnfermedad` int(11) DEFAULT NULL,
  PRIMARY KEY (`idAccidentes`),
  KEY `fk_Accidentes_1_idx` (`id_estadoSaludEnfermedad`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Accidente`
--

LOCK TABLES `Accidente` WRITE;
/*!40000 ALTER TABLE `Accidente` DISABLE KEYS */;
/*!40000 ALTER TABLE `Accidente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `AccionPreventiva`
--

DROP TABLE IF EXISTS `AccionPreventiva`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `AccionPreventiva` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `id_empleo` int(11) NOT NULL,
  `recibioCapacitacion` tinyint(1) NOT NULL,
  `recibioCapacitacionART` tinyint(1) NOT NULL,
  `ElementosOtorgados` varchar(256) NOT NULL,
  `ResposableSegTrabajo` enum('Nadie','Ingeniero','Licenciado','Persona sin formacion') NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_empleo` (`id_empleo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `AccionPreventiva`
--

LOCK TABLES `AccionPreventiva` WRITE;
/*!40000 ALTER TABLE `AccionPreventiva` DISABLE KEYS */;
/*!40000 ALTER TABLE `AccionPreventiva` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Empleo`
--

DROP TABLE IF EXISTS `Empleo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Empleo` (
  `id_empresa` int(11) NOT NULL,
  `id_empleado` int(11) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `fecha_inicio` date NOT NULL,
  `fecha_fin` date DEFAULT NULL,
  `cargo` text NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_empresa` (`id_empresa`),
  KEY `id_empleado` (`id_empleado`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Empleo`
--

LOCK TABLES `Empleo` WRITE;
/*!40000 ALTER TABLE `Empleo` DISABLE KEYS */;
INSERT INTO `Empleo` VALUES (1,6,1,'2014-03-01',NULL,'Primer Empleo cargado al sistema'),(1,6,4,'2014-03-01',NULL,'Primer Empleo cargado al sistema'),(1,6,5,'2014-06-02','2015-05-04','Desarrollador'),(1,6,6,'2014-06-02','2017-06-03','Desarrollador'),(1,6,10,'2017-04-13','2017-06-03','Desarrollador'),(1,6,11,'2017-04-11','2017-04-06','Desarrollador');
/*!40000 ALTER TABLE `Empleo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Empresa`
--

DROP TABLE IF EXISTS `Empresa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Empresa` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `Nombre` varchar(256) NOT NULL,
  `Direccion` varchar(256) NOT NULL,
  `Numero_empleados` int(11) NOT NULL,
  `Propiedad_capital` enum('Publica','Privada','Mixta') NOT NULL,
  `ART` tinyint(1) NOT NULL,
  `Nombre_ART` varchar(256) DEFAULT NULL,
  `id_Tipo_empresa` int(11) NOT NULL,
  `id_Localidad` int(11) NOT NULL,
  `Antiguedad` int(11) NOT NULL,
  `Medico` tinyint(1) NOT NULL,
  `EspecialistaHigiene` tinyint(1) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `id_Tipo_empresa` (`id_Tipo_empresa`),
  KEY `fk_Empresas_1_idx` (`id_Localidad`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Empresa`
--

LOCK TABLES `Empresa` WRITE;
/*!40000 ALTER TABLE `Empresa` DISABLE KEYS */;
INSERT INTO `Empresa` VALUES (1,'FCM-FICH-UNL','Paraje el Pozo',1500,'Publica',0,NULL,1,4,55,1,1),(2,'MC10 Construcciones','Av. Siempreviva 742',45,'Mixta',1,'Sancor',2,1,3,1,1),(7,'Serfe','Alguna Calle',30,'Privada',1,'San Cristobal Seguros',5,16,10,0,0),(8,'Metalúgica Pepe','Street View 89',8,'Mixta',1,'Uruguay Seguros',2,8,3,1,0),(9,'Todo por $2','Centenera 768',3,'Privada',1,'Uruguay Seguros',13,1,2,1,0);
/*!40000 ALTER TABLE `Empresa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Enfermedad`
--

DROP TABLE IF EXISTS `Enfermedad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Enfermedad` (
  `idEnfermedades` int(11) NOT NULL AUTO_INCREMENT,
  `codigoCIE10` varchar(45) NOT NULL,
  `familiarEnfermo` enum('Conyuge','Hijo','Padre','Madre','Otro') DEFAULT NULL,
  `fecha_inicio` date DEFAULT NULL,
  `fecha_fin` date DEFAULT NULL,
  `id_estadoSaludEnfermedad` int(11) NOT NULL,
  PRIMARY KEY (`idEnfermedades`),
  KEY `fk_Estados_salud_enfermedad_idx` (`id_estadoSaludEnfermedad`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Enfermedad`
--

LOCK TABLES `Enfermedad` WRITE;
/*!40000 ALTER TABLE `Enfermedad` DISABLE KEYS */;
/*!40000 ALTER TABLE `Enfermedad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `EstadoSaludEnfermedad`
--

DROP TABLE IF EXISTS `EstadoSaludEnfermedad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `EstadoSaludEnfermedad` (
  `id` int(11) NOT NULL,
  `id_persona` int(11) NOT NULL,
  `fecha_realizacion` datetime NOT NULL,
  `cantidad_cigarrillos` int(11) NOT NULL,
  `alcohol` tinyint(1) NOT NULL,
  `medicamentos` varchar(256) NOT NULL,
  `tranquilizantes` tinyint(1) NOT NULL,
  `peso` float NOT NULL,
  `estatura` float NOT NULL,
  `sint_AlteracionesEnVision` tinyint(1) NOT NULL,
  `sint_Decaimiento` tinyint(1) NOT NULL,
  `sint_PesadezEnPiernas` tinyint(1) NOT NULL,
  `sint_Insomnio` tinyint(1) NOT NULL,
  `sint_DificultadParaConcentrarse` tinyint(1) NOT NULL,
  `sint_Inapetencia` tinyint(1) NOT NULL,
  `sint_Llanto facil` tinyint(1) NOT NULL,
  `sint_Irritabilidad` tinyint(1) NOT NULL,
  `sint_PerdidaDememoria` tinyint(1) NOT NULL,
  `sint_Angustia` tinyint(1) NOT NULL,
  `sint_Acidez` tinyint(1) NOT NULL,
  `sint_Nauseas` tinyint(1) NOT NULL,
  `sint_Vomitos` tinyint(1) NOT NULL,
  `sint_Diarreas` tinyint(1) NOT NULL,
  `sint_Constipacion` tinyint(1) NOT NULL,
  `sint_TrastornosRespiratorios` tinyint(1) NOT NULL,
  `sint_Palpitaciones` tinyint(1) NOT NULL,
  `sint_Mareos` tinyint(1) NOT NULL,
  `sint_Afonia` tinyint(1) NOT NULL,
  `sint_AumentoDePeso` tinyint(1) NOT NULL,
  `sint_DisminucionDePeso` tinyint(1) NOT NULL,
  `sint_TosPermanente` tinyint(1) NOT NULL,
  `sint_HormigueoManosPies` tinyint(1) NOT NULL,
  `sint_DoloresArticulares` tinyint(1) NOT NULL,
  `sint_DoloresEspalda` tinyint(1) NOT NULL,
  `sint_DoloresCuello` tinyint(1) NOT NULL,
  `sint_DoloresLumbares` tinyint(1) NOT NULL,
  `sint_DolorMuscularGeneral` tinyint(1) NOT NULL,
  `sint_Convulsiones` tinyint(1) NOT NULL,
  `sint_Epilepsia` tinyint(1) NOT NULL,
  `ed_Luecemia` tinyint(1) NOT NULL,
  `ed_Disfonia` tinyint(1) NOT NULL,
  `ed_Miopia` tinyint(1) NOT NULL,
  `ed_Astigmatismo` tinyint(1) NOT NULL,
  `ed_Asma` tinyint(1) NOT NULL,
  `ed_Fibromialgia` tinyint(1) NOT NULL,
  `ed_Cistitis` tinyint(1) NOT NULL,
  `ed_Tumores` tinyint(1) NOT NULL,
  `ed_Alergia` tinyint(1) NOT NULL,
  `ed_Hipoacusia` tinyint(1) NOT NULL,
  `ed_Diabetes` tinyint(1) NOT NULL,
  `ed_Vertigos` tinyint(1) NOT NULL,
  `ed_Rinitis` tinyint(1) NOT NULL,
  `ed_Bronquitis` tinyint(1) NOT NULL,
  `ed_Hipertension` tinyint(1) NOT NULL,
  `ed_EnfCardiacasCoronarias` tinyint(1) NOT NULL,
  `ed_Tendinitis` tinyint(1) NOT NULL,
  `ed_Stress` tinyint(1) NOT NULL,
  `ed_Lumbagia` tinyint(1) NOT NULL,
  `ed_UlceraEstomago` tinyint(1) NOT NULL,
  `ed_Gastritis` tinyint(1) NOT NULL,
  `ed_Reumatismo` tinyint(1) NOT NULL,
  `ed_Neurosis` tinyint(1) NOT NULL,
  `ed_Depresion` tinyint(1) NOT NULL,
  `ed_Varicocele` tinyint(1) NOT NULL,
  `ExamenPreIngreso` enum('No Realizado','Apto','Apto con preexistencia','No apto') NOT NULL,
  `Examenesperiodicos` enum('Nunca','Anualmente','Algunas oportunidades') NOT NULL,
  `ExamPeriodicoMedico` enum('La ART','La Empresa','Ambos','Ninguno') NOT NULL,
  `MedicoEmpresa` tinyint(1) NOT NULL,
  `ExaminadoAusencia` tinyint(1) NOT NULL,
  `RecibioCapacitacion` tinyint(1) NOT NULL,
  `id_accidentes` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_persona` (`id_persona`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `EstadoSaludEnfermedad`
--

LOCK TABLES `EstadoSaludEnfermedad` WRITE;
/*!40000 ALTER TABLE `EstadoSaludEnfermedad` DISABLE KEYS */;
/*!40000 ALTER TABLE `EstadoSaludEnfermedad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Incidente`
--

DROP TABLE IF EXISTS `Incidente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Incidente` (
  `idIncidentes` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(400) DEFAULT NULL,
  `fecha_inicio` date DEFAULT NULL,
  `fecha_fin` date DEFAULT NULL,
  `fk_estadosSaludEnfermedad` int(11) NOT NULL,
  PRIMARY KEY (`idIncidentes`),
  KEY `fk_SaludEnfermedad_idx` (`fk_estadosSaludEnfermedad`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Incidente`
--

LOCK TABLES `Incidente` WRITE;
/*!40000 ALTER TABLE `Incidente` DISABLE KEYS */;
/*!40000 ALTER TABLE `Incidente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Localidad`
--

DROP TABLE IF EXISTS `Localidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Localidad` (
  `codigopostal` int(11) NOT NULL,
  `id_provincia` int(11) NOT NULL,
  `nombre` varchar(256) NOT NULL,
  `id_localidad` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id_localidad`),
  KEY `id_provincia` (`id_provincia`)
) ENGINE=InnoDB AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Localidad`
--

LOCK TABLES `Localidad` WRITE;
/*!40000 ALTER TABLE `Localidad` DISABLE KEYS */;
INSERT INTO `Localidad` VALUES (3100,1,'Paraná',1),(1234,4,'Capital Federal',4),(4321,2,'Rosario',5),(12345,1,'La Paz',6),(98865,4,'San Telmo',8),(34566,4,'Mar del Plata',9),(35678,9,'San Fernando del Valle de Catamarca',15),(3000,2,'Santa Fe de la Vera Cruz',16);
/*!40000 ALTER TABLE `Localidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PersistentsLogins`
--

DROP TABLE IF EXISTS `PersistentsLogins`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PersistentsLogins` (
  `username` varchar(64) NOT NULL,
  `series` varchar(64) NOT NULL,
  `token` varchar(64) NOT NULL,
  `last_used` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`series`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PersistentsLogins`
--

LOCK TABLES `PersistentsLogins` WRITE;
/*!40000 ALTER TABLE `PersistentsLogins` DISABLE KEYS */;
/*!40000 ALTER TABLE `PersistentsLogins` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Persona`
--

DROP TABLE IF EXISTS `Persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Persona` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombreyapellido` varchar(256) NOT NULL,
  `DNI` varchar(15) NOT NULL,
  `id_localidad` int(11) DEFAULT NULL,
  `direccion` varchar(256) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `sexo` enum('Masculino','Femenino','Otro') NOT NULL,
  `estado_civil` enum('Soltero','Casado','En pareja','Divorciado','Viudo') NOT NULL,
  `numero_hijos` int(11) NOT NULL,
  `DatosVarios` varchar(1024) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_Personas_1_idx` (`id_localidad`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Persona`
--

LOCK TABLES `Persona` WRITE;
/*!40000 ALTER TABLE `Persona` DISABLE KEYS */;
INSERT INTO `Persona` VALUES (6,'Martin Cardoso','36269234',1,'Pacto U Nacional 821','1992-01-27','Masculino','Soltero',0,'Estudiante de Ing Informática'),(15,'Arturito','234',6,'Nose 321','2017-04-05','Femenino','Soltero',2,'No se quien es'),(16,'María Magdalena','123456789',8,'Algun Lugar 123','1980-08-22','Femenino','Divorciado',2,'WarinkaTInka'),(17,'Gonza Lito','40234567',9,'Colon','1998-09-25','Masculino','Soltero',2,'Nada'),(18,'Sofía','36098234',1,'Perez Colman','2017-04-27','Femenino','Soltero',0,'La sofi'),(21,'María','1233456789',15,'Av Siempreviva','1935-06-03','Femenino','Soltero',3,'Se relaciona a los Simpsons'),(22,'Juana','23567',16,'De Arco','1941-09-04','Femenino','Viudo',0,'Saludos'),(23,'Jean Carlo','987654321',9,'Dirección 217','1951-08-04','Masculino','Viudo',0,'CantaAutor');
/*!40000 ALTER TABLE `Persona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Provincia`
--

DROP TABLE IF EXISTS `Provincia`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Provincia` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(256) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Provincia`
--

LOCK TABLES `Provincia` WRITE;
/*!40000 ALTER TABLE `Provincia` DISABLE KEYS */;
INSERT INTO `Provincia` VALUES (1,'Entre Ríos'),(2,'Santa Fe'),(4,'Buenos Aires (BSAS)'),(7,'Río Negro Ñandú'),(9,'Catamarca'),(10,'Mendoza'),(11,'Corrientes');
/*!40000 ALTER TABLE `Provincia` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `PuestoTrabajo`
--

DROP TABLE IF EXISTS `PuestoTrabajo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `PuestoTrabajo` (
  `id` int(11) NOT NULL,
  `id_empleo` int(11) NOT NULL,
  `rf_carga_termica` enum('Baja','Alta','Muy alta','No se presenta') NOT NULL,
  `rf_humedad` enum('Baja','Alta','Muy alta','No se presenta') NOT NULL,
  `rf_ruidos` enum('Baja','Alta','Muy alta','No se presenta') NOT NULL,
  `rf_vibraciones` enum('Baja','Alta','Muy alta','No se presenta') NOT NULL,
  `rf_gases` enum('Baja','Alta','Muy alta','No se presenta') NOT NULL,
  `rf_polvos` enum('Baja','Alta','Muy alta','No se presenta') NOT NULL,
  `rf_liquidos` enum('Baja','Alta','Muy alta','No se presenta') NOT NULL,
  `rf_ventilacion` enum('Muy buena','Buena','Regular','Mala') NOT NULL,
  `rf_iluminacion` enum('Muy buena','Buena','Regular','Mala') NOT NULL,
  `riesgosQuimicos` varchar(256) NOT NULL,
  `riesgosBiologicos` varchar(256) NOT NULL,
  `pym_EsfuerzoFisico` enum('Siempre','A veces','Nunca') NOT NULL,
  `pym_EsfuerzoVoz` enum('Siempre','A veces','Nunca') NOT NULL,
  `pym_EstardePie` enum('Siempre','A veces','Nunca') NOT NULL,
  `pym_SentadoIncomodo` enum('Siempre','A veces','Nunca') NOT NULL,
  `pym_PosicionIncomoda` enum('Siempre','A veces','Nunca') NOT NULL,
  `pym_MovRepetitivosCuerpo` enum('Siempre','A veces','Nunca') NOT NULL,
  `pym_MovRepetitivosBrazos` enum('Siempre','A veces','Nunca') NOT NULL,
  `pym_MovRepetitivosPiernas` enum('Siempre','A veces','Nunca') NOT NULL,
  `pym_Traslados` enum('Siempre','A veces','Nunca') NOT NULL,
  `ps_AtencionPublico` enum('Siempre','A veces','Nunca') NOT NULL,
  `ps_TareaOtrosTrabajadores` enum('Siempre','A veces','Nunca') NOT NULL,
  `ps_TurnosFijos` enum('Siempre','A veces','Nunca') NOT NULL,
  `ps_TurnosRotativos` enum('Siempre','A veces','Nunca') NOT NULL,
  `ps_DescansoDuranteTrabajo` enum('Siempre','A veces','Nunca') NOT NULL,
  `ps_TrabajaDomingos` enum('Siempre','A veces','Nunca') NOT NULL,
  `ps_TrabajaFeriados` enum('Siempre','A veces','Nunca') NOT NULL,
  `ps_HaySupervisor` enum('Siempre','A veces','Nunca') NOT NULL,
  `ps_TrabajoAburrido` enum('No','Si siempre','A veces') NOT NULL,
  `ps_SienteMalTrabajar` enum('No','Si siempre','A veces') NOT NULL,
  `ps_IniciativasDesempeñoTrabajo` enum('No','Si siempre','A veces') NOT NULL,
  `ps_ParteDeLaEmpresa` enum('No','Si siempre','A veces') NOT NULL,
  `ps_Agotado` enum('No','Si siempre','A veces') NOT NULL,
  `ps_Agresivo` enum('No','Si siempre','A veces') NOT NULL,
  `ps_Tensionado` enum('No','Si siempre','A veces') NOT NULL,
  `ps_Satisfecho` enum('No','Si siempre','A veces') NOT NULL,
  `ps_Nervioso` enum('No','Si siempre','A veces') NOT NULL,
  `ps_Contento` enum('No','Si siempre','A veces') NOT NULL,
  `ps_Indiferente` enum('No','Si siempre','A veces') NOT NULL,
  `ps_SuperioresExigenDemas` enum('No','Si siempre','A veces') NOT NULL,
  `ps_CompanierosAgreden` enum('No','Si siempre','A veces') NOT NULL,
  `ps_TareasGranResponsabilidad` enum('No','Si siempre','A veces') NOT NULL,
  `ps_NoReconocimientoSuperiores` enum('No','Si siempre','A veces') NOT NULL,
  `ps_NoReconocimientoEmpresa` enum('No','Si siempre','Si a veces') NOT NULL,
  `ps_NoReconocimientoCompanieros` enum('No','Si siempre','Si a veces') NOT NULL,
  `as_ReconocimientoSocial` tinyint(1) NOT NULL,
  `as_ImportanciaSocial` tinyint(1) NOT NULL,
  `as_SueldoInsuficiente` enum('A veces','Frecuentemente','No') NOT NULL,
  `as_LeeLibros` enum('A veces','Frecuentemente','No') NOT NULL,
  `as_SinFinLucro` enum('A veces','Frecuentemente','No') NOT NULL,
  `as_VerTelevision` enum('A veces','Frecuentemente','No') NOT NULL,
  `as_AmadeCasa` enum('A veces','Frecuentemente','No') NOT NULL,
  `as_PracticaDeportes` enum('A veces','Frecuentemente','No') NOT NULL,
  `as_AltoRiesgoLaboral` varchar(256) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_empleo` (`id_empleo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `PuestoTrabajo`
--

LOCK TABLES `PuestoTrabajo` WRITE;
/*!40000 ALTER TABLE `PuestoTrabajo` DISABLE KEYS */;
/*!40000 ALTER TABLE `PuestoTrabajo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `SectorTrabajo`
--

DROP TABLE IF EXISTS `SectorTrabajo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `SectorTrabajo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `idEmpleo` int(11) NOT NULL,
  `Nombre` varchar(100) NOT NULL,
  `estadoEdificio` enum('Muy Bueno','Bueno','Regular','Malo','No posee','Desconoce') DEFAULT NULL,
  `estadoPisos` enum('Muy Bueno','Bueno','Regular','Malo','No posee','Desconoce') NOT NULL,
  `estadoRampas` enum('Muy Bueno','Bueno','Regular','Malo','No posee','Desconoce') NOT NULL,
  `estadoAscensores` enum('Muy Bueno','Bueno','Regular','Malo','No posee','Desconoce') NOT NULL,
  `estadoSalidaEmergencia` enum('Muy Bueno','Bueno','Regular','Malo','No posee','Desconoce') NOT NULL,
  `estadoBanios` enum('Muy Bueno','Bueno','Regular','Malo','No posee','Desconoce') NOT NULL,
  `estadoInstElectricas` enum('Muy bueno','Bueno','Regular','Malo','No posee','Desconoce') NOT NULL,
  `estadoInstAgua` enum('Muy bueno','Bueno','Regular','Malo','No posee','Desconoce') NOT NULL,
  `estadoInstGas` enum('Muy bueno','Bueno','Regular','Malo','No posee','Desconoce') NOT NULL,
  `ordenSector` enum('Muy bueno','Bueno','Regular','Malo','No posee','Desconoce') NOT NULL,
  `limpiezaSector` enum('Muy bueno','Bueno','Regular','Malo','No posee','Desconoce') NOT NULL,
  `señalizacionSector` enum('Muy bueno','Bueno','Regular','Malo','No posee','Desconoce') NOT NULL,
  `sistContraIncendio` enum('Muy bueno','Bueno','Regular','Malo','No posee','Desconoce') NOT NULL,
  `mueblesSector` enum('Muy bueno','Bueno','Regular','Malo','No posee','Desconoce') NOT NULL,
  `maquinasSector` enum('Muy bueno','Bueno','Regular','Malo','No posee','Desconoce') NOT NULL,
  `herramientasSector` enum('Muy bueno','Bueno','Regular','Malo','No posee','Desconoce') NOT NULL,
  `ordenamientoSector` enum('Muy bueno','Bueno','Regular','Malo','No posee','Desconoce') NOT NULL,
  `ambTemperatura` enum('Si','No','Desconoce') NOT NULL,
  `ambHumedad` enum('Si','No','Desconoce') NOT NULL,
  `ambRuido` enum('Si','No','Desconoce') NOT NULL,
  `ambVibraciones` enum('Si','No','Desconoce') NOT NULL,
  `ambPolvos` enum('Si','No','Desconoce') NOT NULL,
  `ambGases` enum('Si','No','Desconoce') NOT NULL,
  `ambLiquidos` enum('Si','No','Desconoce') NOT NULL,
  `ambAerosoles` enum('Si','No','Desconoce') NOT NULL,
  `ambMaterialBiologico` enum('Si','No','Desconoce') NOT NULL,
  `consideraciones` varchar(256) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `idEmpleo` (`idEmpleo`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `SectorTrabajo`
--

LOCK TABLES `SectorTrabajo` WRITE;
/*!40000 ALTER TABLE `SectorTrabajo` DISABLE KEYS */;
/*!40000 ALTER TABLE `SectorTrabajo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Siniestro`
--

DROP TABLE IF EXISTS `Siniestro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `Siniestro` (
  `idSiniestros` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(300) DEFAULT NULL,
  `fecha_inicio` date NOT NULL,
  `fecha_fin` date NOT NULL,
  `id_estadoSaludEnfermedad` int(11) DEFAULT NULL,
  PRIMARY KEY (`idSiniestros`),
  KEY `fk_estadosSaludEnfermedad_idx` (`id_estadoSaludEnfermedad`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Siniestro`
--

LOCK TABLES `Siniestro` WRITE;
/*!40000 ALTER TABLE `Siniestro` DISABLE KEYS */;
/*!40000 ALTER TABLE `Siniestro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `TipoEmpresa`
--

DROP TABLE IF EXISTS `TipoEmpresa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `TipoEmpresa` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(128) NOT NULL,
  `descripcion` varchar(256) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `TipoEmpresa`
--

LOCK TABLES `TipoEmpresa` WRITE;
/*!40000 ALTER TABLE `TipoEmpresa` DISABLE KEYS */;
INSERT INTO `TipoEmpresa` VALUES (1,'Salud','Empresa dedicada a la salud ocupacional'),(2,'Metalúrgica','Empresa dedicada a la fabricación de elementos utilizando distintos tipos de metales. Fabricación de puertas, ventanas, abeturas en general y tornería de piezas metálicas para distintos tipos de cosas.'),(4,'De servicios','Empresa dedicada a brindas servicios de internet'),(5,'Software Factory','Empresa dedicada al desarrollo de software'),(7,'Indumentaria','Empresa dedicada a la venta de ropa'),(9,'Farmaceutica','Empresa dedicada a la venta de medicamentos'),(13,'Recreativa','Empresa dedicada a la recreación'),(14,'Farmacéutica','Empresa dedicada a la venta de fármacos'),(15,'Multinacional','Empresa que vende de todo en todos lados.');
/*!40000 ALTER TABLE `TipoEmpresa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `User`
--

DROP TABLE IF EXISTS `User`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `User` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `sso_id` varchar(30) NOT NULL,
  `password` varchar(100) NOT NULL,
  `first_name` varchar(30) NOT NULL,
  `last_name` varchar(30) NOT NULL,
  `email` varchar(30) NOT NULL,
  `idEmpresa` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `sso_id` (`sso_id`),
  KEY `fk_User_Empresas1_idx` (`idEmpresa`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `User`
--

LOCK TABLES `User` WRITE;
/*!40000 ALTER TABLE `User` DISABLE KEYS */;
INSERT INTO `User` VALUES (1,'sam','$2a$10$4eqIF5s/ewJwHK1p8lqlFOEm2QIA0S8g6./Lok.pQxqcxaBZYChRm','Sam','Smith','samy@xyz.com',NULL),(2,'mcardoso','$2a$10$vi4QwYbPMF.zSh8OnEAcr.l0ofFYrJrTnGj2xvqeilCwM5Sxb4Mxm','martin','cardoso','mcardoso821@gmail.com',NULL);
/*!40000 ALTER TABLE `User` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `UserProfile`
--

DROP TABLE IF EXISTS `UserProfile`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `UserProfile` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `type` varchar(30) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `type` (`type`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `UserProfile`
--

LOCK TABLES `UserProfile` WRITE;
/*!40000 ALTER TABLE `UserProfile` DISABLE KEYS */;
INSERT INTO `UserProfile` VALUES (2,'ADMIN'),(3,'DBA'),(1,'USER');
/*!40000 ALTER TABLE `UserProfile` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `UserUserProfile`
--

DROP TABLE IF EXISTS `UserUserProfile`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `UserUserProfile` (
  `user_id` bigint(20) NOT NULL,
  `user_profile_id` bigint(20) NOT NULL,
  PRIMARY KEY (`user_id`,`user_profile_id`),
  KEY `FK_USER_PROFILE` (`user_profile_id`),
  CONSTRAINT `FK_APP_USER` FOREIGN KEY (`user_id`) REFERENCES `User` (`id`),
  CONSTRAINT `FK_USER_PROFILE` FOREIGN KEY (`user_profile_id`) REFERENCES `UserProfile` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `UserUserProfile`
--

LOCK TABLES `UserUserProfile` WRITE;
/*!40000 ALTER TABLE `UserUserProfile` DISABLE KEYS */;
INSERT INTO `UserUserProfile` VALUES (1,2),(2,2);
/*!40000 ALTER TABLE `UserUserProfile` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-07-23 12:24:09
