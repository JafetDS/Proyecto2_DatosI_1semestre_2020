using System;
using System.Collections.Generic;
using System.Text;

namespace P2XChef.ViewModels
{

    class MainViewModels
    {

        #region ViewModels
        public Page1ViewModels Login
        {
            get;
            set;
        }
        #endregion

        #region Constructor
        public MainViewModels()
        {
            this.Login = new Page1ViewModels();
        }
        #endregion
    }
}
