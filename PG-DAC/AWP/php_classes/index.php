<?php
if(!empty($_POST["register-user"])) {
	/* Form Required Field Validation */
	/*foreach($_POST as $key=>$value) {
		if(empty($_POST[$key])) {
		$error_message = "All Fields are required";
		break;
		}
	}*/

	$email = $_POST['email'];
	$phone = $_POST['phone'];
	$address = $_POST['address'];
	$name = $_POST['name'];

	/* Email Validation */
	if(!isset($error_message)) {
		if (!filter_var($_POST["email"], FILTER_VALIDATE_EMAIL)) {
		$error_message = "Invalid Email Address";
		}
	}
	$action = $_POST['found'];
	if($action == "Add")
	{	
		if(!isset($error_message)) {
			require_once("dbcontroller.php");
			$db_handle = new DBController();
			$query = "INSERT INTO registered_users (email, name, phone, address) VALUES
			('" . $_POST["email"] . "', '" . $_POST["name"] . "', '" . $_POST["phone"] . "', '" . $_POST["address"] . "')";
			$result = $db_handle->insertQuery($query);
			if(!empty($result)) {
				$error_message = "";
				$success_message = "You have registered successfully!";	
				unset($_POST);
			} else {
				$error_message = "Problem in registration. Try Again!";	
			}
		}
	}
	if($action == "Delete")
	{	
		if(!isset($error_message)) {
			require_once("dbcontroller.php");
			$db_handle = new DBController();
			$query = "DELETE FROM registered_users WHERE email= '$email'";
			$result = $db_handle->insertQuery($query);
			if(!empty($result)) {
				$error_message = "";
				$success_message = "Record Deleted";	
				unset($_POST);
			} else {
				$error_message = "Problem in registration. Try Again!";	
			}
		}
	}
	if($action == "View")
	{	
		if(!isset($error_message)) {
			require_once("dbcontroller.php");
			$db_handle = new DBController();
			$query = "SELECT * FROM registered_users WHERE email = ".$_POST["email"]."";
			$conn = mysqli_connect("localhost","root","","registered_users");
			$result = mysqli_query($conn, $query);
			if($result) {
				$row = mysqli_fetch_array($result);
				echo "Name: ".$row['name']."<br>";
				echo "Email: ".$row['email']."<br>";
				echo "Phone: ".$row['phone']."<br>";
				echo "Address: ".$row['address']."<br>";
				unset($_POST);
			} else {
				$error_message = "Problem in registration. Try Again!";	
			}
		}
	}
	if($action == "Update")
	{	
		if(!isset($error_message)) {
			require_once("dbcontroller.php");
			$db_handle = new DBController();
			$query = "UPDATE registered_users SET name = '$name', phone = '$phone', address = '$address'  WHERE email = '$email'";
			$result = $db_handle->updateQuery($query);
			if(!empty($result)) {
				$error_message = "";
				$success_message = "Record Updated";	
				unset($_POST);
			} else {
				$error_message = "Problem in registration. Try Again!";	
			}
		}
	}
}
?>
<html>
<head>
<title>User Registration Form</title>
<style>
body{
	width:610px;
	font-family:calibri;
}
.error-message {
	padding: 7px 10px;
	background: #fff1f2;
	border: #ffd5da 1px solid;
	color: #d6001c;
	border-radius: 4px;
}
.success-message {
	padding: 7px 10px;
	background: #cae0c4;
	border: #c3d0b5 1px solid;
	color: #027506;
	border-radius: 4px;
}
.demo-table {
	background: #d9eeff;
	width: 100%;
	border-spacing: initial;
	margin: 2px 0px;
	word-break: break-word;
	table-layout: auto;
	line-height: 1.8em;
	color: #333;
	border-radius: 4px;
	padding: 20px 40px;
}
.demo-table td {
	padding: 15px 0px;
}
.demoInputBox {
	padding: 10px 30px;
	border: #a9a9a9 1px solid;
	border-radius: 4px;
}
.btnRegister {
	padding: 10px 30px;
	background-color: #3367b2;
	border: 0;
	color: #FFF;
	cursor: pointer;
	border-radius: 4px;
	margin-left: 10px;
}
</style>
</head>
<body>
<form name="frmRegistration" method="post" action="">
<table border="0" width="500" align="center" class="demo-table">
<?php if(!empty($success_message)) { ?>	
<div class="success-message"><?php if(isset($success_message)) echo $success_message; ?></div>
<?php } ?>
<?php if(!empty($error_message)) { ?>	
<div class="error-message"><?php if(isset($error_message)) echo $error_message; ?></div>
<?php } ?>
<tr>
<td>Add</td>
<td><input type="radio" class="demoInputBox" name="found" value="Add" checked></td>
</tr>
<tr>
<td>Delete</td>
<td><input type="radio" class="demoInputBox" name="found" value="Delete"></td>
</tr>
<tr>
<td>View</td>
<td><input type="radio" class="demoInputBox" name="found" value="View"></td>
</tr>
<tr>
<td>Update</td>
<td><input type="radio" class="demoInputBox" name="found" value="Update"></td>
</tr>
<tr>
<td>Email</td>
<td><input type="text" class="demoInputBox" name="email" value="<?php if(isset($_POST['email'])) echo $_POST['email']; ?>"></td>
</tr>
<tr>
<td>Name</td>
<td><input type="text" class="demoInputBox" name="name" value="<?php if(isset($_POST['name'])) echo $_POST['name']; ?>"></td>
</tr>
<tr>
<td>Phone Number</td>
<td><input type="text" class="demoInputBox" name="phone" value="<?php if(isset($_POST['phone'])) echo $_POST['phone']; ?>"></td>
</tr>
<tr>
<td>Address</td>
<td><input type="text" class="demoInputBox" name="address" value="<?php if(isset($_POST['address'])) echo $_POST['address']; ?>"></td>
</tr>
<tr>
<td colspan=2>
<input type="submit" name="register-user" value="Register" class="btnRegister"></td>
</tr>
</table>
</form>
</body></html>
