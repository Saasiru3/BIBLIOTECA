--Primero se deben borrar todas las tablas (de detalle a maestro) y lugo anyadirlas (de maestro a detalle)
--(en este caso en cada aplicacion se usa solo una tabla, por lo que no hace falta)

--Para giis.demo.tkrun:
drop table Libro;
drop table Prestamo;
drop table Socio;
;


CREATE TABLE "Libro" (
	"ISBN"	INTEGER NOT NULL,
	"Titulo"	TEXT NOT NULL,
	"Autor"	TEXT NOT NULL,
	"Edición"	INTEGER NOT NULL,
	PRIMARY KEY("ISBN")
);CREATE TABLE "Prestamo" (
	"Libro"	INTEGER NOT NULL,
	"Socio"	INTEGER NOT NULL,
	"fecha/vecimiento"	INTEGER NOT NULL,
	"fecha/Devolucion"	INTEGER
);
CREATE TABLE "Socio" (
	"Field1"	INTEGER NOT NULL,
	"Fecha_nacimiento"	TEXT NOT NULL,
	"Nombre_Completo"	TEXT NOT NULL,
	"Trabajador"	TEXT NOT NULL,
	"mas_info"	INTEGER NOT NULL
);