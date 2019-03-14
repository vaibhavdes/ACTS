<?php
session_start();

include_once 'database/dbconnect.php';

if(isset($_POST['login']))
{
	$email = mysqli_real_escape_string($connect,$_POST['email']);
    $res=mysqli_query($connect,"SELECT * FROM users WHERE email='$email'");	
    
	$row=mysqli_fetch_array($res);
	if(password_verify($_POST["password"],$row['password']))
	{
		$_SESSION['user'] = $row['id'];
		setCookie( 'user' , $row['id'] , time() + (86400 * 30), "/");
	    header("Location: index.php");
		//once logged in refresh index or same page
	}
	else
	{
    echo 'It seems you have entered wrong email or password!'.mysqli_error($connect);
    }
}
?>