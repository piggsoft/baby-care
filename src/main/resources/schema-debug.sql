-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        10.1.12-MariaDB - mariadb.org binary distribution
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.1.0.4867
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- 导出 baby_care 的数据库结构
DROP DATABASE IF EXISTS `baby_care`;
CREATE DATABASE IF NOT EXISTS `baby_care` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;
USE `baby_care`;


-- 导出  表 baby_care.action 结构
DROP TABLE IF EXISTS `action`;
CREATE TABLE IF NOT EXISTS `action` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `baby_id` int(11) DEFAULT NULL,
  `action_type` char(50) DEFAULT NULL,
  `action_tm` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK_action_baby` (`baby_id`),
  CONSTRAINT `FK_action_baby` FOREIGN KEY (`baby_id`) REFERENCES `baby` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  baby_care.action 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `action` DISABLE KEYS */;
/*!40000 ALTER TABLE `action` ENABLE KEYS */;


-- 导出  表 baby_care.baby 结构
DROP TABLE IF EXISTS `baby`;
CREATE TABLE IF NOT EXISTS `baby` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `birthday` datetime NOT NULL,
  `sex` char(5) NOT NULL,
  `create_tm` datetime NOT NULL,
  `update_tm` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  baby_care.baby 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `baby` DISABLE KEYS */;
/*!40000 ALTER TABLE `baby` ENABLE KEYS */;


-- 导出  表 baby_care.relation_ship 结构
DROP TABLE IF EXISTS `relation_ship`;
CREATE TABLE IF NOT EXISTS `relation_ship` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `baby_id` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `relationship_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK__baby` (`baby_id`),
  KEY `FK__user` (`user_id`),
  CONSTRAINT `FK__baby` FOREIGN KEY (`baby_id`) REFERENCES `baby` (`id`),
  CONSTRAINT `FK__user` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 正在导出表  baby_care.relation_ship 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `relation_ship` DISABLE KEYS */;
/*!40000 ALTER TABLE `relation_ship` ENABLE KEYS */;


-- 导出  表 baby_care.user 结构
DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `phone` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `create_tm` datetime NOT NULL,
  `update_tm` datetime DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `Index 2` (`phone`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- 正在导出表  baby_care.user 的数据：~0 rows (大约)
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
