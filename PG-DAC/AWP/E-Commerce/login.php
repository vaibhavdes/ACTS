<?php 
session_start();
include("classes/userLogin.php");
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
                    <h1><b>Login</b></h1>
                </div>
            </div>
            <div class="login-right">
               <div class="login-content">
                    <form method="post" action="#">
                    <table>
                        <tr><td><input type="email" name="email" style="border-bottom: 1px solid #e0e0e0;" placeholder="Enter Email"></td></tr>
                        <tr><td><input type="password" name="password" style="margin-top:15px;   border-bottom: 1px solid #e0e0e0;" placeholder="Enter Password"></td></tr>
                        <tr><td><input type="submit" name="login" style="background:#fb641b; color: white;" value="Login"></td></tr>
                        <tr><td><p style="text-align: center; color:#878787;">OR</p></td></tr>
                    </table>
                    </form>
                        <input type="submit" style="color: #2874f0; background: white;" value="Request OTP">
                </div>         
                <center><p style="font-family: 'Segoe UI'; color: #2874f0; margin-top:100px;">New to Flipkart? Create an account</p>  </center>
            </div>
        </div>
    </body>
</html>