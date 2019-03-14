<?php
session_start();

    $_SESSION['cart'] = array( );  

    if(isset($_POST['addtocart']))
    {
        array_push($_SESSION['cart'], $_POST['productId']);

        echo '<script language="javascript">';
        echo 'alert("Product Added to Cart")';
        echo '</script>';
    }
?>