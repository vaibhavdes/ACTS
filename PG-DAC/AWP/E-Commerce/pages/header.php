<?php
include_once("database/dbconnect.php");
include_once("classes/cart.php");

if(!empty($_SESSION['user']))
{
    $res=mysqli_query($connect,"SELECT * FROM users WHERE id=".$_SESSION['user']);
    $user=mysqli_fetch_array($res);
}
?>
<div class="head">
    <div class="head-text">
    <a href="index.php"><b>FlipKart</b></a>
    </div>
    <div class="search-box">
        <form method="GET" action="product.php">
        <input type="text" list="search" name="q" class="search-product" placeholder="Search for products, brands and more...">
            <datalist id="search" name="searchList">
                <option value="Flowers">
                <option value="Clothings">
                <option value="Mobile Phones">
                <option value="Medicines">
                <option value="Footwear">
                <option value="                                                                                                    ">
            </datalist>
        <svg  class="search-icon" xmlns="http://www.w3.org/2000/svg"><g fill="#2874F1" fill-rule="evenodd"><path class="_2BhAHa" d="m11.618 9.897l4.225 4.212c.092.092.101.232.02.313l-1.465 1.46c-.081.081-.221.072-.314-.02l-4.216-4.203"></path><path class="_2BhAHa" d="m6.486 10.901c-2.42 0-4.381-1.956-4.381-4.368 0-2.413 1.961-4.369 4.381-4.369 2.42 0 4.381 1.956 4.381 4.369 0 2.413-1.961 4.368-4.381 4.368m0-10.835c-3.582 0-6.486 2.895-6.486 6.467 0 3.572 2.904 6.467 6.486 6.467 3.582 0 6.486-2.895 6.486-6.467 0-3.572-2.904-6.467-6.486-6.467"></path></g></svg>
        </form>
    </div>
    <div class="head-menu" >        
        <?php
        if(!empty($_SESSION['user']))
        {
            
            echo'
            <a href="profile.php">
            <p class="menu-items" style=" margin-left: 8%; ">Profile</p>
            </a>';

            if(count($_SESSION['cart'])<=0)
                echo '<p class="menu-items" style="margin-left: 16%; ">Cart</p>';
            else    
                echo '<a href="cart.php"><p class="menu-items" style="margin-left: 16%; ">Cart ('.count($_SESSION['cart']).')</p></a>';

            echo '<a href="logout.php">
            <p class="menu-items" style=" margin-left: 24%; ">Logout</p>
            </a>
            ';
            
        }
        else
        {                   
            echo'
            <a href="login.php">
            <p class="menu-items" style=" margin-left: 8%; ">Login</p>
            </a>
            <a href="register.php">
            <p class="menu-items" style=" margin-left: 16%; ">Register</p>
            </a>';
            
            if(count($_SESSION['cart'])<=0)
                echo '<p class="menu-items" style="margin-left: 24%; ">Cart</p>';
            else    
                echo '<a href="cart.php"><p class="menu-items" style="margin-left: 24%; ">Cart ('.count($_SESSION['cart']).')</p></a>';
        }
        ?>
    </div>
</div>