<html>
    <head>
        <title>FlipKart</title>
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        
        <?php include('pages/header.php');?>

        <div class="section-banner" style="background-image:url('images/background.jpg');"></div>             
        <div class="sections">
            <div class="product">
                <p class="section-text">Deals of the Day</p>

                <?php
                $product = "SELECT * FROM products ORDER BY id asc LIMIT 3";
                $products = mysqli_query($connect, $product) or die(mysqli_error($connect));
                $var = 0;
                while ($row = mysqli_fetch_array($products))
                {                    
                    echo '
                    <div class="product-item" style=" margin-left: '.$var.'%; ">
                        <a href="detailProduct.php?prodid='.$row[id].'">
                        <img class="product-image"  src="images/'.$row[image].'">
                        </a>
                        <h3>'.$row[name].'</h3>
                        <p>Price: Rs <b>'.$row[price].'/-</b></p>
                    </div>                       
                    ';             
                    $var = $var + 20;       
                }
                ?>                 
            </div>
            <div class="ads-banner">
                    <img width="280px" height="350px"  src="images/ad_banner.png">
            </div>
        </div>
    </body>
</html>
