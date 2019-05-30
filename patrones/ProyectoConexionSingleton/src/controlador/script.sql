DROP DATABASE banco;

CREATE DATABASE banco;
USE banco;

CREATE TABLE tipoUsuario(
id INT AUTO_INCREMENT,
nombre VARCHAR(50), 
PRIMARY KEY(id)
);


CREATE TABLE usuario(
id INT AUTO_INCREMENT,
rut VARCHAR(15),
nombre VARCHAR(60),
pass VARCHAR(64),
idTipoUsu INT,

PRIMARY KEY (id),
FOREIGN KEY (idTipoUsu) REFERENCES tipoUsuario(id)
);

CREATE TABLE formulario(
id INT AUTO_INCREMENT,
rut VARCHAR(15),
nomusuari VARCHAR(60),
apellido VARCHAR(60),
sueldo_liquido INT,

PRIMARY KEY (id)
);

CREATE TABLE tarjeta (
id INT AUTO_INCREMENT,
a VARCHAR(60),
b VARCHAR(60),
c VARCHAR(60),
d VARCHAR(60),
e VARCHAR(60),
usuario_id_fk INT,

PRIMARY KEY(id),
FOREIGN KEY (usuario_id_fk) REFERENCES usuario(id)
);

CREATE TABLE transferencia(
id INT AUTO_INCREMENT,
idUsuario_fk INT,
idUsuario2_fk INT,

PRIMARY KEY(id),
FOREIGN KEY (idUsuario_fk)REFERENCES usuario(id),
FOREIGN KEY (idUsuario2_fk)REFERENCES usuario(id)
);


