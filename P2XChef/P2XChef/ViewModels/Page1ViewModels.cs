using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Text;
using System.Windows.Input;
using GalaSoft.MvvmLight.Command;
using P2XChef.Views;
using Xamarin.Forms;

namespace P2XChef.ViewModels
{
    public class Page1ViewModels : BaseViewModels
    {

        #region Events1
        public event PropertyChangedEventHandler PropertyChanged;
        #endregion
        #region Attributies
        private string atEmail;
        private bool atIsEnabled;
        #endregion


        #region Properties

        public bool IsEnable
        {
            get;
            set;
        }
        public string Nombre
        {
            get;
            set;
        }

        public bool IsRemembered
        {
            get;
            set;

        }

        public bool IsRunning
        {
            get;
            set;
        }

        public string Email
        {
            get
            {
                return this.atEmail;
            }
            set
            {
                SetValue(ref this.atEmail, value);
            }
        }
        #endregion



        #region Costructor
        public Page1ViewModels()
        {
            this.IsRemembered = true;
            this.IsEnable = true;
        }



        #endregion

        #region Commands
        public ICommand LoginCommand
        {
            get
            {
                return new RelayCommand(Login);
            }

        }

        public ICommand LoginAplication
        {
            get
            {
                return new RelayCommand(Next);
            }

        }
        #endregion

        #region Events


        private async void Next()
        {
            MainViewModels.GetInstance().Newsfeed = new NewsfeedViewModels();
            await Application.Current.MainPage.Navigation.PushAsync(new Newsfeed());
        }
        private async void Login()
        {
            if (string.IsNullOrEmpty(this.Email))
            {
                await Application.Current.MainPage.DisplayAlert("Error", "Ingrese Email", "Accept");
                return;
            }

            if (this.Email.Equals("1234"))
            {
                await Application.Current.MainPage.DisplayAlert("Advertencia", "Digite de nuevo", "Accep");
                this.Email = String.Empty;
                return;
            }


        }
        #endregion

    }
}
