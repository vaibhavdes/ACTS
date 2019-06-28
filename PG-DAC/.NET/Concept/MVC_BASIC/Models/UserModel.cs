using System;
using System.Collections.Generic;
using System.Linq;
using System.Web;

namespace PahilaMVC.Models
{
    public class UserModel
    {
        public string EmailID { get; set; }
        public string Password { get; set; }
        public string FirstName { get; set; }
        public string LastName { get; set; }
        public string City { get; set; }
        public string Gender { get; set; }
        public string UserImage { get; set; }
        
    }
}
