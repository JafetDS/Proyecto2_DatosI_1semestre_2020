using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Diagnostics;
using System.Text;
using P2XChef.ViewModels;

namespace P2XChef.Infraestructure
{
    public partial class IntanceLocator : Component
    {
        #region Atributes
        public MainViewModel Main
        {
            get;
            set;
        }
            

        #endregion
        public IntanceLocator()
        {
            InitializeComponent();
        }
       
        public IntanceLocator(IContainer container)
        {
            container.Add(this);

            InitializeComponent();
        }
    }
}
