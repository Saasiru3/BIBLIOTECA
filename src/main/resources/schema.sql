--Primero se deben borrar todas las tablas (de detalle a maestro) y lugo anyadirlas (de maestro a detalle)
--(en este caso en cada aplicacion se usa solo una tabla, por lo que no hace falta)

--Para giis.demo.tkrun:
drop table Libro;
drop table Prestamo;
drop table Socio;



CREATE TABLE "Libro" (
	"ISBN"	INTEGER NOT NULL,
	"Titulo"	TEXT NOT NULL,
	"Autor"	TEXT NOT NULL,
	"Edicion"	INTEGER NOT NULL,
	PRIMARY KEY("ISBN")
);

CREATE TABLE "Prestamo" (
	"Libro"	INTEGER NOT NULL,
	"Socio"	INTEGER NOT NULL,
	"fechaVencimiento"	INTEGER NOT NULL,
	"fechaDevolucion"	INTEGER,
	PRIMARY KEY("Libro")
	
);

CREATE TABLE "Socio" (
	"numSocio"	INTEGER NOT NULL,
	"FechaNacimiento"	TEXT NOT NULL,
	"NombreCompleto"	TEXT NOT NULL,
	"Trabajador"	INTEGER  NOT NULL,
	"masInfo"	TEXT NOT NULL,
	PRIMARY KEY("numSocio")
	
);