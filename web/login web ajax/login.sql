CREATE DATABASE login;
USE login;
CREATE TABLE usuario(
    id int AUTO_INCREMENT,
    nom varchar 60,
    pass varchar 60,
    PRIMARY KEY id
);
INSERT INTO usuario VALUES(NULL, 'usu2', 'pass');