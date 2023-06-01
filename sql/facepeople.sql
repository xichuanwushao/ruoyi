/*
 Navicat Premium Data Transfer

 Source Server         : 49.232.18.37
 Source Server Type    : MySQL
 Source Server Version : 50726
 Source Host           : 49.232.18.37:33306
 Source Schema         : ry-vue

 Target Server Type    : MySQL
 Target Server Version : 50726
 File Encoding         : 65001

 Date: 01/06/2023 14:15:37
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for facepeople
-- ----------------------------
DROP TABLE IF EXISTS `facepeople`;
CREATE TABLE `facepeople`  (
  `id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '主键',
  `nick_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '姓名',
  `number` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '工号',
  `image_path` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '图片路径',
  `image_base64` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '图片内容',
  `user_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of facepeople
-- ----------------------------
INSERT INTO `facepeople` VALUES ('8593eb30-a7d5-4a54-83a9-a5e4343e00db', '1', '1', '1', '1', NULL);
INSERT INTO `facepeople` VALUES ('b0bffdf5-8faf-4166-a665-3621341ce3fd', '张三', '156601', NULL, NULL, NULL);

SET FOREIGN_KEY_CHECKS = 1;
