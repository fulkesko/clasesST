using System;
using System.Collections.Generic;
using System.Linq;
using System.Runtime.Serialization;
using System.ServiceModel;
using System.ServiceModel.Web;
using System.Text;
using WCF_servicio.Entidades;

namespace WCF_servicio
{
    // NOTA: puede usar el comando "Rename" del menú "Refactorizar" para cambiar el nombre de clase "Service1" en el código, en svc y en el archivo de configuración.
    // NOTE: para iniciar el Cliente de prueba WCF para probar este servicio, seleccione Service1.svc o Service1.svc.cs en el Explorador de soluciones e inicie la depuración.
    public class Service1 : IService1
    {
        public List<LibroBO> ObtenerLibros()
        {
            Lab5Entities context = new Lab5Entities();

            return Factory.getListBO(context.Libro.ToList());

        }
        
        public void CrearLibro(LibroBO lib)
        {
            Lab5Entities context = new Lab5Entities();
            /*Libro lb = new Libro{
                Codigo = int.Parse(lib.Codigo),
                Titulo = lib.Titulo,
                ISBN = lib.ISBN,
                Editorial = lib.Editorial,
                NumPags = byte.Parse(lib.NumPags)
            };
            casteo
            */
            context.Libro.Add((Libro)Factory.SetLibro(lib));
            context.SaveChanges();


        }
    }
}