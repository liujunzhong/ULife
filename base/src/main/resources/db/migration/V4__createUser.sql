CREATE TABLE user
(
    id         BIGINT PRIMARY KEY,
    name       VARCHAR(100),
    tel        VARCHAR(20) UNIQUE,
    password    VARCHAR (1024),
    avatar_url VARCHAR(1024),
    address    VARCHAR(1024),
    gmt_create TIMESTAMP NOT NULL DEFAULT NOW(),
    gmt_updated TIMESTAMP NOT NULL DEFAULT NOW()
);