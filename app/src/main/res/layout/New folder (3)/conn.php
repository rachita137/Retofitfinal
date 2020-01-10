<?php
$host="localhost";
$database="68164";
$username="68164";
$password="chetan123";

$conn=mysqli_connect($host,$username,$password,$database);
if (mysqli_connect_errno())
 {
 echo "Failed to connect to MySQL: " . mysqli_connect_error();
 }
else
{
/*echo "Connection sucess.";*/
}

?>