<?php
    include("classes/session.php");
?>
<html>
    <head>
        <title>FlipKart</title>
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/style-product.css">
    </head>
    <body>
        <?php include('pages/header.php');?>

        <?php
        if(!empty($_GET['prodid']))
        {
           // $prodid = mysqli_real_escape_string($_GET['prodid']);
            $res=mysqli_query($connect,"SELECT * FROM products WHERE id=".$_GET['prodid']);
            $product=mysqli_fetch_array($res);
        }
        ?>
        <div class="product">
             <div  class="product-left">
                <div class="product-content">
                    <img src="images/<?php echo $product['image'];?>">
                </div>
                <form method="post" action="#">
                    <input type="hidden" name="productId" style="background: #ff9f00;" value="<?php echo $product['id'];?>">
                    <?php 
                        if($product['stock']>0)
                        {
                            echo '<input type="submit" name="addtocart" style="background: #ff9f00;" value="Add to Cart">';
                        }
                        else
                        {
                            echo '<input type="submit" name="addtocart" style="background: #fb641b;" value="Coming Soon" disabled>';     
                        }
                        ?>
                    
                    <input type="submit" name="buynow" style="background: #fb641b;" value="Buy Now">
                </form>
            </div>
            <div class="product-right">
               <div class="product-content">
                    <p class="title"><?php echo $product['name'];?></p>
                    <p class="title" style="font-size: 32px;">₹ <?php echo $product['price'];?></p> 
                    
                        <?php 
                            if($product['stock']>10)
                            {
                                echo '<p style="font-size:20px;font-weight:500;">In Stock</p>';
                            }
                            else if($product['stock']<10 && $product['stock']>0)
                            {
                                echo '<p style="font-size:20px;font-weight:500;">'.$product['stock'].' Left In Stock</p>';
                            }
                            else 
                            {
                                echo '<p style="font-size:36px;font-weight:500;">Out of Stock</p>';
                            }
                        ?>

                    <div class="feature">
                        <div class="heading" style="color:#878787;"> Highlights </div>
                        <div class="features" style="margin-left:15%;">
                        <table>
                            <tr>
                                <td>
                            <li class="features">Material: Plastic</li>
                            <li class="features">Minimum Age: 5 years</li>
                            <li class="features">Skillset: Color & Shape Recognition</li>
                                </td>
                                <td>
                            <li class="features">10 Days Replacement Policy?</li>
                            <li class="features">Cash on Delivery available?</li>
                            <li class="features">Free shipping₹40</li>
                                </td>
                            </tr>
                        </table>                             
                        </div> 
                    </div>
               </div>   
               <details>
                    <summary>Product Details</summary>
                        <?php echo nl2br($product['detail']);?>
                </details>         
            </div>
        </div>
    </body>
</html>