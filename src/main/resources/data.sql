--Datos para carga inicial de la base de datos

--Para giis.demo.tkrun:

delete from articulo;
delete from pedido;
delete from articuloPedido;
delete from contenedor;

INSERT INTO articulo(idArticulo,volumen,nombre,categoria) VALUES 
(259,5,"mayonesa musa","no perecedero"),
(260,9,"agua font vella","no perecedero");

CREATE TABLE "Libro" (
	"ISBN"	INTEGER NOT NULL,
	"Titulo"	TEXT NOT NULL,
	"Autor"	TEXT NOT NULL,
	"Edición"	INTEGER NOT NULL,
	PRIMARY KEY("ISBN")
);
CREATE TABLE "Prestamo" (
	"Libro"	INTEGER NOT NULL,
	"Socio"	INTEGER NOT NULL,
	"fecha/vecimiento"	INTEGER NOT NULL,
	"fecha/Devolucion"	INTEGER
);CREATE TABLE "Socio" (
	"Field1"	INTEGER NOT NULL,
	"Fecha_nacimiento"	TEXT NOT NULL,
	"Nombre_Completo"	TEXT NOT NULL,
	"Trabajador"	TEXT NOT NULL,
	"mas_info"	INTEGER NOT NULL
);