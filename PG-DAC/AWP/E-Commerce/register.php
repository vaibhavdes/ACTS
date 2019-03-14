<?php 
session_start();
include("classes/newUser.php");
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
                        <tr><td>
                        <select name="state" required>
                            <option value="">------------Select State------------</option>
                            <option value="Andaman and Nicobar Islands">Andaman and Nicobar Islands</option>
                            <option value="Andhra Pradesh">Andhra Pradesh</option>
                            <option value="Arunachal Pradesh">Arunachal Pradesh</option>
                            <option value="Assam">Assam</option>
                            <option value="Bihar">Bihar</option>
                            <option value="Chandigarh">Chandigarh</option>
                            <option value="Chhattisgarh">Chhattisgarh</option>
                            <option value="Dadra and Nagar Haveli">Dadra and Nagar Haveli</option>
                            <option value="Daman and Diu">Daman and Diu</option>
                            <option value="Delhi">Delhi</option>
                            <option value="Goa">Goa</option>
                            <option value="Gujarat">Gujarat</option>
                            <option value="Haryana">Haryana</option>
                            <option value="Himachal Pradesh">Himachal Pradesh</option>
                            <option value="Jammu and Kashmir">Jammu and Kashmir</option>
                            <option value="Jharkhand">Jharkhand</option>
                            <option value="Karnataka">Karnataka</option>
                            <option value="Kerala">Kerala</option>
                            <option value="Lakshadweep">Lakshadweep</option>
                            <option value="Madhya Pradesh">Madhya Pradesh</option>
                            <option value="Maharashtra">Maharashtra</option>
                            <option value="Manipur">Manipur</option>
                            <option value="Meghalaya">Meghalaya</option>
                            <option value="Mizoram">Mizoram</option>
                            <option value="Nagaland">Nagaland</option>
                            <option value="Orissa">Orissa</option>
                            <option value="Pondicherry">Pondicherry</option>
                            <option value="Punjab">Punjab</option>
                            <option value="Rajasthan">Rajasthan</option>
                            <option value="Sikkim">Sikkim</option>
                            <option value="Tamil Nadu">Tamil Nadu</option>
                            <option value="Tripura">Tripura</option>
                            <option value="Uttaranchal">Uttaranchal</option>
                            <option value="Uttar Pradesh">Uttar Pradesh</option>
                            <option value="West Bengal">West Bengal</option>
                        </select>
                        <tr></td>
                        <tr><td><input type="number" name="mobile" placeholder="Enter Mobile"></td></tr>
                        <tr><td>Gender : 
                                    <input type="radio" name="gender" value="male"> Male
                                    <input type="radio" name="gender" value="female"> Female
                        <tr><td><input type="password" name="password" placeholder="Enter Password"></td></tr>
                        <tr><td><input type="submit" name="register" style="background:#fb641b; color: white;" value="Register"></td></tr>
                    </table>
                    </form>
                </div>         
            </div>
        </div>

    </body>
</html>