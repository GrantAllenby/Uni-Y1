<!DOCTYPE html>

<html lang="en">

<head>

    <meta name="viewport" content="width=device-width, initial-scale=1">

    <meta charset="UTF-8">
    <link href="index.css" rel="stylesheet" type="text/css">

    <title>Find Out More</title>

<body>

<div id="banner">
    <h1>Chollerton Tearooms</h1> <!-- Advertises the name of the page. -->
    <img class="teapot" src="../images/teapot1.png" alt="teapot">
</div>

<div id="wrapper">

    <nav> <!-- navigation for the index site -->

        <a class="navspacing1" href="index.html"><strong>Home</strong></a>
        <!-- takes you to the homepage-->

        <a class="navspacing2" href="adminForm.php"><strong>Admin</strong></a>
        <!-- takes you to the "admin" page -->

        <a class="navspacing3" href="findoutmore.html"><strong>Find Out More</strong></a>
        <!-- takes you to the "find out more" page -->

        <a class="navspacing4" href="credits.html"><strong>Credits</strong></a>
        <!-- takes you to the "credits" page -->

        <a class="wireframe" href="../docs/wireframe.pdf">Wireframe</a>
        <!-- links to the pdf for the wireframe -->

    </nav>
</div>
<main>
<?php
include 'database_conn.php';	  // make db connection

$forename = isset ($_REQUEST['forename']) ? $_REQUEST['forename'] : null;
$surname = isset ($_REQUEST['surname']) ? $_REQUEST['surname'] : null;
$postalAddress = isset ($_REQUEST['postalAddress']) ? $_REQUEST['postalAddress'] : null;
$landLineTelNo = isset ($_REQUEST['landLineTelNo']) ? $_REQUEST['landLineTelNo'] : null;
$mobileTelNo = isset ($_REQUEST['mobileTelNo']) ? $_REQUEST['mobileTelNo'] : null;
$email = isset ($_REQUEST['email']) ? $_REQUEST['email'] : null;
$sendMethod = isset ($_REQUEST['sendMethod']) ? $_REQUEST['sendMethod'] : null;
$catID  = isset ($_REQUEST['catID']) ? $_REQUEST['catID'] : null;
$error = false;
$formSuccess = false;

if (empty($forename) || empty($surname) || empty($sendMethod)){
    $error = 'true';
}

if ($error == true) {
    echo "<p>Required details not inputted, please re-enter details</p>";
}

if ($error == false){
    $forename = $dbConn->real_escape_string($forename);
    $surname = $dbConn->real_escape_string($surname);
    $postalAddress = $dbConn->real_escape_string($postalAddress);
    $landLineTelNo = $dbConn->real_escape_string($landLineTelNo);
    $mobileTelNo = $dbConn->real_escape_string($mobileTelNo);
    $email = $dbConn->real_escape_string($email);

    $insertSQL = "INSERT INTO CT_expressedInterest (forename, surname, postalAddress, landLineTelNo,
                              mobileTelNo, email, sendMethod, catID)
    VALUES ('$forename','$surname','$postalAddress','$landLineTelNo','$mobileTelNo','$email','$sendMethod','$catID')";

    $success = $dbConn->query($insertSQL);
    mysqli_close($dbConn);

    $formSuccess = true;
}

if ($formSuccess == true) {
    preg_replace('/(\r\n|\r|\n)+/', '<p> </p>', $postalAddress);
    echo "<p>Details have successfully been added to our database.</p>";
    echo "<p>The details you have supplied are as follows:</p>";
    echo "<p>Forename: $forename</p>";
    echo "<p>Surname: $surname</p>";
    echo "<p>Postal Address: $postalAddress</p>";
    echo "<p>Landline Telephone No: $landLineTelNo</p>";
    echo "<p>Mobile Telephone No: $mobileTelNo</p>";
    echo "<p>E-Mail: $email</p>";
    echo "<p>Please click <a href='index.html'<strong>HERE</strong></a>
             to be redirected to the homepage.</p>";
}
?>
</main>
<footer>

    <p>Page and it's content are of free non-commercial use images and content only, unless stated.</p>

    <a id="index" href="../pages/index.html">Site Index</a>

    <p id="sitecreator">Site created by Grant Allenby</p>

</footer>
</body>
</html>
