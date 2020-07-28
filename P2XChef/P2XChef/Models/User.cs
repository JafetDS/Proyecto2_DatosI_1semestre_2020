using System;
using System.Collections.Generic;
using System.Text;

namespace P2XChef.Models
{
    public class User
    {
        //Newtonsoft_Json
        //[JsonPropety{PropertyName = "RESIBIDO  de JAVA"]
        public int id { get; set; }
        public string nombre { get; set; }
        public string correo { get; set; }
        public List<string> seguidores { get; set; }
        public List<string> seguidos { get; set; }
        public List<string> recetas { get; set; }
    }
}
