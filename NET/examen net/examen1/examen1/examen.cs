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
    
    public partial class examen
    {
        public int id_examen { get; set; }
        public string rut_usuario { get; set; }
        public string rut_stakeholder { get; set; }
        public string detalle_examen { get; set; }
        public System.DateTime fechaHora_Examen { get; set; }
    
        public virtual stakeholder stakeholder { get; set; }
        public virtual usuario usuario { get; set; }
    }
}