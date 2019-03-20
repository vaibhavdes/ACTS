<?php
$answer=$_POST['found'];
class DBController {
	private $host = "localhost";
	private $user = "root";
	private $password = "";
	private $database = "registered_users";
	private $conn;

	
	function __construct() {
		$this->conn = $this->connectDB();
	}
	
	function connectDB() {
		$conn = mysqli_connect($this->host,$this->user,$this->password,$this->database);
		return $conn;
	}
	
	function runQuery($query) {
		$result = mysqli_query($this->conn,$query);
		while($row=mysqli_fetch_assoc($result)) {
			$resultset[] = $row;
		}		
		if(!empty($resultset))
			return $resultset;
	}
	
	function numRows($query) {
		$result  = mysqli_query($this->conn,$query);
		$rowcount = mysqli_num_rows($result);
		return $rowcount;	
	}
	
	function updateQuery($query) {
		$result = mysqli_query($this->conn,$query);
		if (!$result) {
			die('Invalid query: ' . mysqli_error($this->conn));
		} else {
			return $result;
		}
	}
	
	function insertQuery($query) {
		$result = mysqli_query($this->conn,$query);
		if (!$result) {
			die('Invalid query: ' . mysqli_error($this->conn));
		} else {
			return $result;
		}
	}
	
	function deleteQuery($query) {
		$result = mysqli_query($this->conn,$query);
		if (!$result) {
			die('Invalid query: ' . mysqli_error($this->conn));
		} else {
			return $result;
		}
	}
}
?>
