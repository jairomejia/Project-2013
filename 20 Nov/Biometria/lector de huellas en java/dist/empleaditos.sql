-- phpMyAdmin SQL Dump
-- version 3.2.4
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jul 15, 2010 at 05:46 a.m.
-- Server version: 5.1.41
-- PHP Version: 5.3.1

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `empleaditos`
--
DROP DATABASE `empleaditos`;
CREATE DATABASE `empleaditos` DEFAULT CHARACTER SET utf8 COLLATE utf8_spanish_ci;
USE `empleaditos`;

-- --------------------------------------------------------

--
-- Table structure for table `anomalia`
--

DROP TABLE IF EXISTS `anomalia`;
CREATE TABLE IF NOT EXISTS `anomalia` (
  `idAnomalia` int(11) NOT NULL AUTO_INCREMENT,
  `Empleado` bigint(20) NOT NULL,
  `Fecha` datetime NOT NULL,
  `Descripcion` varchar(45) COLLATE utf8_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`idAnomalia`),
  KEY `anomaliaEmpleado` (`Empleado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `empleado`
--

DROP TABLE IF EXISTS `empleado`;
CREATE TABLE IF NOT EXISTS `empleado` (
  `idEmpleado` bigint(20) NOT NULL,
  `nombres` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `apellidos` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `fechaNacimiento` date NOT NULL,
  `direccion` varchar(200) COLLATE utf8_spanish_ci NOT NULL,
  `telefono` bigint(20) NOT NULL,
  `email` varchar(100) COLLATE utf8_spanish_ci NOT NULL,
  `tipoSangre` varchar(2) COLLATE utf8_spanish_ci NOT NULL,
  `vinculacion` int(11) NOT NULL,
  `foto` blob NOT NULL,
  `rh` char(1) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`idEmpleado`),
  KEY `vinculacionEmpleado` (`vinculacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Table structure for table `familiar`
--

DROP TABLE IF EXISTS `familiar`;
CREATE TABLE IF NOT EXISTS `familiar` (
  `idFamiliar` int(11) NOT NULL,
  `nombres` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `apellidos` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `fechaNacimiento` date NOT NULL,
  `parentesco` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `empleado` bigint(20) NOT NULL,
  PRIMARY KEY (`idFamiliar`),
  KEY `empleadoFamiliar` (`empleado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci;

-- --------------------------------------------------------

--
-- Table structure for table `historialaboral`
--

DROP TABLE IF EXISTS `historialaboral`;
CREATE TABLE IF NOT EXISTS `historialaboral` (
  `idHistoriaLaboral` int(11) NOT NULL AUTO_INCREMENT,
  `empleado` bigint(20) NOT NULL,
  `cargo` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `fechaInicio` date NOT NULL,
  `fechaSalida` date DEFAULT NULL,
  `salarioBase` int(11) NOT NULL,
  PRIMARY KEY (`idHistoriaLaboral`),
  KEY `CargoEmpleado` (`empleado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `horario`
--

DROP TABLE IF EXISTS `horario`;
CREATE TABLE IF NOT EXISTS `horario` (
  `idHorarios` int(11) NOT NULL AUTO_INCREMENT,
  `nombreHorario` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `horaEntrada` time NOT NULL,
  `horaSalida` time NOT NULL,
  PRIMARY KEY (`idHorarios`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `huellas`
--

DROP TABLE IF EXISTS `huellas`;
CREATE TABLE IF NOT EXISTS `huellas` (
  `idHuellas` int(11) NOT NULL AUTO_INCREMENT,
  `Empleado` bigint(20) NOT NULL,
  `Huella` blob NOT NULL,
  `descripcion` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  PRIMARY KEY (`idHuellas`),
  KEY `huellaEmpleado` (`Empleado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `registro`
--

DROP TABLE IF EXISTS `registro`;
CREATE TABLE IF NOT EXISTS `registro` (
  `idRegistro` int(11) NOT NULL AUTO_INCREMENT,
  `horaEntrada` datetime NOT NULL,
  `horaSalida` datetime DEFAULT NULL,
  PRIMARY KEY (`idRegistro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `salario`
--

DROP TABLE IF EXISTS `salario`;
CREATE TABLE IF NOT EXISTS `salario` (
  `idsalario` int(11) NOT NULL AUTO_INCREMENT,
  `codEmpleado` bigint(20) NOT NULL,
  `fecha` date NOT NULL,
  `valorBruto` int(11) NOT NULL,
  `valorNeto` int(11) NOT NULL,
  `salud` int(11) NOT NULL,
  `pension` int(11) NOT NULL,
  `accionJudicial` int(11) NOT NULL,
  `cooperativa` int(11) NOT NULL,
  `prestaciones` int(11) NOT NULL,
  `extras` int(11) NOT NULL,
  `adicionales` int(11) NOT NULL,
  `cesantias` int(11) NOT NULL,
  `primas` int(11) NOT NULL,
  `bonificaciones` int(11) NOT NULL,
  PRIMARY KEY (`idsalario`),
  KEY `salarioEmpleado` (`codEmpleado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `turnos`
--

DROP TABLE IF EXISTS `turnos`;
CREATE TABLE IF NOT EXISTS `turnos` (
  `idTurnos` int(11) NOT NULL AUTO_INCREMENT,
  `Horario` int(11) NOT NULL,
  `Registro` int(11) NOT NULL,
  `Empleado` bigint(20) NOT NULL,
  `Fecha` date NOT NULL,
  PRIMARY KEY (`idTurnos`),
  KEY `turnosHorario` (`Horario`),
  KEY `turnosRegistro` (`Registro`),
  KEY `turnosEmpleado` (`Empleado`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Table structure for table `vinculacion`
--

DROP TABLE IF EXISTS `vinculacion`;
CREATE TABLE IF NOT EXISTS `vinculacion` (
  `idVinculacion` int(11) NOT NULL AUTO_INCREMENT,
  `descripcion` varchar(45) COLLATE utf8_spanish_ci NOT NULL,
  `prestaciones` tinyint(1) NOT NULL,
  PRIMARY KEY (`idVinculacion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=1 ;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `anomalia`
--
ALTER TABLE `anomalia`
  ADD CONSTRAINT `anomaliaEmpleado` FOREIGN KEY (`Empleado`) REFERENCES `empleado` (`idEmpleado`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_anomalia_Empleado` FOREIGN KEY (`Empleado`) REFERENCES `empleado` (`idEmpleado`);

--
-- Constraints for table `empleado`
--
ALTER TABLE `empleado`
  ADD CONSTRAINT `FK_empleado_vinculacion` FOREIGN KEY (`vinculacion`) REFERENCES `vinculacion` (`idVinculacion`),
  ADD CONSTRAINT `vinculacionEmpleado` FOREIGN KEY (`vinculacion`) REFERENCES `vinculacion` (`idVinculacion`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `familiar`
--
ALTER TABLE `familiar`
  ADD CONSTRAINT `empleadoFamiliar` FOREIGN KEY (`empleado`) REFERENCES `empleado` (`idEmpleado`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_familiar_empleado` FOREIGN KEY (`empleado`) REFERENCES `empleado` (`idEmpleado`);

--
-- Constraints for table `historialaboral`
--
ALTER TABLE `historialaboral`
  ADD CONSTRAINT `CargoEmpleado` FOREIGN KEY (`empleado`) REFERENCES `empleado` (`idEmpleado`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `FK_historialaboral_empleado` FOREIGN KEY (`empleado`) REFERENCES `empleado` (`idEmpleado`);

--
-- Constraints for table `huellas`
--
ALTER TABLE `huellas`
  ADD CONSTRAINT `FK_huellas_Empleado` FOREIGN KEY (`Empleado`) REFERENCES `empleado` (`idEmpleado`),
  ADD CONSTRAINT `huellaEmpleado` FOREIGN KEY (`Empleado`) REFERENCES `empleado` (`idEmpleado`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `salario`
--
ALTER TABLE `salario`
  ADD CONSTRAINT `FK_salario_codEmpleado` FOREIGN KEY (`codEmpleado`) REFERENCES `empleado` (`idEmpleado`),
  ADD CONSTRAINT `salarioEmpleado` FOREIGN KEY (`codEmpleado`) REFERENCES `empleado` (`idEmpleado`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `turnos`
--
ALTER TABLE `turnos`
  ADD CONSTRAINT `FK_turnos_Empleado` FOREIGN KEY (`Empleado`) REFERENCES `empleado` (`idEmpleado`),
  ADD CONSTRAINT `FK_turnos_Horario` FOREIGN KEY (`Horario`) REFERENCES `horario` (`idHorarios`),
  ADD CONSTRAINT `FK_turnos_Registro` FOREIGN KEY (`Registro`) REFERENCES `registro` (`idRegistro`),
  ADD CONSTRAINT `turnosEmpleado` FOREIGN KEY (`Empleado`) REFERENCES `empleado` (`idEmpleado`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `turnosHorario` FOREIGN KEY (`Horario`) REFERENCES `horario` (`idHorarios`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `turnosRegistro` FOREIGN KEY (`Registro`) REFERENCES `registro` (`idRegistro`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
