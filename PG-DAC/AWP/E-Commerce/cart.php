<?php
    include("classes/session.php");
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
                            <p>Products in Cart:</p>             
                    </div>
                    <div class"inner-content">
                        
                    <div class="product">
                    <?php
                    if(!empty($_SESSION['cart']))
                    {
                    foreach($_SESSION['cart'] as $item) 
                        {                       
                            $product = "SELECT * FROM products WHERE id = $item";
                            $products = mysqli_query($connect, $product) or die(mysqli_error($connect));
                            while ($row = mysqli_fetch_array($products))
                            {                    
                                echo '
                                <div class="product-item">
                                    <div class="product-image">                                        
                                        <img width="200px" height="200px" src="images/'.$row['image'].'">                                       
                                    </div>
                                    <div class="product-info">
                                        <div class="product-detail">
                                            <h3>'.$row['name'].'</h3>
                                            <p>'.nl2br($row['detail']).'</p>
                                        </div>
                                        <div class="product-price">
                                            <p> <b>₹'.$row['price'].'/-</b></p>
                                            <img height="25px" width="80px" src="images/assured.png">
                                        </div>
                                    </div>
                                </div>                       
                                ';             
                            }
                        }
                    }
                    else
                    {
                        echo "No Product in Cart";
                    }
                    ?>                 
                    </div>
                    <form method="post">
                        <input type="submit" name="pcod" style="background: #fb641b; width:20%; " value="Proceed to Check Out">     
                    </form>
                    </div>
                </div>
        </div>
    </body>
</html>







