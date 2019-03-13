<html>
    <head>
        <title>FlipKart</title>
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/style-login.css">

    </head>
    <body>
        <div class="head">
            <p class="head-text"><b>FlipKart</b></p>
            <div class="search-box">
                <input type="text" class="search-product" placeholder="Search for products, brands and more...">
                <svg  class="search-icon" xmlns="http://www.w3.org/2000/svg"><g fill="#2874F1" fill-rule="evenodd"><path class="_2BhAHa" d="m11.618 9.897l4.225 4.212c.092.092.101.232.02.313l-1.465 1.46c-.081.081-.221.072-.314-.02l-4.216-4.203"></path><path class="_2BhAHa" d="m6.486 10.901c-2.42 0-4.381-1.956-4.381-4.368 0-2.413 1.961-4.369 4.381-4.369 2.42 0 4.381 1.956 4.381 4.369 0 2.413-1.961 4.368-4.381 4.368m0-10.835c-3.582 0-6.486 2.895-6.486 6.467 0 3.572 2.904 6.467 6.486 6.467 3.582 0 6.486-2.895 6.486-6.467 0-3.572-2.904-6.467-6.486-6.467"></path></g></svg>
            </div>
            <div class="head-menu" >
                <a href="login.html">
                <p class="menu-items" style=" margin-left: 8%; ">Login</p>
                </a>
                <p class="menu-items" style=" margin-left: 16%; ">Register</p>
                <p class="menu-items" style=" margin-left: 24%; ">Cart</p>
            </div>
        </div>


        <div class="login">
            <div  class="login-left">
                <div class="login-content">
                    <h1><?php echo "Welcome to FlipKart"; ?></h1>
                    <h1><b>Login</b></h1>
                </div>
            </div>
            <div class="login-right">
               <div class="login-content">
                    <form>
                    <table>
                        <tr><td><input type="email" style=" border-bottom: 1px solid #e0e0e0;" placeholder="Enter Email"></td></tr>
                        <tr><td><input type="password" style="margin-top:15px;   border-bottom: 1px solid #e0e0e0;" placeholder="Enter Password"></td></tr>
                        <tr><td><input type="submit" style="background:#fb641b; color: white;" value="Login"></td></tr>
                        <tr><td><p style="text-align: center; color:#878787;">OR</p></td></tr>
                        <tr><td><input type="submit" style="color: #2874f0; background: white;" value="Request OTP"></td></tr>
                    </table>
                    </form>
                </div>         
                <center><p style="font-family: 'Segoe UI'; color: #2874f0; margin-top:120px;">New to Flipkart? Create an account</p>  </center>
            </div>
        </div>
