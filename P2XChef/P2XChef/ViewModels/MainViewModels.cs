using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Text;

namespace P2XChef.ViewModels
{

    public class MainViewModels
    {


        #region ViewModels
        public Page1ViewModels Login
        {
            get;
            set;
        }

        public NewsfeedViewModels Newsfeed
        {
            get;
            set;
        }
        #endregion

        #region Constructor
        public MainViewModels()
        {
            instance = this;
            this.Login = new Page1ViewModels();
        }
        #endregion

        #region Singleton
        private static MainViewModels instance;
        public static MainViewModels GetInstance()
        {
            if(instance == null)
            {

                return new MainViewModels(); 
            }
            return instance;
        }

        #endregion
    }
}
