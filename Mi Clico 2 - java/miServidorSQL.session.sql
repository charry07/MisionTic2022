
create table Course (
    courseId char(5),
    subjectId char(4) not null,
    courseNumber integer,
    title varchar(50) not null,
    numOfCredits integer,
    primary key (courseId)
);

CREATE TABLE Vehiculos (
    placa VARCHAR(10) NOT NULL,
    marca VARCHAR(50) NOT NULL,
    modelo VARCHAR(50) NOT NULL,
    kilometraje INT NOT NULL,
    fecha_venta DATE,
    documento_vendedor INT NOT NULL,
    PRIMARY KEY ( placa )
);

CREATE TABLE Vendedores (
    documento_vendedor INT NOT NULL,
    nombres VARCHAR(50) NOT NULL,
    apellidos VARCHAR(50) NOT NULL,
    ciudad VARCHAR(50) NOT NULL,
    PRIMARY KEY ( documento_vendedor )
);

create table scientist (id integer, firstname varchar(100), lastname varchar(100));
		insert into scientist (id, firstname, lastname) values (1, 'albert', 'einstein');
		insert into scientist (id, firstname, lastname) values (2, 'isaac', 'newton');
		insert into scientist (id, firstname, lastname) values (3, 'marie', 'curie');
		select * from scientist;

INSERT INTO Vendedores (documento_vendedor, nombres, apellidos, ciudad) VALUES ('1964', 'Juan', 'Rodríguez', 'Medellín');
INSERT INTO Vendedores (documento_vendedor, nombres, apellidos, ciudad) VALUES ('2853', 'José', 'González', 'Bogotá');

INSERT INTO Vehiculos (placa, marca, modelo, kilometraje, fecha_venta, documento_vendedor) VALUES ('ACD 427', 'Renault', 'Stepway', '25000', '2020-7-05', '1964');
INSERT INTO Vehiculos (placa, marca, modelo, kilometraje, fecha_venta, documento_vendedor) VALUES ('IYU 521', 'Renault', 'Clío', '70200', null, '2853'); 
INSERT INTO vehiculos (placa, marca, modelo, kilometraje, fecha_venta, documento_vendedor) VALUES ( 'FAY 091','Renault', 'Twingo','146 000','2021-08-20','1035918779');
INSERT INTO vehiculos (placa, marca, modelo, kilometraje, fecha_venta, documento_vendedor) VALUES ( 'GHF 375','Chevrolet', 'camaro','0',null,'1035918779');
INSERT INTO vehiculos (placa, marca, modelo, kilometraje, fecha_venta, documento_vendedor) VALUES ( 'ZJT 785','Chevrolet', 'SparkGT','1000','2021-08-10','1035918779');
INSERT INTO vehiculos (placa, marca, modelo, kilometraje, fecha_venta, documento_vendedor) VALUES ( 'NSA 673','Mazda', 'Mazda 2','12 000','2021-05-15','1035918779');

select * from Vendedores;
select * from Vehiculos;