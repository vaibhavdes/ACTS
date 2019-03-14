<?php 
session_start();

if(!empty($_POST['name']))
{
    $_SESSION['login_status'] = 1;
    $_SESSION['name'] = $_POST['name'];
    $_SESSION['email'] = $_POST['email'];
    header('Location: profile.php');
}

?>
<html>
    <head>
        <title>FlipKart</title>
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/style-login.css">

    </head>
    <body>
        <?php include('pages/header.php');?>
        
        <div class="login">
            <div  class="login-left">
                <div class="login-content">
                    <h1><?php echo "Welcome to FlipKart"; ?></h1>
                </div>
            </div>
            <div class="login-right">
               <div class="login-content">
                    <form method="post" action="#">
                    <table>
                        <tr><td><input type="text" name="name" placeholder="Enter Your Name"></td></tr>
                        <tr><td><input type="email" name="email" placeholder="Enter Email"></td></tr>
                        <tr><td><input type="password" placeholder="Enter Password"></td></tr>
                        <tr><td><input type="submit" style="background:#fb641b; color: white;" value="Register"></td></tr>
                        <tr><td><p style="text-align: center; color:#878787;">OR</p></td></tr>
                        <tr><td><input type="submit" style="color: #2874f0; background: white;" value="Login"></td></tr>
                    </table>
                    </form>
                    <?php echo $_SESSION["name"];?>
                </div>         
            </div>
        </div>

    </body>
</html>