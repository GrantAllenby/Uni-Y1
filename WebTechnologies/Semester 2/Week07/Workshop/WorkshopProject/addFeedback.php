<!DOCTYPE html>
<html lang ="en">

<head>
    <meta charset="UTF-8">
    <title>Add Feedback</title>
</head>

<?php
include 'database_conn.php';
$custForename = isset ($_REQUEST['custForename']) ? $_REQUEST['custForename'] : null;
$custSurname = isset ($_REQUEST['custSurname']) ? $_REQUEST['custSurname'] : null;
$custEmail = isset ($_REQUEST['custEmail']) ? $_REQUEST['custEmail'] : null;
$rLocation = isset ($_REQUEST['rLocation']) ? $_REQUEST['rLocation'] : null;
$qService = isset($_REQUEST['qService']) ? $_REQUEST['qService'] : null;
$qFood = isset($_REQUEST['qFood']) ? $_REQUEST['qFood'] : null;
$moreFeedback = isset($REQUEST['moreFeedback']) ? $_REQUEST['moreFeedback'] : 'none given';
$error = 'false';

if (empty($custForename) || empty($custSurname) || empty($custEmail) || empty($rLocation) || empty($qService) || empty($qFood)) {
    $error = 'true';
}

if ($error = 'true') {
    echo "<p>Details not inputted, please try again.</p>\n";
}
else {
    $insertSQL = "INSERT INTO fine_feedback (custForename, custSurname, custEmail, rLocation, qService, qFood, moreFeedback)
     VALUES ('$custForename','$custSurname','$custEmail','$rLocation','$qService','$qFood','$moreFeedback')";

}
?>

