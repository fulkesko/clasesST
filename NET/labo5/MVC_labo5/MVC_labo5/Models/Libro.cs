using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace MVC_labo5.Models
{
    public class Libro
    {
        public string Id { get; set; }
        public string Codigo { get; set; }
        public string Titulo { get; set; }
        public string ISBN { get; set; }
        public string Editorial { get; set; }
        public string NumPags { get; set; }
    }
}