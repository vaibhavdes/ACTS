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
                    <img height="50px" width="50px" style="margin-top:10px;" src="images/profile.svg">
                    <h2>Hello, <?php echo $user['name'];?></h2>
                    <br>
                </div>                 
            </div>

            <div class="profile-section">
               <div class="inner-profile">
                    <h2><?php echo $user['email'];?></h2>
                    <br>
                </div>                 
            </div>

            <div class="profile-section">
               <div class="inner-profile">
                    <h4>Account Created<br><br><?php echo $user['reg'];?></h4>
                    <br>
                </div>                 
            </div>

            <div class="profile-section">
               <div class="inner-profile">
                    <h4>Mobile Number<br><br><?php echo $user['mobile'];?></h4>
                    <br>
                </div>                 
            </div>
        </div>
        
        <div class="space-hr"></div>
        
        <div class="profile-right">
            <div class="profile-section">
                <div class="login-content" style="margin-top:12px;">
                        
                </div>     
            </div>
      </div>
    </body>
</html>