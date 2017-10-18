CREATE DATABASE  IF NOT EXISTS `loja` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `loja`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: loja
-- ------------------------------------------------------
-- Server version	5.7.14

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
-- Table structure for table `tblcarrinho`
--

DROP TABLE IF EXISTS `tblcarrinho`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblcarrinho` (
  `idusuario` int(11) NOT NULL,
  `idproduto` int(11) DEFAULT NULL,
  `quantidade` int(11) DEFAULT NULL,
  PRIMARY KEY (`idusuario`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblcarrinho`
--

LOCK TABLES `tblcarrinho` WRITE;
/*!40000 ALTER TABLE `tblcarrinho` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblcarrinho` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblestoque`
--

DROP TABLE IF EXISTS `tblestoque`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblestoque` (
  `idestoque` int(11) NOT NULL AUTO_INCREMENT,
  `idproduto` int(11) NOT NULL,
  `quantidade` int(11) DEFAULT NULL,
  `fornecedor` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idestoque`,`idproduto`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblestoque`
--

LOCK TABLES `tblestoque` WRITE;
/*!40000 ALTER TABLE `tblestoque` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblestoque` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblpedido`
--

DROP TABLE IF EXISTS `tblpedido`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblpedido` (
  `idpedido` int(11) NOT NULL AUTO_INCREMENT,
  `idusuario` int(11) NOT NULL,
  `data` date DEFAULT NULL,
  `valortotal` varchar(45) DEFAULT NULL,
  `status` varchar(45) DEFAULT NULL,
  `pagamento` varchar(45) DEFAULT NULL,
  `enderecoentrega` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idpedido`,`idusuario`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblpedido`
--

LOCK TABLES `tblpedido` WRITE;
/*!40000 ALTER TABLE `tblpedido` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblpedido` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblpedidoproduto`
--

DROP TABLE IF EXISTS `tblpedidoproduto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblpedidoproduto` (
  `idpedido` int(11) NOT NULL AUTO_INCREMENT,
  `idproduto` int(11) NOT NULL,
  `quantidade` int(11) DEFAULT NULL,
  `precouni` varchar(45) DEFAULT NULL,
  `total` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idpedido`,`idproduto`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblpedidoproduto`
--

LOCK TABLES `tblpedidoproduto` WRITE;
/*!40000 ALTER TABLE `tblpedidoproduto` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblpedidoproduto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblproduto`
--

DROP TABLE IF EXISTS `tblproduto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblproduto` (
  `idproduto` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  `descricao` varchar(45) DEFAULT NULL,
  `preco` float DEFAULT NULL,
  PRIMARY KEY (`idproduto`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblproduto`
--

LOCK TABLES `tblproduto` WRITE;
/*!40000 ALTER TABLE `tblproduto` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblproduto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tblusuario`
--

DROP TABLE IF EXISTS `tblusuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tblusuario` (
  `idusuario` int(11) NOT NULL AUTO_INCREMENT,
  `nome` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `senha` varchar(45) DEFAULT NULL,
  `cpf` varchar(45) DEFAULT NULL,
  `endereco` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idusuario`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tblusuario`
--

LOCK TABLES `tblusuario` WRITE;
/*!40000 ALTER TABLE `tblusuario` DISABLE KEYS */;
/*!40000 ALTER TABLE `tblusuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-10-18 11:07:56
