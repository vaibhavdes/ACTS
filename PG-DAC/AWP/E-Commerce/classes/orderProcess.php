<?php

include_once 'database/dbconnect.php';


if(!empty($_SESSION['user']))
{
    $res=mysqli_query($connect,"SELECT * FROM users WHERE id=".$_SESSION['user']);
    $user=mysqli_fetch_array($res);
}

if(isset($_POST['checkout']))
{
    $address = mysqli_real_escape_string($connect,$_POST['address']);
    $pincode = mysqli_real_escape_string($connect,$_POST['pincode']);
    $payment = mysqli_real_escape_string($connect,$_POST['payment']);
    $userid = $user['id'];
    date_default_timezone_set("Asia/Calcutta");   //India time (GMT+5:30)
    $date= date('d-m-Y H:i:s');
    $orderid = rand(10000,99999);
    
    if(mysqli_query($connect,"INSERT INTO orders (orderid,userid,address,pincode,payment,date) VALUES ('$orderid','$userid','$address','$pincode','$payment','$date')"))
	{		
        unset($_SESSION['cart']);
	    header("Location: success.php?orderId=".$orderid);
	}
	else
	{
	    echo 'Unable to Process Order!'. mysqli_error($connect);
	}
}

?>
