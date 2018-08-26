-- 创建数据库
CREATE DATABASE IF NOT EXISTS `design-mode` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci;

-- 使用数据库
USE `design-mode`;

CREATE TABLE IF NOT EXISTS `phone`(
  `id`                  BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
  `create_time`         datetime DEFAULT CURRENT_TIMESTAMP() COMMENT '创建时间',
  `modified_time`       datetime DEFAULT null ON UPDATE CURRENT_TIMESTAMP() COMMENT '更新时间',
  `name`                VARCHAR(32) COMMENT '手机具体的名字',
  `brand`               VARCHAR(20) COMMENT '品牌',
  `size`                DECIMAL(10,2)  COMMENT '尺寸',
  `operating_system`    VARCHAR(32)  COMMENT '手机操作系统',
  `price`               DECIMAL(10,2) COMMENT '价格',
  PRIMARY KEY (`id`)
)ENGINE = InnoDB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8mb4 COMMENT '手机';

CREATE TABLE IF NOT EXISTS `snack`
(
  `id`                  BIGINT NOT NULL AUTO_INCREMENT COMMENT 'id',
  `create_time`         datetime DEFAULT CURRENT_TIMESTAMP() COMMENT '创建时间',
  `modified_time`       datetime DEFAULT null ON UPDATE CURRENT_TIMESTAMP() COMMENT '更新时间',
  `name`                VARCHAR(20) NOT NULL COMMENT '零食名称',
  `brand`               VARCHAR(20) COMMENT '品牌',
  `taste`               VARCHAR(20)  COMMENT '口味',
  `price`               DECIMAL(10,2) COMMENT '价格',
  `pack`                VARCHAR(20)  COMMENT '包装',
  `province`            VARCHAR(20)  COMMENT '省份',
  PRIMARY KEY (`id`)
)ENGINE = InnoDB AUTO_INCREMENT = 1 DEFAULT CHARSET = utf8mb4 COMMENT '零食';

INSERT INTO `phone` (`name`, `brand`, `size`, `operating_system`, `price`) VALUES ('小米6pro', '小米', '4.50', '安卓', '900.00');
INSERT INTO `phone` (`name`, `brand`, `size`, `operating_system`, `price`) VALUES ('小米5pro', '小米', '3.50', '安卓', '800.00');
INSERT INTO `phone` (`name`, `brand`, `size`, `operating_system`, `price`) VALUES ('oppsA5', 'oppo', '4.50', '安卓', '900.00');
INSERT INTO `phone` (`name`, `brand`, `size`, `operating_system`, `price`) VALUES ('荣耀Play', 'honor', '4.00', '安卓', '1750.00');
INSERT INTO `phone` (`name`, `brand`, `size`, `operating_system`, `price`) VALUES ('红米6A', '小米', '4.00', '安卓', '505.00');
INSERT INTO `phone` (`name`, `brand`, `size`, `operating_system`, `price`) VALUES ('VIVONEX', 'vivo', '4.50', '安卓', '4156.00');
INSERT INTO `phone` (`name`, `brand`, `size`, `operating_system`, `price`) VALUES ('OPPOR15', 'oppo', '4.50', '安卓', '2472.00');
INSERT INTO `phone` (`name`, `brand`, `size`, `operating_system`, `price`) VALUES ('IPHONEX', '苹果', '5.50', '苹果', '6404.00');
INSERT INTO `phone` (`name`, `brand`, `size`, `operating_system`, `price`) VALUES ('小米MAX3', '小米', '4.00', '安卓', '1532.00');
INSERT INTO `phone` (`name`, `brand`, `size`, `operating_system`, `price`) VALUES ('华为nova3i', '华为', '3.50', '安卓', '1999.00');
INSERT INTO `phone` (`name`, `brand`, `size`, `operating_system`, `price`) VALUES ('华为P20', '华为', '4.50', '安卓', '3303.00');
INSERT INTO `phone` (`name`, `brand`, `size`, `operating_system`, `price`) VALUES ('华为畅享8e', '华为', '3.50', '安卓', '752.00');
INSERT INTO `phone` (`name`, `brand`, `size`, `operating_system`, `price`) VALUES ('苹果8plus', '苹果', '4.50', '苹果', '4900.00');
INSERT INTO `phone` (`name`, `brand`, `size`, `operating_system`, `price`) VALUES ('苹果7plus', '苹果', '4.50', '苹果', '3397.00');
INSERT INTO `phone` (`name`, `brand`, `size`, `operating_system`, `price`) VALUES ('苹果6plus', '苹果', '4.00', '苹果', '1335.00');
INSERT INTO `phone` (`name`, `brand`, `size`, `operating_system`, `price`) VALUES ('vivoY31', 'vivo', '4.50', '安卓', '349.00');
INSERT INTO `phone` (`name`, `brand`, `size`, `operating_system`, `price`) VALUES ('vivoY27', 'vivo', '4.50', '安卓', '371.00');

