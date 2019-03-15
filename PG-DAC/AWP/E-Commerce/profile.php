<?php
    include("classes/session.php");
?>
<html>
   <head>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
      <link rel="stylesheet" href="css/style.css">
      <link rel="stylesheet" href="css/style-profile.css">
      <link rel="stylesheet" href="css/style-login.css">
      <title>FlipKart</title>
   </head>
   <body>
   
   <?php include('pages/header.php');?>

    <!-- Profile -->
    <div class="profile">
        <div class="profile-left">
            <div class="profile-section">
               <div class="inner-profile">
                    <img height="50px" width="50px" style="margin-top:10px;" src="images/profile.svg">
                    <h2>Hello,<?php echo $user['name'];?></h2>
                    <br>
                </div>                 
            </div>

            <div class="profile-section">
               <div class="inner-profile">
                    <h4>Email<br><br><?php echo $user['email'];?></h2>
                    <br>
                </div>                 
            </div>

            <div class="profile-section">
               <div class="inner-profile">
                    <h4>Account Created<br><br><?php echo $user['reg'];?></h4>
                    <br>
                </div>                 
            </div>

            <div class="profile-section">
               <div class="inner-profile">
                    <h4>Mobile Number<br><br><?php echo $user['mobile'];?></h4>
                    <br>
                </div>                 
            </div>
            
        </div>
        
        <div class="space-hr"></div>
        
        <div class="profile-right">
            <div class="profile-section">
                <div class="inner-profile">
                        <div class="inner-content">
                            <h3>Orders</h3>


                                <div class="product">
                                <table width="100%" style="text-align:center;">
                                <th>
                                    <td><b>Order ID</b></td>
                                    <td><b>Payment Mode</b></td>
                                    <td><b>Date of Order</b></td>
                                    <td><b>Amount</b></td>
                                </th>
                                <?php
                                $i = 1;
                                $q = $user["id"];
                                $product = "SELECT * FROM orders WHERE userid LIKE '%".$q."%' ORDER BY id desc LIMIT 10";
                                $products = mysqli_query($connect, $product) or die(mysqli_error($connect));
                                while ($row = mysqli_fetch_array($products))
                                {                    
                                    echo '
                                    <tr>
                                    <td>'.$i.'</td>
                                    <td>'.$row['orderid'].'</td>
                                    <td>'.$row['payment'].'</td>
                                    <td>'.$row['date'].'</td>
                                    <td>₹ 0/-</td>
                                    </tr>
                                    ';    
                                    $i++;         
                                }
                                ?>       
                                </table>          
                                </div>
                        </div>
                </div>  
            </div>        
      </div>
    </body>
</html>