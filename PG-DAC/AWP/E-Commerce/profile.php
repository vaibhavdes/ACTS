<?php
session_start();
?>
<html>
   <head>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
      <link rel="stylesheet" href="css/style.css">
      <link rel="stylesheet" href="css/style-profile.css">
      <link rel="stylesheet" href="css/style-login.css">

      <title>FlipKart</title>
   </head>
   <body>
   
   <?php include('pages/header.php');?>

    <!-- Profile -->
    <div class="profile">
        <div class="profile-left">
            <div class="profile-section">
               <div class="inner-profile">
                    <img height="50px" width="50px" style="margin-top:10px; margin-bottom: 10px;" src="images/profile.svg">
                    <h4>Hello, <?php echo $_SESSION['name'];?> </h4>
                    <h4><?php echo $_SESSION['email'];?> </h4>
                </div>  
            </div>
        </div>
        
        <div class="space-hr"></div>
        
        <div class="profile-right">
            <div class="profile-section">
                <div class="login-content" style="margin-top:12px;">
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
                </div>     
            </div>
      </div>

    </body>
</html>