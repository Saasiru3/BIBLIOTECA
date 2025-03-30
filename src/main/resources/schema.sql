--Primero se deben borrar todas las tablas (de detalle a maestro) y lugo anyadirlas (de maestro a detalle)
--(en este caso en cada aplicacion se usa solo una tabla, por lo que no hace falta)

--Para giis.demo.tkrun:
drop table if exists "Libro";
drop table if exists "Prestamo";
drop table if exists "Socios";


CREATE TABLE IF NOT EXISTS "Socios" (
	"Num_Socio"	INTEGER NOT NULL,
	"NombreSocio" TEXT NOT NULL,
	"Categoria"	TEXT NOT NULL,
	PRIMARY KEY("Num_Socio")
);

CREATE TABLE IF NOT EXISTS "Libro" (
	"ISBN"	INTEGER NOT NULL,
	"Titulo" TEXT NOT NULL,
	"Autor"	TEXT NOT NULL,
	"Anio_Edicion"	INTEGER,
	PRIMARY KEY("ISBN")
);
CREATE TABLE IF NOT EXISTS "Prestamo" (
	"Num_Socio"	INTEGER NOT NULL,
	"ISBN"	INTEGER NOT NULL,
	"Titulo" TEXT NOT NULL,
	"Fecha_Inicio" TEXT NOT NULL,
	"Fecha_Final" TEXT NOT NULL,
	PRIMARY KEY("Num_Socio", "ISBN")
	FOREIGN KEY("Num_Socio") REFERENCES "Socios"("Num_Socio"),
	FOREIGN KEY("ISBN") REFERENCES "Libro"("ISBN")
);