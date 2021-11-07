--liquibase formatted sql
--changeset sbabinski:2
create table users
(
    id       BIGINT AUTO_INCREMENT PRIMARY KEY,
    username varchar(50)  not null UNIQUE,
    password varchar(100) not null,
    enabled  boolean      not null
);
--changeset sbabinski:3
create table authorities
(
    username  varchar(50) not null,
    authority varchar(50) not null,
    constraint fk_authorities_users foreign key (username) references users (username),
    UNIQUE KEY username_authority (username, authority)
);
