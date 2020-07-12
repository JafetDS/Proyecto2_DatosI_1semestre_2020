using System;
using System.Collections.Generic;
using System.Text;
using P2XChef.ViewModels;
using System.ComponentModel;
namespace P2XChef.Infraestructure
{
    class InstanceLocator 
    {

        #region Atributes
        public MainViewModels Main
        {
            get;
            set;
        }
        #endregion

        public InstanceLocator()   
        {
            this.Main = new MainViewModels();
        }

    }
}





