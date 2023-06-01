/*
 Navicat Premium Data Transfer

 Source Server         : d2_49.232.18.37
 Source Server Type    : MySQL
 Source Server Version : 50736
 Source Host           : 49.232.18.37:3306
 Source Schema         : oprm

 Target Server Type    : MySQL
 Target Server Version : 50736
 File Encoding         : 65001

 Date: 31/05/2023 22:43:14
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for faceperson
-- ----------------------------
DROP TABLE IF EXISTS `faceperson`;
CREATE TABLE `faceperson`  (
  `id` int(11) NOT NULL COMMENT '主键',
  `name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `number` int(11) NULL DEFAULT NULL COMMENT '工号',
  `imagePath` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '图片路径',
  `imageBase64` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '图片内容',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of faceperson
-- ----------------------------

SET FOREIGN_KEY_CHECKS = 1;
