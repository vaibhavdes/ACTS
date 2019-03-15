<?php

    if(isset($_POST['addtocart']))
    {
        $flag = 0;
        
        foreach($_SESSION['cart'] as $item) {
                if($item == $_POST['productId'])
                {
                    $flag = 1;
                }
        }   
        
        if($flag==0)
        {
            array_push($_SESSION['cart'], $_POST['productId']);
            echo '<script language="javascript">';
            echo 'alert("Product Added to Cart")';
            echo '</script>';
        }   
        else
        {
            echo '<script language="javascript">';
            echo 'alert("Item Already in Cart")';
            echo '</script>';
        }

        
    }
?>