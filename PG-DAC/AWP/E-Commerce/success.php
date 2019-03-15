<?php
    include("classes/session.php");
?>
<?php
    include("classes/orderProcess.php");
?>
<html>
    <head>
        <title>FlipKart</title>
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/style-search.css">
        <link rel="stylesheet" href="css/style-login.css">

    </head>
    <body>
        <?php include('pages/header.php');?><?php>

        <!-- Cart -->
        <div class="profile">
            <div class="profile-left">  
            </div>
            
            <div class="space-hr"></div>
            
            <div class="profile-right">
                <div class="profile-section">
                    <div class="inner-profile">
                    <div class="login-content">
                        <?php
                        echo "Order Placed Succesfully.<br><br>Order ID is <b>".$_GET['orderId']."</b>";
                        echo "<br><br><a href='index.php'>Go To Home</a>";
                        ?>
                </div>                                     
                    </div>                   
                </div>
        </div>
    </body>
</html>







