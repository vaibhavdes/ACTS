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
                <form method="post" action="#">
                <div class="profile-section">
                    <div class="inner-profile">
                        <p>Select Category</p>
                        <div class"inner-content">
                            <input type="checkbox" name="check">
                            Clothing<br/>
                            <input type="checkbox" name="check">
                            Flowers<br/>
                            <input type="checkbox" name="check">
                            FootWear<br/>
                            <input type="checkbox" name="check">
                            MobilePhone
                        </div>
                    </div>                 
                </div>
                
                <div class="profile-section">
                    <div class="inner-profile">
                        <p>Price Range</p>
                        <div class"inner-content">
                            <input type="range" name="amountInputName" id="amountInputId" value="5000" min="0" max="10000" step="500" oninput="amountOutputId.value = amountInputId.value">
                            <b><output class="amountOutputName" name="amountOutputName" id="amountOutputId">5000</output></b>
                        </div>
                    </div>                 
                </div>

                <div class="profile-section">
                    <div class="inner-profile">
                        <p>Sort By</p>
                            <div class"inner-content">
                                <select>
                                    <option>Price Low to High</option>
                                    <option>Price High to Low</option>
                                    <option>Newest First</option>
                                    <option>Relevance</option>
                                    <option>Jaise Samjhe Vaisa</option>
                                </select>
                            </div>
                    </div>                 
                </div>

                <input type="submit" style="background: #fb641b;" value="Apply Filter">
            </div>
            
            <div class="space-hr"></div>
            
            <div class="profile-right">
                <div class="profile-section">
                    <div class="inner-profile">
                            <p>Showing Product List:</p>             
                    </div>
                    <div class"inner-content">
                        
                    <div class="product">
                    <?php
                    if(!empty($_GET["q"]))
                    {
                    $q = $_GET["q"];
                    $product = "SELECT * FROM products WHERE name LIKE '%".$q."%' ORDER BY id asc LIMIT 10";
                    $products = mysqli_query($connect, $product) or die(mysqli_error($connect));
                    while ($row = mysqli_fetch_array($products))
                    {                    
                        echo '
                        <div class="product-item">
                            <div class="product-image">
                                <a href="detailProduct.php?prodid='.$row['id'].'">
                                <img width="200px" height="200px" src="images/'.$row['image'].'">
                                </a>
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
                    else
                    {
                        echo "No Product Found";
                    }
                    ?>                 
                    </div>

                    </div>
                </div>
        </div>
    </body>
</html>







<?php
/*session_start();
    foreach($_SESSION['cart'] as $item) {
                echo $item;            
        }
*/
        ?>