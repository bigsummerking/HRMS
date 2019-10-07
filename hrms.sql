/*
Navicat MySQL Data Transfer

Source Server         : link
Source Server Version : 80013
Source Host           : localhost:3306
Source Database       : hrms

Target Server Type    : MYSQL
Target Server Version : 80013
File Encoding         : 65001

Date: 2019-10-06 23:16:17
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `aleave`
-- ----------------------------
DROP TABLE IF EXISTS `aleave`;
CREATE TABLE `aleave` (
  `aleave_id` int(20) NOT NULL AUTO_INCREMENT,
  `job_id` int(6) NOT NULL,
  `btime` date NOT NULL,
  `etime` date NOT NULL,
  `reason` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `examine` int(1) NOT NULL,
  PRIMARY KEY (`aleave_id`),
  KEY `FK_AL_TO_EP` (`job_id`) USING BTREE,
  CONSTRAINT `FK_AL_TO_EP` FOREIGN KEY (`job_id`) REFERENCES `employees` (`job_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of aleave
-- ----------------------------

-- ----------------------------
-- Table structure for `check`
-- ----------------------------
DROP TABLE IF EXISTS `check`;
CREATE TABLE `check` (
  `check_id` int(11) NOT NULL AUTO_INCREMENT,
  `job_id` int(6) NOT NULL,
  `opentime` datetime NOT NULL,
  `closetime` datetime DEFAULT NULL,
  `state` int(1) NOT NULL,
  PRIMARY KEY (`check_id`) USING BTREE,
  KEY `FK_CE_TO_EP` (`job_id`) USING BTREE,
  CONSTRAINT `FK_CE_TO_EP` FOREIGN KEY (`job_id`) REFERENCES `employees` (`job_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of check
-- ----------------------------

-- ----------------------------
-- Table structure for `department`
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department` (
  `department_id` int(20) NOT NULL AUTO_INCREMENT,
  `department` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `employee_count` int(10) DEFAULT '0',
  `manager` varchar(20) DEFAULT NULL,
  `state` int(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`department_id`),
  KEY `FK_DP` (`department`) USING BTREE,
  KEY `DEPARTMENTID` (`department_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES ('1', '工程部', '1', '大明', '1');
INSERT INTO `department` VALUES ('2', '事业部', '5', '马总', '0');
INSERT INTO `department` VALUES ('3', '秘书室', '1', '斐哥', '1');
INSERT INTO `department` VALUES ('4', '市场部', '3', ' 二虎', '0');
INSERT INTO `department` VALUES ('5', '策划部', '2', ' 小张', '1');
INSERT INTO `department` VALUES ('6', '营销部', '1', ' 小赵', '0');
INSERT INTO `department` VALUES ('7', '人事部', '0', 'tom', '0');
INSERT INTO `department` VALUES ('8', '公关部', '0', 'jack', '1');
INSERT INTO `department` VALUES ('9', '行政部', '0', '小田', '1');
INSERT INTO `department` VALUES ('10', '请问', '0', '请问', '1');
INSERT INTO `department` VALUES ('11', '', '0', '', '1');
INSERT INTO `department` VALUES ('12', '', '0', '', '1');
INSERT INTO `department` VALUES ('13', '', '0', '', '1');
INSERT INTO `department` VALUES ('14', '', '0', '', '1');
INSERT INTO `department` VALUES ('15', '', '0', '', '1');
INSERT INTO `department` VALUES ('16', '', '0', '', '1');
INSERT INTO `department` VALUES ('17', '', '0', '', '1');
INSERT INTO `department` VALUES ('18', 'sad', '0', '阿萨德', '1');
INSERT INTO `department` VALUES ('19', '54', '0', '465', '1');
INSERT INTO `department` VALUES ('20', '阿达', '0', '大', '1');
INSERT INTO `department` VALUES ('21', '暗示', '0', '阿萨德', '1');
INSERT INTO `department` VALUES ('22', '56546', '0', '546546', '1');

-- ----------------------------
-- Table structure for `dp_position`
-- ----------------------------
DROP TABLE IF EXISTS `dp_position`;
CREATE TABLE `dp_position` (
  `relationship_id` int(20) NOT NULL AUTO_INCREMENT,
  `position_id` int(20) NOT NULL,
  `department_id` int(20) NOT NULL,
  PRIMARY KEY (`relationship_id`) USING BTREE,
  KEY `FK_DP` (`department_id`) USING BTREE,
  KEY `FK_PT` (`position_id`) USING BTREE,
  CONSTRAINT `dp_position_ibfk_1` FOREIGN KEY (`department_id`) REFERENCES `department` (`department_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `dp_position_ibfk_2` FOREIGN KEY (`position_id`) REFERENCES `position` (`position_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of dp_position
-- ----------------------------
INSERT INTO `dp_position` VALUES ('1', '1', '1');
INSERT INTO `dp_position` VALUES ('2', '1', '2');
INSERT INTO `dp_position` VALUES ('3', '2', '3');
INSERT INTO `dp_position` VALUES ('4', '3', '1');
INSERT INTO `dp_position` VALUES ('5', '4', '5');

-- ----------------------------
-- Table structure for `employees`
-- ----------------------------
DROP TABLE IF EXISTS `employees`;
CREATE TABLE `employees` (
  `job_id` int(6) NOT NULL AUTO_INCREMENT,
  `ename` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `sex` int(1) NOT NULL,
  `phone` varchar(11) NOT NULL,
  `birth` date NOT NULL,
  `idcard` varchar(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `hometown` varchar(6) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `nation` varchar(8) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `education` varchar(6) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `address` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `hiredate` date NOT NULL,
  `department_id` int(20) NOT NULL,
  `position_id` int(20) NOT NULL,
  `workstate` int(1) NOT NULL,
  `icon` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  PRIMARY KEY (`job_id`) USING BTREE,
  KEY `DEPARTMENT` (`department_id`) USING BTREE,
  KEY `FK_EP_TO_PT` (`position_id`) USING BTREE,
  CONSTRAINT `employees_ibfk_1` FOREIGN KEY (`department_id`) REFERENCES `department` (`department_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `employees_ibfk_2` FOREIGN KEY (`position_id`) REFERENCES `position` (`position_id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of employees
-- ----------------------------
INSERT INTO `employees` VALUES ('1', '张一', '1', '111', '1999-01-01', '1212', '四川', '汉', '本科', '四川成都', '2019-01-01', '1', '1', '0', null);
INSERT INTO `employees` VALUES ('2', '张二', '1', '112', '1999-01-02', '12133', '四川', '汉', '本科', '四川成都', '2019-01-02', '2', '2', '1', null);
INSERT INTO `employees` VALUES ('3', '张三', '1', '113', '1999-01-03', '1214', '重庆', '汉', '本科', '重庆', '2019-01-03', '3', '3', '1', null);
INSERT INTO `employees` VALUES ('4', '李一', '0', '114', '1999-01-04', '1215', '重庆', '汉', '本科', '重庆', '2019-01-04', '6', '1', '1', null);
INSERT INTO `employees` VALUES ('5', '李二', '0', '115', '1999-01-05', '1216', '云南', '羌族', '本科', '云南昆明', '2019-01-05', '5', '3', '1', null);
INSERT INTO `employees` VALUES ('6', '李三', '1', '116', '1999-01-06', '1217', '广东', '汉', '本科', '广东中山', '2019-01-06', '4', '2', '1', null);
INSERT INTO `employees` VALUES ('7', '李四', '0', '117', '1988-01-07', '1218', '四川', '汉', '硕士', '四川成都', '2000-01-01', '4', '5', '1', null);
INSERT INTO `employees` VALUES ('8', '王一', '1', '118', '1999-01-08', '1219', '北京', '汉', '硕士', '北京海淀', '2018-01-01', '4', '3', '0', null);
INSERT INTO `employees` VALUES ('9', '小马哥', '1', '119', '1995-01-02', '1220', '四川', '汉', '本科', '四川绵阳', '2015-01-08', '2', '4', '1', null);
INSERT INTO `employees` VALUES ('10', '小李哥', '1', '120', '1993-01-09', '1221', '江西', '汉', '硕士', '江西南昌', '2014-08-01', '5', '5', '1', null);
INSERT INTO `employees` VALUES ('11', '夏荣锋', '1', '110', '1998-12-25', '51300000000000', '四川达州', '汉', '本科', '常乐小区', '2017-09-01', '2', '2', '0', '456456');
INSERT INTO `employees` VALUES ('12', '111', '1', '11111111111', '2019-10-08', '111111111111111111', '天津市市辖区', '汉族', '高中', '1', '2019-10-21', '2', '1', '1', null);
INSERT INTO `employees` VALUES ('13', '1', '1', '11111111111', '2019-10-01', '111111111111111111', '北京市市辖区', '蒙古族', '初中', '111111111111111111111', '2019-10-22', '2', '1', '1', null);

-- ----------------------------
-- Table structure for `jobchange`
-- ----------------------------
DROP TABLE IF EXISTS `jobchange`;
CREATE TABLE `jobchange` (
  `change_id` int(3) NOT NULL AUTO_INCREMENT,
  `job_id` int(6) NOT NULL,
  `beforedp_id` int(2) NOT NULL,
  `afterdp_id` int(2) NOT NULL,
  `changetime` date NOT NULL,
  PRIMARY KEY (`change_id`) USING BTREE,
  KEY `FK_JC_TO_EP` (`job_id`) USING BTREE,
  CONSTRAINT `FK_JC_TO_EP` FOREIGN KEY (`job_id`) REFERENCES `employees` (`job_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of jobchange
-- ----------------------------
INSERT INTO `jobchange` VALUES ('1', '9', '1', '2', '2016-01-01');
INSERT INTO `jobchange` VALUES ('2', '10', '4', '5', '2015-08-08');
INSERT INTO `jobchange` VALUES ('3', '5', '2', '5', '2019-05-05');
INSERT INTO `jobchange` VALUES ('4', '6', '3', '2', '2019-02-02');

-- ----------------------------
-- Table structure for `position`
-- ----------------------------
DROP TABLE IF EXISTS `position`;
CREATE TABLE `position` (
  `position_id` int(20) NOT NULL AUTO_INCREMENT,
  `position_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `salary` decimal(10,2) NOT NULL,
  PRIMARY KEY (`position_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of position
-- ----------------------------
INSERT INTO `position` VALUES ('1', '基层', '6000.00');
INSERT INTO `position` VALUES ('2', '组长', '6000.00');
INSERT INTO `position` VALUES ('3', '助理', '1.00');
INSERT INTO `position` VALUES ('4', '经理', '44.00');
INSERT INTO `position` VALUES ('5', '部长', '2.00');

-- ----------------------------
-- Table structure for `reward`
-- ----------------------------
DROP TABLE IF EXISTS `reward`;
CREATE TABLE `reward` (
  `reward_id` int(20) NOT NULL AUTO_INCREMENT,
  `job_id` int(6) NOT NULL,
  `checktime` date NOT NULL,
  `overtime` int(3) NOT NULL,
  `late` int(3) NOT NULL,
  `leaveearly` int(3) NOT NULL,
  `aleave` int(3) NOT NULL,
  `absenteeism` int(3) NOT NULL,
  PRIMARY KEY (`reward_id`),
  KEY `FK_RW_WO_EP` (`job_id`) USING BTREE,
  CONSTRAINT `FK_RW_WO_EP` FOREIGN KEY (`job_id`) REFERENCES `employees` (`job_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of reward
-- ----------------------------
INSERT INTO `reward` VALUES ('1', '1', '2019-09-07', '0', '0', '0', '0', '0');
INSERT INTO `reward` VALUES ('2', '2', '2019-09-07', '0', '0', '0', '0', '0');
INSERT INTO `reward` VALUES ('3', '3', '2019-09-07', '0', '0', '0', '0', '0');
INSERT INTO `reward` VALUES ('4', '4', '2019-09-07', '0', '0', '0', '0', '0');
INSERT INTO `reward` VALUES ('5', '5', '2019-09-07', '0', '0', '0', '0', '0');
INSERT INTO `reward` VALUES ('6', '6', '2019-09-07', '0', '0', '0', '0', '0');
INSERT INTO `reward` VALUES ('7', '7', '2019-09-07', '0', '0', '0', '0', '0');
INSERT INTO `reward` VALUES ('8', '8', '2019-09-07', '0', '0', '0', '0', '0');
INSERT INTO `reward` VALUES ('9', '9', '2019-09-07', '0', '0', '0', '0', '0');
INSERT INTO `reward` VALUES ('10', '10', '2019-09-07', '0', '0', '0', '0', '0');

-- ----------------------------
-- Table structure for `role`
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `role_id` int(3) NOT NULL AUTO_INCREMENT,
  `role` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  PRIMARY KEY (`role_id`),
  KEY `FK_CH_TO_US` (`role_id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of role
-- ----------------------------
INSERT INTO `role` VALUES ('1', '普通用户');
INSERT INTO `role` VALUES ('2', '管理员');

-- ----------------------------
-- Table structure for `salary`
-- ----------------------------
DROP TABLE IF EXISTS `salary`;
CREATE TABLE `salary` (
  `salaryinf_id` int(20) NOT NULL AUTO_INCREMENT,
  `job_id` int(6) NOT NULL,
  `finasalary` decimal(10,2) NOT NULL,
  `payday` date DEFAULT NULL,
  PRIMARY KEY (`salaryinf_id`) USING BTREE,
  KEY `FK_SA_TO_EP` (`job_id`) USING BTREE,
  CONSTRAINT `FK_SA_TO_EP` FOREIGN KEY (`job_id`) REFERENCES `employees` (`job_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of salary
-- ----------------------------
INSERT INTO `salary` VALUES ('1', '1', '3600.00', '2019-06-15');
INSERT INTO `salary` VALUES ('2', '2', '6500.00', '2019-06-15');
INSERT INTO `salary` VALUES ('3', '3', '8500.00', '2019-06-15');
INSERT INTO `salary` VALUES ('4', '4', '3600.00', '2019-06-15');
INSERT INTO `salary` VALUES ('5', '5', '8500.00', '2019-06-15');
INSERT INTO `salary` VALUES ('6', '6', '6500.00', '2019-06-15');
INSERT INTO `salary` VALUES ('7', '7', '0.00', '2019-06-15');
INSERT INTO `salary` VALUES ('8', '8', '8000.00', '2019-06-15');
INSERT INTO `salary` VALUES ('9', '9', '15000.00', '2019-06-15');
INSERT INTO `salary` VALUES ('10', '10', '28544.00', '2019-06-15');

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `user_id` int(2) NOT NULL AUTO_INCREMENT,
  `job_id` int(6) NOT NULL,
  `username` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `password` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `wechat` varchar(30) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL,
  `realname` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `role_id` int(3) NOT NULL,
  `state` int(1) NOT NULL DEFAULT '1',
  PRIMARY KEY (`user_id`) USING BTREE,
  KEY `FK_US_TO_EP` (`job_id`) USING BTREE,
  KEY `CHARACTERID` (`role_id`) USING BTREE,
  CONSTRAINT `FK_US_TO_EP` FOREIGN KEY (`job_id`) REFERENCES `employees` (`job_id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `users_ibfk_1` FOREIGN KEY (`role_id`) REFERENCES `role` (`role_id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', '1', 'z1', '123', null, '张一', '1', '1');
INSERT INTO `users` VALUES ('2', '2', 'z2', '123', null, '张二', '1', '1');
INSERT INTO `users` VALUES ('3', '3', 'z3', '123', null, '张三', '1', '1');
INSERT INTO `users` VALUES ('4', '4', 'l1', '123', null, '李一', '1', '1');
INSERT INTO `users` VALUES ('5', '5', 'l2', '123', null, '李二', '1', '1');
INSERT INTO `users` VALUES ('6', '6', 'l3', '123', null, '李三', '1', '1');
INSERT INTO `users` VALUES ('7', '7', 'l7', '123', null, '李四', '1', '1');
INSERT INTO `users` VALUES ('8', '8', 'w1', '123', null, '王一', '1', '1');
INSERT INTO `users` VALUES ('9', '9', 'xmg', '123', null, '小马哥', '1', '1');
INSERT INTO `users` VALUES ('10', '10', 'xlg', '123', null, '小李哥', '1', '1');
