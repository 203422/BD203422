DROP TABLE IF EXISTS mascota;
DROP TABLE IF EXISTS duenio;
DROP TABLE IF EXISTS medicamento;
DROP TABLE IF EXISTS cita;

CREATE TABLE mascota (
    idMascota IDENTITY NOT NULL PRIMARY KEY,
    nombre varchar (40) not null,
    tipo varchar (40) not null,
    fechaIngreso varchar (40) not null,
    razon varchar (50) not null
);

CREATE TABLE duenio (
    idDuenio IDENTITY NOT NULL PRIMARY KEY,
    nombre varchar (40) not null,
    telefono varchar (40) not null,
    direccion varchar (50) not null
);

CREATE TABLE medicamento (
    idMedicamento IDENTITY NOT NULL PRIMARY KEY,
    nombre varchar (40) not null,
    codigo varchar (40) not null,
    fechaCaducidad varchar (40) not null,
    sustanciaActiva varchar (40) not null
);

CREATE TABLE cita (
    idCita IDENTITY NOT NULL PRIMARY KEY,
    fecha varchar (40) not null,
    hora varchar (40) not null,
    servicio varchar (40) not null
);

insert into mascota (nombre, tipo, fechaIngreso, razon)
    values ('Max', 'pitbull', '02/06/2021', 'vacunacion');

insert into duenio (nombre, telefono, direccion)
    values ('Ernesto', '9614587810', 'Colonia los pinos');

insert into cita (fecha, hora, servicio)
    values ('19/08/2021', '06:15 PM', 'JSJSJSJS');

insert into medicamento (nombre, codigo, fechaCaducidad, sustanciaActiva)
    values ('Paracetamol', 'PTMOL14785', '09/12/2021', 'activa');