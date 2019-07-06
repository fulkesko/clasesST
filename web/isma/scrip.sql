DROP DATABASE examen1web;

CREATE DATABASE examen1web;

USE examen1web;

CREATE TABLE tipo_usuario(
    id INT AUTO_INCREMENT,
    nombre VARCHAR(50),

    PRIMARY KEY(id)
);

CREATE TABLE usuario(
    id INT AUTO_INCREMENT,
    nombre VARCHAR(60),
    run VARCHAR(12),
    pass VARCHAR(64),   
    tipo_usuario_id_fk INT,
    PRIMARY KEY (id),
    FOREIGN KEY (tipo_usuario_id_fk) REFERENCES tipo_usuario(id)
);  


INSERT INTO tipo_usuario VALUES(NULL,"alumno");
INSERT INTO tipo_usuario VALUES(NULL,"Docente");
INSERT INTO tipo_usuario VALUES(NULL,"admin");

INSERT INTO usuario VALUES(NULL,"alex","13202132-5","123",2);
INSERT INTO usuario VALUES(NULL,"ismael","20026293-k","321",3);
INSERT INTO usuario VALUES(NULL,"javier","12265254-7","456",1);

SELECT usuario.tipo_usuario_id_fk FROM usuario WHERE nombre ="alex" AND pass ="123";