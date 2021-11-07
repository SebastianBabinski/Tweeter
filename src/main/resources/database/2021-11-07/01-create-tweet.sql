--liquibase formatted sql
--changeset sbabinski:1
CREATE TABLE tweet (
                      id BIGINT AUTO_INCREMENT PRIMARY KEY,
                      title VARCHAR(400) NOT NULL,
                      content VARCHAR(2000) NULL,
                      created timestamp
);