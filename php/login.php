<?php 
require "connect.php";
// $query = "select * from Student;";

$query = "select * from student";


if ($stmt = $con->prepare($query)) {
    $stmt->execute();
    $stmt->bind_result($field1, $field2);
    while ($stmt->fetch()) {
        //printf("%s, %s\n", $field1, $field2);
    }
    $stmt->close();
}

// result = mysqli_query($con, $query);
// /*
// $student_No = $_POST["student_No"];
// $password = $_POST["password"];
// */



// if(mysqli_query($con,$query))
// {
// 	$row = mysqli_fetch_assoc($result);
// 	$name = $row["username"];
// 	echo "welcome".$name;
// }else{
// 	echo "failed";
// }

?>

