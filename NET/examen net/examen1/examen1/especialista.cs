//------------------------------------------------------------------------------
// <auto-generated>
//     Este código se generó a partir de una plantilla.
//
//     Los cambios manuales en este archivo pueden causar un comportamiento inesperado de la aplicación.
//     Los cambios manuales en este archivo se sobrescribirán si se regenera el código.
// </auto-generated>
//------------------------------------------------------------------------------

namespace examen1
{
    using System;
    using System.Collections.Generic;
    
    public partial class especialista
    {
        public int id_especialista { get; set; }
        public int id_especialidad { get; set; }
        public string rut_stakeholder { get; set; }
    
        public virtual especialidad especialidad { get; set; }
        public virtual stakeholder stakeholder { get; set; }
    }
}
