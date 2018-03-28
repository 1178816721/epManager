/*
Navicat MySQL Data Transfer

Source Server         : qiangzi
Source Server Version : 50528
Source Host           : localhost:3306
Source Database       : ep

Target Server Type    : MYSQL
Target Server Version : 50528
File Encoding         : 65001

Date: 2018-03-19 21:27:51
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for attendance
-- ----------------------------
DROP TABLE IF EXISTS `attendance`;
CREATE TABLE `attendance` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `CREATEDATE` datetime DEFAULT NULL,
  `USER` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK8E01CEE96649993` (`USER`),
  CONSTRAINT `FK8E01CEE96649993` FOREIGN KEY (`USER`) REFERENCES `user` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of attendance
-- ----------------------------

-- ----------------------------
-- Table structure for person
-- ----------------------------
DROP TABLE IF EXISTS `person`;
CREATE TABLE `person` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `NAME` varchar(255) DEFAULT NULL,
  `NO` varchar(255) DEFAULT NULL,
  `AGE` int(11) DEFAULT NULL,
  `BIRTHDAY` varchar(255) DEFAULT NULL,
  `ADDRESS` varchar(255) DEFAULT NULL,
  `IDCARD` varchar(255) DEFAULT NULL,
  `GENDER` varchar(11) DEFAULT NULL,
  `INJOBTIME` datetime DEFAULT NULL,
  `CREATEDATE` datetime DEFAULT NULL,
  `JOBNAME` varchar(255) DEFAULT NULL,
  `FAMILY` varchar(255) DEFAULT NULL,
  `USER` int(11) DEFAULT NULL,
  `PHONE` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK8C768F556649993` (`USER`),
  CONSTRAINT `FK8C768F556649993` FOREIGN KEY (`USER`) REFERENCES `user` (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of person
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `USEN` varchar(255) DEFAULT NULL,
  `PSD` varchar(255) DEFAULT NULL,
  `AUT` int(11) DEFAULT NULL,
  `CREATEDATE` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------

-- ----------------------------
-- Table structure for wage
-- ----------------------------
DROP TABLE IF EXISTS `wage`;
CREATE TABLE `wage` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `BASEWAGE` float DEFAULT NULL,
  `CM` float DEFAULT NULL,
  `BONUS` float DEFAULT NULL,
  `CREATEDATE` datetime DEFAULT NULL,
  `USER` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK2889286649993` (`USER`),
  CONSTRAINT `FK2889286649993` FOREIGN KEY (`USER`) REFERENCES `user` (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of wage
-- ----------------------------
