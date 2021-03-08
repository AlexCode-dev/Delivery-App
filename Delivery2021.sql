CREATE DATABASE  DeliveryApp2020;

use DeliveryApp2020;


create table administrador(
id_admin int not null auto_increment,
dni varchar(50),
nombre varchar(50),
apellido varchar(50),
domicilio varchar(50),
cant_suc int not null,
pago float,
estado varchar(50),
primary key (id_admin)
);


CREATE TABLE sucursal(
    
id_sucursal int not null auto_increment,
nombre_Local varchar (50),
nombre_apellido_dueno varchar (50),
id_caja int not null ,
id_admin int not null,
foreign key (id_caja) references caja(id_caja),
foreign key (id_admin) references administrador(id_admin),
primary key (id_sucursal)
);
CREATE TABLE comida(
id_comida int not null auto_increment,
nombreComida varchar(50),
tipoComida varchar(50),
descripcion varchar(100),
precioxUnidad float,
estado varchar(50),
id_sucursal int not null,
foreign key(id_sucursal) references sucursal(id_sucursal),
primary key (id_comida)
);


SELECT * FROM comida WHERE estado = 'En venta';


CREATE TABLE caja (
    id_caja int not null AUTO_INCREMENT,
    tipo varchar(50),
    monto_inicial real not null,
    monto_final real not null,
    fecha date not null,
    estado int not null,
    id_sucursal int not null,
    foreign key (id_sucursal) references sucursal(id_sucursal),
    PRIMARY KEY (id_caja)
);
CREATE TABLE usuario(

id_usuario int not null auto_increment,
dni  varchar (20),
tipo varchar (20),
nombre varchar (50),
apellido varchar (50),  
telefono varchar(50),
estado varchar (50),
domicilio varchar (50),
id_sucursal int not null,
usuario varchar (50) not null,
clave varchar (200) not null,
foreign key (id_sucursal) references sucursal(id_sucursal),
primary key (id_usuario)
);

create table cliente(
id_cliente int not null auto_increment,
tipo varchar (20),
nombre varchar (50),
apellido varchar (50),  
telefono varchar(50),
domicilio varchar (50),
barrio varchar(50),
id_zona int not null,
id_sucursal int not null,
estado int not null,
foreign key (id_zona) references zona(id_zona),
foreign key (id_sucursal) references sucursal(id_sucursal),
primary key (id_cliente)
);

select * from cliente;
create table zona(
id_zona int not null auto_increment,
nombre varchar(50),
estado varchar(50),
primary key (id_zona)
);

create table pedido(
id_pedido int not null auto_increment,
fecha_retiro date not null,
fecha_entrega date not null,
hora_retiro time,
hora_entrega time,
descripcion text,
estado varchar(50),
precio float,
cuit_cadete bigint not null,
id_cliente int not null,
foreign key (cuit_cadete) references cadete(cuit_cadete),
foreign key (id_cliente) references cliente(id_cliente),
primary key(id_pedido)
);

select * from cliente;
select * from pedido;
select * from cadete;
select * from comida;

create table cadete(
cuit_cadete bigint not null auto_increment,
nombre varchar(50),
apellido varchar(50),
telefono varchar(50),
carnet_estado varchar(50),
estado varchar(50),
id_vehiculo int not null,
id_sucursal int not null,
foreign key (id_vehiculo) references vehiculo(id_vehiculo),
foreign key (id_sucursal) references sucursal(id_sucursal),
primary key(cuit_cadete)
);

create table vehiculo(
id_vehiculo int not null auto_increment,
nombre varchar(50),
patente varchar(20),
primary key(id_vehiculo)
);


CREATE TABLE liquidacion (
    id_liquidacion int not null AUTO_INCREMENT,
    fechaRegistro date not null,
    cuit_cadete bigint not null,
    monto real not null,
     foreign key (cuit_cadete) references cadete(cuit_cadete),
    PRIMARY KEY (id_liquidacion)   
);

CREATE TABLE ticket (
    id_ticket int not null AUTO_INCREMENT,
    id_pedido int not null,
    cuit_cadete bigint not null,
    montoT real not null,
    tarifaE real not null,
    estadoT int not null,
    fecha date not null,
    id_formapago int not null,
    foreign key (id_formapago) references formapago(id_formapago),
    foreign key (cuit_cadete) references cadete(cuit_cadete),
    foreign key (id_pedido) references pedido(id_pedido),
    PRIMARY KEY (id_ticket)
);


CREATE TABLE formapago (

id_formapago int not null AUTO_INCREMENT,
nombre varchar(50),
detalle varchar(50),
primary key (id_formapago)
);
CREATE TABLE gananciaDiaCadete(
id_gananciaDiaCadete int not null auto_increment,
fecha varchar(50),
cuit_cadete bigint not null,
estado varchar(50),
pago float not null,
foreign key (cuit_cadete) references cadete(cuit_cadete),
primary key (id_gananciaDiaCadete)
);
select * from gananciaDiaCadete;
select * from pedido where (estado="Activo" or estado="Enviado" ) and fecha_entrega="2021 enero 10";
select *from administrador;
select *from usuario;
select * from sucursal;
select * from caja;
select * from cliente;
select * from zona;
select * from vehiculo;
select * from cadete;
SELECT * FROM cadete WHERE estado = 'Disponible';
SELECT * FROM pedido WHERE id_pedido ="1" AND estado = 'activo' or estado='enviado';	
SELECT * FROM pedido ORDER BY id_pedido DESC LIMIT 15;
select * from pedido;
select * from caja;	
UPDATE pedido SET estado = 'Cancelado' WHERE id_pedido = 1;

INSERT INTO administrador
  (id_admin, dni,nombre,apellido,domicilio,cant_suc,pago,estado)
  VALUES ('1','40984848','Alejo','Boglione','av.belgrano sur 1387','1','800','Activo');
INSERT INTO usuario
  (id_usuario, dni,tipo,nombre,apellido,telefono,estado,domicilio,id_sucursal,usuario,clave)
  VALUES ('1','40984848','administrador','Alejo','Boglione','30303030','Activo','castelli 800','1','admin','admin');

INSERT INTO sucursal
  (id_sucursal,nombre_Local,nombre_apellido_dueno,id_caja,id_admin)
  VALUES ('1','delivery de armando','Alejo Boglione','1','1');
  
INSERT INTO caja     
  (id_caja,tipo,monto_inicial,monto_final,fecha,estado)
  VALUES ('1','principal','0.00','0.00','2021/04/01','1');

select * from caja where estado = 0 and id_sucursal= 1;
/*
select caja.id_sucursal, caja.monto_inicial, caja.monto_final
from caja
inner join sucursal on caja.id_sucursal where ;
*/

select * from pedido;
select * from usuario where usuario.nombre = "pedro";
select * from comida;