<?php
		
$username = 'root';
$password = '';
$host = 'localhost';
$dbname = 'ecommerce';
$connect = mysqli_connect($host,$username,$password) or die("Unable to establish connection with MySQL Server..!");
$sel_db = mysqli_select_db($connect,$dbname) or die('Unable to Connect DB, Check your selected Database Domain..!');

  // Create connection
$conn = new mysqli($host, $username, $password, $dbname);

  // Check connection
if ($conn->connect_error) 
{
    die("Connection failed: " . $conn->connect_error);
}
?>