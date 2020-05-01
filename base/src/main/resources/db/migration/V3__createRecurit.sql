CREATE TABLE recruit (
  id            bigint NOT NULL COMMENT 'ID',
  job_name      varchar(100) DEFAULT NULL COMMENT '职位名称',
  salary        varchar(100) DEFAULT NULL COMMENT '薪资范围',
  experience     varchar(100) DEFAULT NULL COMMENT '经验要求',-- condition 是一个关键字
  education     varchar(100) DEFAULT NULL COMMENT '学历要求',
  type          varchar(1) DEFAULT NULL COMMENT '任职方式',
  address       varchar(100) DEFAULT NULL COMMENT '办公地址',
  eid           varchar(20) DEFAULT NULL COMMENT '企业ID',
  state         varchar(1) DEFAULT NULL COMMENT '状态',
  url           varchar(100) DEFAULT NULL COMMENT '网址',
  label         varchar(100) DEFAULT NULL COMMENT '标签',
  content1      varchar(100) DEFAULT NULL COMMENT '职位描述',
  content2      varchar(100) DEFAULT NULL COMMENT '职位要求',
  gmt_create    timestamp NOT NULL DEFAULT NOW(),
  gmt_updated   timestamp NOT NULL DEFAULT NOW()
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='职位';


insert  into `recruit`(`id`,`job_name`,`salary`,`experience`,`education`,`type`,`address`,`eid`,`state`)
 values (1,'大数据工程师','20000-30000','八年以上开发经验','本科','1','国贸','1','1');

