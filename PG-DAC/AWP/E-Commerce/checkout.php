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
                    <p>Enter Delivery Address</p>
                    <form method="post" action="#">
                    <table>
                        <tr><td><textarea name="address" row="3" style="border-bottom: 1px solid #e0e0e0;" placeholder="Enter Address"></textarea></td></tr>
                        <tr><td><input type="text" name="pincode" style="margin-top:15px;   border-bottom: 1px solid #e0e0e0;" placeholder="Enter Pincode"></td></tr>
                        <tr><td>Payment Method</td></tr>
                        <tr><td>
                                <input type="radio" value="OP" name="payment">Online Payment
                                <input type="radio" value="COD" name="payment">Cash on Delivery
                        </td></tr>
                    </table>
                </div>                                     
                    </div>
                    <div class"inner-content">   
                        <input type="submit" name="checkout" style="background: #fb641b; width:20%; " value="Place Order">     
                        </form>
                    </div>
                </div>
        </div>
    </body>
</html>







