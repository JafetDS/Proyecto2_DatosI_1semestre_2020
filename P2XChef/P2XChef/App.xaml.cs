using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using P2XChef.Views;
using Xamarin.Forms;
using Xamarin.Forms.Xaml;

namespace P2XChef
{
    public partial class App : Application
    {
        #region Constructors
        public App()
        {
            InitializeComponent();

            this.MainPage =new NavigationPage( new Page1());
        }
        #endregion

        #region Methods
        protected override void OnStart()
        {
        }

        protected override void OnSleep()
        {
        }

        protected override void OnResume()
        {
        }
        #endregion
    }
}
