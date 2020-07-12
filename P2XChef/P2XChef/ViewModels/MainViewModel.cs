using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Diagnostics;
using System.Text;

namespace P2XChef.ViewModels
{
    public partial class MainViewModel : Component
    {
        public MainViewModel()
        {
            InitializeComponent();
        }

        public MainViewModel(IContainer container)
        {
            container.Add(this);

            InitializeComponent();
        }
    }
}
