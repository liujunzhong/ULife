CREATE TABLE label(
    id              bigint PRIMARY KEY COMMENT '标签ID',
    label_name      VARCHAR (100) DEFAULT NULL COMMENT '标签名称',
    status          VARCHAR (1) DEFAULT NULL COMMENT '状态',
    is_recommend    tinyint DEFAULT NULL COMMENT '是否推荐',
    fans            BIGINT DEFAULT NULL COMMENT '粉丝数',
    gmt_create      TIMESTAMP NOT NULL DEFAULT NOW() COMMENT '表创建时间',
    gmt_updated     TIMESTAMP NOT NULL DEFAULT NOW() COMMENT '表更新时间'
)ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='企业';

INSERT INTO label(id,label_name,status,is_recommend,fans)
VALUES('1','java',NULL,NULL,NULL);