using System;
using System.Collections.Generic;
using System.Text;

namespace P2XChef.Models
{
    class Response
    {

        public bool IsSuccess
        {
            get;
            set;

        }

        public String Message
        {
            get;
            set;
        }

        public object Result
        {
            get;
            set;
        }
    }
}
