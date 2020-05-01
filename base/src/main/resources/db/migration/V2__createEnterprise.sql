CREATE TABLE enterprise(
    id          bigint PRIMARY KEY COMMENT 'ID',
    name        VARCHAR (100) DEFAULT NULL COMMENT '企业名称',
    summary     VARCHAR (1000) DEFAULT NULL COMMENT '企业简介',
    address     VARCHAR (100) DEFAULT NULL COMMENT '企业地址',
    labels      VARCHAR(100) DEFAULT NULL COMMENT '标签列表',
    coordinate  VARCHAR (100) DEFAULT NULL COMMENT '坐标',
    is_hot      tinyint DEFAULT NULL COMMENT '是否热门',
    logo        VARCHAR (100) DEFAULT NULL COMMENT 'LOGO',
    job_count   INT DEFAULT NULL COMMENT '职位数',
    url         VARCHAR (100) DEFAULT NULL COMMENT 'URL',
    gmt_create      TIMESTAMP NOT NULL DEFAULT NOW() COMMENT '表创建时间',
    gmt_updated     TIMESTAMP NOT NULL DEFAULT NOW() COMMENT '表更新时间'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='企业';

INSERT INTO enterprise(id,summary,address,labels)
VALUES (1,'summary','beijing','科技');
