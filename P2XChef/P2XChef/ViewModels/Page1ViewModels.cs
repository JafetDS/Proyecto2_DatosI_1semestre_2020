using System;
using System.Collections.Generic;
using System.Text;
using System.Windows.Input;

namespace P2XChef.ViewModels
{
    class Page1ViewModels
    {
        private string Nombre
        {
            get;
            set;
        }

        public bool IsRemembered
        {
            get;
            set;

        }


        #region Commands
        public ICommand LoginCommand
        {
            get;
            set;
        }
        #endregion

        #region Costructor
        public Page1ViewModels()
        {
            this.IsRemembered = true;
        }
            
        #endregion
    }
}
