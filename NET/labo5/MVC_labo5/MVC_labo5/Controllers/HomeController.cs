using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;
using System.Web.Mvc;

namespace MVC_labo5.Controllers
{
    public class HomeController : Controller
    {
        public ActionResult Index()
        {
            return View();
        }

        public ActionResult About()
        {
            ViewBag.Message = "Your application description page.";

            return View();
        }

        public ActionResult Contact()
        {
            ViewBag.Message = "Your contact page.";

            return View();
        }
        public ActionResult ListaLibros()
        {

            ServiceBaseDatos.Service1Client cliente = new ServiceBaseDatos.Service1Client();

            IEnumerable<MVC_labo5.ServiceBaseDatos.LibroBO> lista = cliente.ObtenerLibros();
            return View(lista);
        }

        public ActionResult CrearLibro()
        {
            return View();
        }

        [HttpPost]
        public ActionResult CrearLibro(FormCollection collection) {
        ServiceBaseDatos.Service1Client conn = new ServiceBaseDatos.Service1Client();

        ServiceBaseDatos.LibroBO libro = new ServiceBaseDatos.LibroBO();


        libro.Id = collection["Id"];

        libro.Codigo = collection["Codigo"];

        libro.Titulo = collection["Titulo"];

        libro.ISBN = collection["ISBN"];

        libro.Editorial = collection["Editorial"];

        libro.NumPags = collection["NumPags"];



        conn.CrearLibro(libro);

        return Redirect("ListaLibros");
        }
    }
}