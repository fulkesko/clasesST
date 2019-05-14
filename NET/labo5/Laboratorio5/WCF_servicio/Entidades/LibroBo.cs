using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Runtime.Serialization;
using System.Web;

namespace WCF_servicio.Entidades
{
    [Serializable, DataContract]
    public class LibroBO
    {
        [DataMember]
        public string Id { get; set; }
        [DataMember]
        public string Codigo { get; set; }
        [DataMember]
        public string Titulo { get; set; }
        [DataMember]
        public string ISBN {get; set;}
        [DataMember]
        public string Editorial { get; set; }
        [DataMember]
        public string NumPags { get; set; }
    }
}