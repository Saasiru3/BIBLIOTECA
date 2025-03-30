--Datos para carga inicial de la base de datos

--Para giis.demo.tkrun:



INSERT INTO Libro(ISBN, Titulo, Autor, Anio_Edicion) VALUES
  
(2598,"los Pilares de la tierra","Ken follet",1989),
(2566, "Cien años de soledad", "Gabriel Garcia Marquez",1967),
(2533, "Orgullo y prejuicio", "Jane Austen", 1813);

insert INTO Socios(Num_Socio, NombreSocio, Categoria) values
(1201412, "Carlos Garcia Perez", "Adulto"),
(1201475, "Maria Perez Lopez", "Adulto"),
(1240124, "Manuel Gomez Gomez", "Infantil");

insert INTO Prestamo(Num_Socio, ISBN, Titulo, Fecha_Inicio, Fecha_Final) values

(1201412, 2598,"Los Pilares de la tierra", "2025-03-29", "2025-04-10"),
(1201475, 2533, "Orgullo y perjuicio", "2025-03-20", "2025-04-06"),
(1240124, 2566, "Cien años de soledad", "2025-03-30", "2025-04-11");


