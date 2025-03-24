--Datos para carga inicial de la base de datos

--Para giis.demo.tkrun:



INSERT INTO libro(ISBN,titulo,autor,edicion) VALUES
 
(2598,"los Pilares de la tierra","Ken follet",2);

insert into socio(numSocio,FechaNacimiento,nombreCompleto, Trabajador, masInfo) values
(1201412, "24-02-78", "Carlos Garcia Perez",0,"mas informacion del socio");

insert into prestamo(Libro, Socio, fechaVencimiento, fechaDevolucion) values
(2598,1201412,010402025, 29032025);


