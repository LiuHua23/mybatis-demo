/*
Navicat MySQL Data Transfer

Source Server         : mybatis
Source Server Version : 50537
Source Host           : localhost:3306
Source Database       : mybatis_demo

Target Server Type    : MYSQL
Target Server Version : 50537
File Encoding         : 65001

Date: 2018-05-10 12:47:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for students
-- ----------------------------
DROP TABLE IF EXISTS `students`;
CREATE TABLE `students` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `number` varchar(50) DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `number` (`number`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
