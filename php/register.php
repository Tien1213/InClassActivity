<?php
    require "connect.php";
    $student_No = $_POST["student_No"];
    $user_first = $_POST["firstName"];
    $user_last = $_POST["lastName"];
    $user_pass = $_POST["password"];

    $user_null = "null";
    $mysql_qry = "INSERT INTO `student`(`student_No`, `firstName`, `lastName`, `password`, 
    `submissionRate`, `Teacher_userName`) VALUES ('$student_No','$user_first','$user_last','$user_pass',
    '$user_null','$user_null')";
    
    if($con->query($mysql_qry) === TRUE) {
        echo $user_first;
    }
    else {
        echo "Failure";
    }
    $con->close();
?>