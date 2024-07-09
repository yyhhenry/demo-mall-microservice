/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.7.32-log : Database - mall
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`mall` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `mall`;

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `admin` */

insert  into `admin`(`id`,`name`,`password`) values (1,'admin','admin');

/*Table structure for table `category` */

DROP TABLE IF EXISTS `category`;

CREATE TABLE `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `category` */

insert  into `category`(`id`,`name`) values (1,'手机'),(2,'电脑');

/*Table structure for table `item` */

DROP TABLE IF EXISTS `item`;

CREATE TABLE `item` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `category_id` int(11) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `price` int(10) DEFAULT NULL,
  `image` varchar(255) DEFAULT NULL,
  `item_desc` varchar(5000) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `item` */

insert  into `item`(`id`,`category_id`,`name`,`price`,`image`,`item_desc`) values (1,1,'mate10',1000,'http://bj.tedu.cn/img/202204/1648870722075.jpg','华为手机'),(2,1,'mate20',2000,'http://gz.tedu.cn/img/202204/1648804998921.jpg','华为手机'),(3,2,'thinkpad1',10000,'http://gz.tedu.cn/img/202204/1648804998921.jpg','电脑'),(4,2,'thinkpad2',2000,'http://gz.tedu.cn/img/202204/1648804998921.jpg','电脑'),(5,1,'mate30',900,'http://gz.tedu.cn/img/202204/1648804998921.jpg','华为手机'),(6,1,'mate40',900,'http://gz.tedu.cn/img/202204/1648804998921.jpg','华为手机'),(7,1,'mate50',900,'http://gz.tedu.cn/img/202204/1648804998921.jpg','华为手机'),(8,1,'mate60',900,'http://gz.tedu.cn/img/202204/1648804998921.jpg','华为手机');

/*Table structure for table `mall_order` */

DROP TABLE IF EXISTS `mall_order`;

CREATE TABLE `mall_order` (
  `order_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `total` int(11) DEFAULT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `mall_order` */

insert  into `mall_order`(`order_id`,`user_id`,`total`) values (1,1,1000),(2,2,2000);

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8 ROW_FORMAT=COMPACT;

/*Data for the table `user` */

insert  into `user`(`id`,`name`,`password`) values (1,'a','a'),(2,'user1','user1'),(3,'user2','1'),(4,'user3','user3'),(5,'user5','user5'),(6,'user9','123'),(7,'22','22');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
