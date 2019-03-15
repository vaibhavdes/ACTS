<?php

include_once 'database/dbconnect.php';

if(isset($_POST['register']))
{
    $name = mysqli_real_escape_string($connect,$_POST['name']);
    $email = mysqli_real_escape_string($connect,$_POST['email']);
    $state = mysqli_real_escape_string($connect,$_POST['state']);
    $mobile = mysqli_real_escape_string($connect,$_POST['mobile']);
    $gender = mysqli_real_escape_string($connect,$_POST['gender']);
    $password = password_hash($_POST["password"],PASSWORD_DEFAULT);
    date_default_timezone_set("Asia/Calcutta");   //India time (GMT+5:30)
    $dob= date('d-m-Y H:i:s');
    
    if(mysqli_query($connect,"INSERT INTO users (name,email,state,mobile,gender,password,reg) VALUES ('$name','$email','$state','$mobile','$gender','$password','$dob')"))
	{		
	    header("Location: login.php");
	}
	else
	{
	    echo 'Unable to Register!'. mysqli_error($connect);
	}
}

?>
