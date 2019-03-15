<?php

session_start();

if(empty($_SESSION['cart']))
    $_SESSION['cart'] = array();  



if(isset($_POST['pcod']))
{
    if(empty($_SESSION['user']))
    {
        header("Location: login.php");
    }
    else
    {
        header("Location: checkout.php");
    }
}

?>