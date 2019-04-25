 <?php 



$host="localhost";
$port=3306;
$socket="";
$user="root";
$password="";
$dbname="Assignment_Tracker";

$con = new mysqli($host, $user, $password, $dbname, $port, $socket); 
	if ($con) {
	echo "successful";
}
else{
	echo "not successful";
}
?>