INSERT INTO `snack` (`name`, `brand`, `taste`, `price`, `pack`, `province`) VALUES ('猪肉铺210g', '三只松鼠', '辣', '17.90', '袋装', '安徽');
INSERT INTO `snack` (`name`, `brand`, `taste`, `price`, `pack`, `province`) VALUES ('鸭脖150g', '三只松鼠', '中辣', '16.90', '袋装', '安徽');
INSERT INTO `snack` (`name`, `brand`, `taste`, `price`, `pack`, `province`) VALUES ('三只松鼠零食礼包', '三只松鼠', '甜', '59.90', '箱装', '安徽');
INSERT INTO `snack` (`name`, `brand`, `taste`, `price`, `pack`, `province`) VALUES ('零食礼包', '百草味', '甜', '59.90', '箱装', '浙江');
INSERT INTO `snack` (`name`, `brand`, `taste`, `price`, `pack`, `province`) VALUES ('豆干牛肉210g', '好味屋', '微辣', '19.90', '袋装', '湖南');
INSERT INTO `snack` (`name`, `brand`, `taste`, `price`, `pack`, `province`) VALUES ('鱼丸100g', '良品铺子', '微辣', '15.90', '袋装', '湖北');
INSERT INTO `snack` (`name`, `brand`, `taste`, `price`, `pack`, `province`) VALUES ('面筋卷120g', '良品铺子', '甜', '18.90', '袋装', '湖北');
INSERT INTO `snack` (`name`, `brand`, `taste`, `price`, `pack`, `province`) VALUES ('蛋花玉米68g', '良品铺子', '甜', '24.90', '袋装', '湖北');
INSERT INTO `snack` (`name`, `brand`, `taste`, `price`, `pack`, `province`) VALUES ('茶味糕点1050g', '良品铺子', '甜', '36.90', '袋装', '湖北');
INSERT INTO `snack` (`name`, `brand`, `taste`, `price`, `pack`, `province`) VALUES ('蒸蛋糕1000g', '三只松鼠', '甜', '38.90', '袋装', '安徽');
INSERT INTO `snack` (`name`, `brand`, `taste`, `price`, `pack`, `province`) VALUES ('夏威夷果500g', '三只松鼠', '甜', '37.90', '袋装', '安徽');
INSERT INTO `snack` (`name`, `brand`, `taste`, `price`, `pack`, `province`) VALUES ('鸭掌110g', '三只松鼠', '中辣', '26.90', '袋装', '安徽');
INSERT INTO `snack` (`name`, `brand`, `taste`, `price`, `pack`, `province`) VALUES ('曲奇饼干260g', '三只松鼠', '甜', '27.90', '袋装', '安徽');
INSERT INTO `snack` (`name`, `brand`, `taste`, `price`, `pack`, `province`) VALUES ('零食礼包', '彩虹口袋', '甜', '69.90', '箱装', '浙江');
INSERT INTO `snack` (`name`, `brand`, `taste`, `price`, `pack`, `province`) VALUES ('猪肉脯70g', '彩虹口袋', '中辣', '9.90', '袋装', '浙江');
INSERT INTO `snack` (`name`, `brand`, `taste`, `price`, `pack`, `province`) VALUES ('拉面丸子70g', '彩虹口袋', '甜', '5.90', '袋装', '浙江');
INSERT INTO `snack` (`name`, `brand`, `taste`, `price`, `pack`, `province`) VALUES ('山药脆皮65g', '彩虹口袋', '甜', '3.90', '袋装', '浙江');
INSERT INTO `snack` (`name`, `brand`, `taste`, `price`, `pack`, `province`) VALUES ('鸭脖100g', '彩虹口袋', '辣', '9.90', '袋装', '浙江');
