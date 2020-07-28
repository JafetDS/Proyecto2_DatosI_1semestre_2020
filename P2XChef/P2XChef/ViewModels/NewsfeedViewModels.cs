using GalaSoft.MvvmLight.Command;
using Newtonsoft.Json;
using P2XChef.Models;
using P2XChef.Service;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Net.Http;
using System.Runtime.InteropServices;
using System.Text;
using Xamarin.Forms;
using GalaSoft.MvvmLight.Command;
using System.Windows.Input;

namespace P2XChef.ViewModels
{
    public class NewsfeedViewModels :  BaseViewModels

    {

        private ApiService apiService;
        #region Attributes
        private ObservableCollection<User> users;

        private string filter;
        private List<User> UsersList;

        #endregion

        public ObservableCollection<User> Users
        {
            get { return this.users; }
            set { SetValue(ref this.users, value); }
        }
        public NewsfeedViewModels()
        {
            this.apiService = new ApiService();
            this.LoadNews();

        }
         public String Filter
        {
            get { return this.filter; }
            set { SetValue (ref this.filter,value); }
        }


        private async void LoadNews()
        {
            var response = await this.apiService.GetList<User>("http://10.0.0.2:8080", "/aplication/users", "");
            if (!response.IsSuccess)
            {
                await Application.Current.MainPage.DisplayAlert("error", response.Message, "Accep");
               return;
            }

            var UsersList = (List<User>)response.Result;
            this.Users = new ObservableCollection<User>(UsersList);

        }

        private async void Buscar()
        {
            var response = await this.apiService.GetList<User>("http://10.0.0.2:8080", "/aplication/users",Filter );
            if (!response.IsSuccess)
            {
                await Application.Current.MainPage.DisplayAlert("error", response.Message, "Accep");
                return;
            }

            var UsersList = (List<User>)response.Result;
            this.Users = new ObservableCollection<User>(UsersList);

        }


        private async void LoadNews2()
        {
            HttpClient client = new HttpClient();

            var response = await client.GetStringAsync("http://10.0.0.2:8080/aplication/users");
            var list =  JsonConvert.DeserializeObject<List<User>>(response);
            this.Users = new ObservableCollection<User>(list);
        }


        public ICommand RefreshCommand
        {
            get { return new RelayCommand(LoadNews); }
        }

        public ICommand SearchCommand
        {
            get
            {
                return new RelayCommand(Search);

            }
        }
            
        private void Search()
        {
            if (string.IsNullOrEmpty(this.Filter))
            {
                this.Users = new ObservableCollection<User>(this.UsersList);
            }
            else
            {
                Buscar();
                this.Users = new ObservableCollection<User>(this.UsersList);
            }
        }



    }
}
