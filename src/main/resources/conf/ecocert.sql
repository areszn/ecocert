/*
Navicat MySQL Data Transfer

Source Server         : aa
Source Server Version : 50096
Source Host           : localhost:3306
Source Database       : ecocert

Target Server Type    : MYSQL
Target Server Version : 50096
File Encoding         : 65001

Date: 2018-05-09 21:43:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for authentication_domain
-- ----------------------------
DROP TABLE IF EXISTS `authentication_domain`;
CREATE TABLE `authentication_domain` (
  `id` int(32) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='认证领域';

-- ----------------------------
-- Records of authentication_domain
-- ----------------------------

-- ----------------------------
-- Table structure for company
-- ----------------------------
DROP TABLE IF EXISTS `company`;
CREATE TABLE `company` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `test_type` varchar(255) default NULL COMMENT '检测类型',
  `test` varchar(255) default NULL COMMENT '检测项',
  `amount_receivable` float(255,0) default NULL COMMENT '应收金额',
  `pay_amount` float(255,0) default NULL COMMENT '应付金额',
  `feeler_mechanism` varchar(255) default NULL COMMENT '检测机构',
  `examining_report` varchar(255) default NULL COMMENT '检测报告',
  `developer` varchar(255) default NULL COMMENT '项目开发人',
  `remarks` varchar(255) default NULL COMMENT '备注',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='企业';

-- ----------------------------
-- Records of company
-- ----------------------------

-- ----------------------------
-- Table structure for cooperation
-- ----------------------------
DROP TABLE IF EXISTS `cooperation`;
CREATE TABLE `cooperation` (
  `id` int(32) NOT NULL auto_increment,
  `name` varchar(255) default NULL COMMENT '客户名称',
  `contacts` varchar(255) default NULL COMMENT '联系人',
  `phone` varchar(20) default NULL COMMENT '联系电话',
  `domain` int(10) default NULL COMMENT '认证领域',
  `fei_scale` float(255,0) default NULL COMMENT '收费标准',
  `region` varchar(255) default '' COMMENT '所在区域',
  `developerid` varchar(255) default NULL COMMENT '市场开发人',
  `guardianid` varchar(255) default NULL COMMENT '项目维护人',
  `status` int(20) default '0' COMMENT '审批状态0-未审批，1-审批通过，2-已驳回',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8 COMMENT='合作单位';

-- ----------------------------
-- Records of cooperation
-- ----------------------------
INSERT INTO `cooperation` VALUES ('3', 'a公司', '联系人', '13988884444', '1', '123123', '铁西', 'a张三', 'a李四', '0');
INSERT INTO `cooperation` VALUES ('4', '公司', '联系人', '13988884444', '1', '123123', '铁西', '张三', '李四', '0');
INSERT INTO `cooperation` VALUES ('5', 'B公司', 'B联系人', '13988884444', '1', '123123', '铁西', '张三', '李四', '0');

-- ----------------------------
-- Table structure for examining_report
-- ----------------------------
DROP TABLE IF EXISTS `examining_report`;
CREATE TABLE `examining_report` (
  `id` int(11) default NULL,
  `company` varchar(255) default NULL COMMENT '公司',
  `test` varchar(255) default NULL COMMENT '检测项',
  `examining_report` varchar(255) default NULL COMMENT '报告地址'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='检测报告';

-- ----------------------------
-- Records of examining_report
-- ----------------------------

-- ----------------------------
-- Table structure for feeler_mechanism
-- ----------------------------
DROP TABLE IF EXISTS `feeler_mechanism`;
CREATE TABLE `feeler_mechanism` (
  `id` int(11) NOT NULL auto_increment,
  `name` varchar(40) default NULL COMMENT '检测机构',
  `range` varchar(40) default NULL COMMENT '检测范围',
  `period` date default NULL COMMENT '合作期限',
  `prcie` float(40,0) default NULL COMMENT '合作价格',
  `registrant` varchar(40) default NULL COMMENT '登记人',
  `ramarks` varchar(40) default NULL COMMENT '备注',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='检测机构 ';

-- ----------------------------
-- Records of feeler_mechanism
-- ----------------------------

-- ----------------------------
-- Table structure for finance
-- ----------------------------
DROP TABLE IF EXISTS `finance`;
CREATE TABLE `finance` (
  `id` int(32) NOT NULL auto_increment,
  `company` varchar(20) default NULL COMMENT '企业名称',
  `cooperration_id` int(20) default NULL,
  `contract_number` varchar(40) default NULL COMMENT '合同号',
  `charge_item` varchar(40) default NULL COMMENT '收费项目',
  `amount_receivable` float(40,0) default NULL COMMENT '应收金额',
  `income` float(40,0) default NULL COMMENT '实际进账额',
  `description` varchar(255) default NULL COMMENT '收费说明',
  `date` datetime default NULL COMMENT '进账时间',
  `arrears` float(255,0) default NULL COMMENT '欠款',
  `owner` int(40) default NULL COMMENT '项目归属人',
  `remark` varchar(255) default NULL COMMENT '备注',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8 COMMENT='财务表';

-- ----------------------------
-- Records of finance
-- ----------------------------
INSERT INTO `finance` VALUES ('1', '公司B', '2', '11111', '2', '111', '100', 'adsfdsaf', null, null, '1', 'adsf');
INSERT INTO `finance` VALUES ('2', '公司A', '2', null, '2', '111', '100', 'adsfdsaf', '2018-04-17 15:35:51', null, '1', null);
INSERT INTO `finance` VALUES ('3', '公司A', '3', null, '1', '111', '100', 'adsfdsaf', '2018-04-17 15:46:41', null, '1', 'adsf');
INSERT INTO `finance` VALUES ('4', '公司A', '4', '11111', '1', '111', '100', 'adsfdsaf', '2018-04-17 15:49:13', null, '1', 'adsf');
INSERT INTO `finance` VALUES ('5', '公司A', '5', '11111', '1', '111', '100', 'adsfdsaf', '2018-04-19 15:50:30', null, '1', 'adsf');
INSERT INTO `finance` VALUES ('6', '公司A', '1', '11111', '1', '111', '100', 'adsfdsaf', '2018-04-19 15:50:49', null, '1', 'adsf');
INSERT INTO `finance` VALUES ('7', '公司A', '1', '11111', '1', '111', '100', 'adsfdsaf', '2018-04-19 15:54:51', null, '1', 'adsf');
INSERT INTO `finance` VALUES ('8', '公司A', '1', '11111', '1', '111', '100', 'adsfdsaf', '2018-04-17 15:56:38', null, '1', 'adsf');
INSERT INTO `finance` VALUES ('9', '公司A', '1', '11111', '1', '111', '100', 'adsfdsaf', '2018-04-17 16:23:35', null, '1', 'adsf');

-- ----------------------------
-- Table structure for function
-- ----------------------------
DROP TABLE IF EXISTS `function`;
CREATE TABLE `function` (
  `id` int(255) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  `parent_id` int(255) default NULL,
  `url` varchar(128) default NULL,
  `serial_num` int(11) default NULL,
  `accordion` int(11) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of function
-- ----------------------------

-- ----------------------------
-- Table structure for process
-- ----------------------------
DROP TABLE IF EXISTS `process`;
CREATE TABLE `process` (
  `id` int(20) default NULL,
  `company_id` int(20) default NULL COMMENT '公司编号',
  `authentication_domain_id` int(20) default NULL COMMENT '认证编号',
  `number` int(20) default NULL COMMENT '证书数量',
  `authentication_type` int(255) default NULL COMMENT '认证类型',
  `requirement` varchar(255) default NULL COMMENT '客户需求',
  `validity` datetime default NULL COMMENT '证书有效期',
  `Admissibility_time` datetime default NULL COMMENT '受理时间',
  `Admissibility_user_id` int(20) default NULL COMMENT '受理人id',
  `develpment_id` int(20) default NULL COMMENT '市场开发人id',
  `cooperation_id` int(20) default NULL COMMENT '合作单位id',
  `file_path` varchar(255) default NULL COMMENT '文件路径',
  `identifier` varchar(255) default NULL COMMENT '评审编号',
  `problem` varchar(255) default NULL COMMENT '问题描述',
  `status` int(20) default NULL COMMENT '1-受理申请 2-申请不通过 3-'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of process
-- ----------------------------

-- ----------------------------
-- Table structure for qualification
-- ----------------------------
DROP TABLE IF EXISTS `qualification`;
CREATE TABLE `qualification` (
  `id` int(32) NOT NULL auto_increment,
  `user_id` int(32) default NULL,
  `authentication_domain_id` int(20) default NULL,
  `qualification_name` varchar(20) default NULL COMMENT '资格',
  `qualification_registration_mark` varchar(40) default NULL COMMENT '资格注册号',
  `begin_time` datetime default NULL COMMENT '开始日期',
  `end_time` datetime default NULL COMMENT '结束日期',
  `status` varchar(10) default NULL,
  `remarks` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='人员注册资质';

-- ----------------------------
-- Records of qualification
-- ----------------------------

-- ----------------------------
-- Table structure for role
-- ----------------------------
DROP TABLE IF EXISTS `role`;
CREATE TABLE `role` (
  `id` int(255) NOT NULL auto_increment,
  `name` varchar(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role
-- ----------------------------

-- ----------------------------
-- Table structure for role_function
-- ----------------------------
DROP TABLE IF EXISTS `role_function`;
CREATE TABLE `role_function` (
  `id` int(255) NOT NULL auto_increment,
  `role_id` int(255) default NULL,
  `function_id` int(255) default NULL,
  `status` int(11) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of role_function
-- ----------------------------

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(32) NOT NULL auto_increment,
  `name` varchar(20) default NULL,
  `password` varchar(40) default NULL,
  `realname` varchar(20) default NULL COMMENT '姓名',
  `phone` varchar(20) default NULL COMMENT '电话',
  `location` varchar(40) default '' COMMENT '所在地',
  `age` int(4) default NULL COMMENT '年龄',
  `fulltime` int(4) default NULL COMMENT '是否全职',
  `id_number` varchar(32) default NULL COMMENT '身份证号',
  `education` varchar(40) default NULL COMMENT '学历',
  `major` varchar(40) default '' COMMENT '专业',
  `work_experience` varchar(40) default '' COMMENT '工作经验',
  `gender` varchar(4) default '' COMMENT '性别',
  `hiredate` date default NULL COMMENT '合同开始日期',
  `leavedate` date default NULL COMMENT '合同结束日期',
  `photo` varchar(255) default '' COMMENT '照片',
  `status` varchar(4) default '0',
  `authentication_domain_id` int(20) default NULL,
  `specialty_code` varchar(20) default '' COMMENT '专业代码',
  `professional_level` varchar(20) default NULL COMMENT '专业等级',
  `post` varchar(40) default NULL COMMENT '工作岗位',
  `working_condition` varchar(20) default '' COMMENT '工作状态',
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'admin', 'admin', null, null, null, '0', '0', null, null, null, null, null, null, null, null, '0', '1', null, null, '前台', '0');
INSERT INTO `user` VALUES ('2', 'Asndy', '123456', 'Andy', null, null, '30', '0', null, null, null, null, '女', null, null, null, '0', '1', null, null, '后台', '0');
INSERT INTO `user` VALUES ('3', 'andy2', 'ea14d45739d3259e208c66b888af4781', '石高超', null, null, '30', '0', null, null, null, null, '男', null, null, null, '0', '2', null, null, null, '0');
INSERT INTO `user` VALUES ('4', 'tom3', 'ea14d45739d3259e208c66b888af4781', '石高超', null, null, '30', '1', null, null, null, null, '男', null, null, null, '0', '3', null, null, null, '0');
INSERT INTO `user` VALUES ('5', 'Andy1', 'ea14d45739d3259e208c66b888af4781', 'Andy', null, null, '0', '1', null, null, null, null, null, null, null, null, '0', '4', null, null, null, '1');
INSERT INTO `user` VALUES ('6', 'jerry', '28fef79adfedcb4e72fbe37730c7639d', 'adfg', null, null, '0', '0', null, null, null, null, null, null, null, null, '0', '3', null, null, null, '1');
INSERT INTO `user` VALUES ('7', 'hello', '28fef79adfedcb4e72fbe37730c7639d', 'hello', null, null, '0', '1', null, null, null, null, null, null, null, null, '0', '1', null, null, null, '1');
INSERT INTO `user` VALUES ('8', 'ajax1', '1be6f5fc8c825cf7c6985fcf748ad0d0', 'asdfsdaf', null, null, '0', '0', null, null, null, null, null, null, null, null, '1', '1', null, null, null, '1');
INSERT INTO `user` VALUES ('9', 'tom10', 'ea14d45739d3259e208c66b888af4781', '石高超', null, null, '30', '1', null, null, null, null, '男', null, null, null, '0', '1', null, null, null, '1');
INSERT INTO `user` VALUES ('10', 'tom11', 'ea14d45739d3259e208c66b888af4781', '石高超', null, null, '30', '1', null, null, null, null, '男', null, null, null, '0', '1', null, null, null, '1');
INSERT INTO `user` VALUES ('11', 'tom12', 'ea14d45739d3259e208c66b888af4781', '石高超', null, null, '30', '1', null, null, null, null, '男', null, null, null, '0', '1', null, null, null, '1');
INSERT INTO `user` VALUES ('12', 'tom13', 'ea14d45739d3259e208c66b888af4781', '石高超', null, null, '30', '1', null, null, null, null, '男', null, null, null, '0', '1', null, null, null, '1');
INSERT INTO `user` VALUES ('13', 'sandy', 'ea14d45739d3259e208c66b888af4781', 'sandy', null, null, null, '1', null, null, null, null, null, null, null, null, '0', '1', null, null, null, '1');
INSERT INTO `user` VALUES ('14', '大侠', '2c5371ce76441b7d2bd5ec843d54365f', '大侠', null, '', null, null, null, null, '', '', '', null, null, '', '0', null, '', null, null, '');
INSERT INTO `user` VALUES ('15', 'a', 'ee7d6babdee3ece4c4b509ee79678288', 'a', null, '', null, null, null, null, '', '', '', null, null, '', '0', null, '', null, null, '');
INSERT INTO `user` VALUES ('18', 'aaa', '83951eb64a02c5a3f7a1f57ed4932eaa', 'aaa', '13344445555', '', null, '0', null, null, '', 'sd', '', '2018-01-01', '2018-03-01', '', '0', null, '', null, null, '');
INSERT INTO `user` VALUES ('19', 'andy22', 'ee7d6babdee3ece4c4b509ee79678288', 'andy', '123', '', '12', '0', null, '0', '', 'adfs', '', '2018-08-02', '2018-08-02', '', '0', null, '', null, null, '');

-- ----------------------------
-- Table structure for user_role
-- ----------------------------
DROP TABLE IF EXISTS `user_role`;
CREATE TABLE `user_role` (
  `id` int(255) NOT NULL auto_increment,
  `role_id` int(255) default NULL,
  `user_id` int(255) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_role
-- ----------------------------

-- ----------------------------
-- View structure for v_finance
-- ----------------------------
DROP VIEW IF EXISTS `v_finance`;
CREATE ALGORITHM=UNDEFINED DEFINER=`root`@`localhost`  VIEW `v_finance` AS select c.name,f.id,f.company,f.cooperration_id,f.contract_number,f.charge_item,f.amount_receivable,f.income,f.description,f.date,f.arrears,f.owner,f.remark from cooperation c,finance f where c.id=f.cooperration_id ;
