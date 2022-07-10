CREATE DATABASE Cinemar CHARACTER SET utf8mb4;
USE cinemar;

CREATE TABLE Pelicula(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    Titulo VARCHAR(100),
    genero VARCHAR (50),
    duracion INT NOT NULL,
    clasificacion VARCHAR(5),
    sinopsis VARCHAR(524),
    idioma VARCHAR (12)
);
CREATE TABLE Usuario(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    nombre VARCHAR(30),
    apellido VARCHAR(30),
     dni INT UNSIGNED NOT NULL,
    contrasenia VARCHAR(16),
    email VARCHAR(30)
   
);

CREATE TABLE TarjetaCredito(
	numero BIGINT UNSIGNED NOT NULL PRIMARY KEY,
    banco VARCHAR(20),
    cliente VARCHAR(60),
    credito FLOAT,
    vencimiento DATE,
    id_usuario INT NOT NULL,
    CONSTRAINT usuario_tc_fk
    FOREIGN KEY TarjetaCredito(id_usuario)
    REFERENCES Usuario(id)
);
CREATE TABLE Sala(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    numerosala INT NOT NULL UNIQUE,
    formato VARCHAR(3),
    capacidad INT UNSIGNED NOT NULL,
    butacaocupadas INT UNSIGNED NOT NULL
);
CREATE TABLE Butaca(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    fila VARCHAR(1),
    numero TINYINT,
    reservada BOOLEAN,
    id_sala INT NOT NULL,
    CONSTRAINT sala_butaca_fk
    FOREIGN KEY Butaca(id_sala)
    REFERENCES Sala(id)
);
CREATE TABLE Descuento(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    dia VARCHAR(10),
    porcentaje FLOAT
);
CREATE TABLE Reserva(
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    precio FLOAT,
    fecha TIMESTAMP,
    id_butaca INT NOT NULL,
    id_usuario INT NOT NULL,
    id_pago BIGINT UNSIGNED NOT NULL,
    id_descuento INT NOT NULL,
    id_pelicula INT NOT NULL,
    CONSTRAINT pelicula_reserva_fk
    FOREIGN KEY Reserva(id_pelicula)
    REFERENCES Pelicula(id),
    CONSTRAINT butaca_reserva_fk
    FOREIGN KEY Reserva(id_butaca)
    REFERENCES Butaca(id),
    CONSTRAINT usuario_reserva_fk
    FOREIGN KEY Reserva(id_usuario)
    REFERENCES Usuario(id),
    CONSTRAINT pago_reserva_fk
    FOREIGN KEY Reserva(id_pago)
    REFERENCES TarjetaCredito(numero),
    CONSTRAINT descuento_reserva_fk
    FOREIGN KEY Reserva(id_descuento)
    REFERENCES Descuento(id)
);
