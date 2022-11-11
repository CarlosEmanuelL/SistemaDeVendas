-- MySQL dump 10.13  Distrib 8.0.29, for Linux (x86_64)
--
-- Host: localhost    Database: sistemavendas
-- ------------------------------------------------------
-- Server version	8.0.31-0ubuntu0.22.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `id_cliente` int NOT NULL AUTO_INCREMENT,
  `nome_cliente` varchar(45) NOT NULL,
  `endereco_cliente` varchar(45) NOT NULL,
  `telefone_cliente` varchar(45) NOT NULL,
  `cep_cliente` varchar(45) NOT NULL,
  PRIMARY KEY (`id_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT INTO `cliente` VALUES (2,'Carlos Emanuel','672 Roslyn Cliff','(11) 66561-4835','60410-522'),(3,'Caio Luis','20641 Celia Canyon','(11) 49753-0857','58400-700'),(4,'Emerson','695 Bryana Street','(11) 55062-2258','76801-462'),(5,'André','199 Vance Stravenue','(11) 34548-3421','40335-385'),(6,'Jorge','R41363 Eveline Union','(11) 26937-6322','71020-241');
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `fornecedor`
--

DROP TABLE IF EXISTS `fornecedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `fornecedor` (
  `id_fornecedor` int NOT NULL AUTO_INCREMENT,
  `nome_fornecedor` varchar(45) NOT NULL,
  `cnpj_fornecedor` varchar(45) NOT NULL,
  `telefone_fornecedor` varchar(45) NOT NULL,
  `localidade_fornecedor` varchar(45) NOT NULL,
  PRIMARY KEY (`id_fornecedor`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `fornecedor`
--

LOCK TABLES `fornecedor` WRITE;
/*!40000 ALTER TABLE `fornecedor` DISABLE KEYS */;
INSERT INTO `fornecedor` VALUES (4,'tech Bytes','10.411.993/0001-48','(86) 79765-7671','bastin'),(5,'tech Culture','53.143.530/0001-55','(86) 75130-3733','reeyfield'),(6,'Tiptop tech','83.822.813/0001-94','(86) 44347-3442','chafast'),(7,'Warrior Computador','38.788.367/0001-94','(86) 51913-5467','flochester'),(8,'OneClick Computador','26.665.561/0001-01','(86) 58202-3289','pefron');
/*!40000 ALTER TABLE `fornecedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `marca`
--

DROP TABLE IF EXISTS `marca`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `marca` (
  `id_marca` int NOT NULL AUTO_INCREMENT,
  `nome_marca` varchar(45) NOT NULL,
  `codigo_marca` varchar(45) NOT NULL,
  PRIMARY KEY (`id_marca`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marca`
--

LOCK TABLES `marca` WRITE;
/*!40000 ALTER TABLE `marca` DISABLE KEYS */;
INSERT INTO `marca` VALUES (6,'Logic Digital','012938109812'),(7,'Digital Watcher','3910830298139'),(8,'Digital Millions','831038209890'),(9,'Gemini Digital','0919387210370'),(10,'FastForward Digital','193871893278');
/*!40000 ALTER TABLE `marca` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `produto`
--

DROP TABLE IF EXISTS `produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `produto` (
  `id_produto` int NOT NULL AUTO_INCREMENT,
  `nome_produto` varchar(45) NOT NULL,
  `quant_produto` int NOT NULL,
  `cod_produto` varchar(60) NOT NULL,
  `valor_compra` float NOT NULL,
  `valor_venda` int NOT NULL,
  `id_marca` int DEFAULT NULL,
  `id_fornecedor` int DEFAULT NULL,
  PRIMARY KEY (`id_produto`)
) ENGINE=InnoDB AUTO_INCREMENT=28 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produto`
--

LOCK TABLES `produto` WRITE;
/*!40000 ALTER TABLE `produto` DISABLE KEYS */;
INSERT INTO `produto` VALUES (23,'Mouse',150,'2098371893',150,200,NULL,NULL),(24,'Teclado',30,'1928390123',300,450,NULL,NULL),(25,'Headset',193,'32121873112',150,400,NULL,NULL),(26,'Roteador',233,'2192839218',310,430,NULL,NULL),(27,'Monitor',56,'2329839184',800,1350,NULL,NULL);
/*!40000 ALTER TABLE `produto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `id_usuario` int NOT NULL AUTO_INCREMENT,
  `usuario_usuario` varchar(60) NOT NULL,
  `senha_usuario` varchar(60) NOT NULL,
  `nome_usuario` varchar(45) NOT NULL,
  `matricula_usuario` varchar(45) NOT NULL,
  `email_usuario` varchar(45) NOT NULL,
  PRIMARY KEY (`id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (6,'carlos','carlos123','Carlos Emanuel','21303819233','salah_al-din@zohomail.com'),(7,'caio','caio123','Caio','1283712321','charlemagne@gmail.com'),(8,'emerson','emerson123','Emerson','1283721893','flavius_odoacer@zohomail.com'),(9,'francisco','francisco123','Francisco','12983913213','winston_churchill@aol.com'),(10,'João','joão123','João','1208329893','toyotomi_hideyoshi@mail.com');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venda`
--

DROP TABLE IF EXISTS `venda`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `venda` (
  `id_venda` int NOT NULL AUTO_INCREMENT,
  `cliente_venda` varchar(45) NOT NULL,
  `desconto_venda` float DEFAULT NULL,
  `forma_pagamento_venda` varchar(45) NOT NULL,
  `valor_pago_venda` float NOT NULL,
  `total_produto_venda` float NOT NULL,
  `total_venda` float NOT NULL,
  `troco_venda` float NOT NULL,
  PRIMARY KEY (`id_venda`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venda`
--

LOCK TABLES `venda` WRITE;
/*!40000 ALTER TABLE `venda` DISABLE KEYS */;
/*!40000 ALTER TABLE `venda` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `venda_cache`
--

DROP TABLE IF EXISTS `venda_cache`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `venda_cache` (
  `id_venda_cache` int NOT NULL AUTO_INCREMENT,
  `produto_venda_cache` varchar(45) DEFAULT NULL,
  `quantidade_venda_cache` int DEFAULT NULL,
  `preco_venda_cache` float DEFAULT NULL,
  PRIMARY KEY (`id_venda_cache`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `venda_cache`
--

LOCK TABLES `venda_cache` WRITE;
/*!40000 ALTER TABLE `venda_cache` DISABLE KEYS */;
/*!40000 ALTER TABLE `venda_cache` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping events for database 'sistemavendas'
--

--
-- Dumping routines for database 'sistemavendas'
--
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-11-11 11:44:04
