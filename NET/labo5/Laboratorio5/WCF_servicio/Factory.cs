using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using WCF_servicio.Entidades;

namespace WCF_servicio
{
    public class Factory
    {
        public static object getBO(object DAO)
        {
            return GetLibroBO(DAO);

        }

        public static List<LibroBO> getListBO(List<Libro> DAO)
        {
            List<LibroBO> libros = new List<LibroBO>();
            foreach (Libro item in DAO)
            {
                libros.Add((LibroBO)GetLibroBO(item));
            }

            return libros;

        }

        public static object GetLibroBO(object DAO)
        {
            LibroBO libroBo = new LibroBO();
            Libro libroDAO = (Libro)DAO;
           
            libroBo.Id = libroDAO.Id_libro.ToString();
            libroBo.Codigo = libroDAO.Codigo.ToString();
            libroBo.Titulo = libroDAO.Titulo;
            libroBo.ISBN = libroDAO.ISBN;
            libroBo.Editorial = libroDAO.Editorial;
            libroBo.NumPags = libroDAO.NumPags.ToString();
            return libroBo;
        }

        public static object SetLibro(LibroBO lib) {
            Libro lb = new Libro
            {
                
                Codigo = int.Parse(lib.Codigo),
                Titulo = lib.Titulo,
                ISBN = lib.ISBN,
                Editorial = lib.Editorial,
                NumPags = byte.Parse(lib.NumPags)
            };
            return lb;
            /*
            LibroBO libroBo = new LibroBO();
            Libro libroDAO = (Libro)obj;

            libroBo.Id = libroDAO.Id_libro.ToString();
            libroBo.Codigo = libroDAO.Codigo.ToString();
            libroBo.Titulo = libroDAO.Titulo;
            libroBo.ISBN = libroDAO.ISBN;
            libroBo.Editorial = libroDAO.Editorial;
            libroBo.NumPags = libroDAO.NumPags.ToString();
            */
            
        }
    }
}