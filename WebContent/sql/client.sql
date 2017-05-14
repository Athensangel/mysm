/*
Navicat MySQL Data Transfer

Source Server         : mydatebase
Source Server Version : 50087
Source Host           : localhost:3306
Source Database       : client

Target Server Type    : MYSQL
Target Server Version : 50087
File Encoding         : 65001

Date: 2017-05-14 18:20:49
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for customer
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `cid` varchar(32) collate utf8_bin NOT NULL,
  `name` varchar(66) collate utf8_bin default NULL COMMENT '客户姓名',
  `gender` varchar(5) collate utf8_bin default NULL COMMENT '性别',
  `phone` varchar(55) collate utf8_bin default NULL COMMENT ' 电话号码',
  `email` varchar(60) collate utf8_bin default NULL COMMENT '邮箱',
  `orders` varchar(55) collate utf8_bin default NULL COMMENT '订单',
  PRIMARY KEY  (`cid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES ('1260d941372b4375aa4746ad048a3b5c', 'o', 'o', 'o', 'o', 'o');
INSERT INTO `customer` VALUES ('3114255a615c4555999e14302006d257', '6', '6', '6', '6', '6');
INSERT INTO `customer` VALUES ('773ff460e1d34bec9ddfd0f0e9459c86', 'y9', 'y9', 'y9', 'y9', 'y9');
INSERT INTO `customer` VALUES ('959e3510d9c940d2ae265ce1ebfff295', 'Username44', 'y', '33', 'y', 'y9');
INSERT INTO `customer` VALUES ('a001', '小军', '男', '15574408502', '2221', '一个篮球');
INSERT INTO `customer` VALUES ('a002', '秦军', '男', '15574408502', '2221', '三个篮球');
INSERT INTO `customer` VALUES ('d3e0ff1072c24eeb85019ec5c5713035', 'xvxv', 'xvxv', 'xvxv', 'xvxv', 'xvxv');

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `id` varchar(32) collate utf8_bin NOT NULL COMMENT '主键id',
  `name` varchar(40) collate utf8_bin default NULL COMMENT '留言人',
  `create_time` datetime default NULL COMMENT '留言时间',
  `content` varchar(50) collate utf8_bin default NULL COMMENT '留言内容',
  `email` varchar(50) collate utf8_bin default '' COMMENT '留言邮箱地址',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of message
-- ----------------------------
INSERT INTO `message` VALUES ('06bf6edc26fc4aba94c7f2759aad1a91', '益生菌9', '2017-05-09 10:21:55', '好喝9', '119');
INSERT INTO `message` VALUES ('08fd58c0ceab4e1cab45609148fa4089', '益生菌6', '2017-05-08 00:00:00', '你回家吃饭吗6', '123@sina.com');
INSERT INTO `message` VALUES ('634ff422164f4c9890eab423d18dce91', '益生菌7', '2017-05-08 00:00:00', '你回家吃饭吗7', '123@sina.com');
INSERT INTO `message` VALUES ('7dfdfc4a6ed8457eb82a61073454b5ac', '益生菌2', '2017-05-08 00:00:00', '你回家吃饭吗2', '123@sina.com');
INSERT INTO `message` VALUES ('8ee94f3041de4e7da9f81917a4086191', '3', '2017-05-02 10:20:10', '33', '3');
INSERT INTO `message` VALUES ('92f2521b794a410299255419a1600ce9', '益生菌5', '2017-05-08 00:00:00', '你回家吃饭吗5', '123@sina.com');
