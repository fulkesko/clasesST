//------------------------------------------------------------------------------
// <auto-generated>
//     Este código se generó a partir de una plantilla.
//
//     Los cambios manuales en este archivo pueden causar un comportamiento inesperado de la aplicación.
//     Los cambios manuales en este archivo se sobrescribirán si se regenera el código.
// </auto-generated>
//------------------------------------------------------------------------------

namespace labo6
{
    using System;
    using System.Collections.Generic;
    
    public partial class Prestamos
    {
        public int Id_Prestamos { get; set; }
        public int Id_libro_fk { get; set; }
        public int Id_usuario_fk { get; set; }
        public System.DateTime Fec_prestamos { get; set; }
        public System.DateTime Fec_devolucion { get; set; }
    
        public virtual Libro Libro { get; set; }
        public virtual Usuario Usuario { get; set; }
    }
}
