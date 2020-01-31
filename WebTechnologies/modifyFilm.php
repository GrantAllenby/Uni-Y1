<?php
include 'database_conn.php';

$filmID = isset ($_REQUEST['filmID']) ? $_REQUEST['filmID'] : null;
$title = isset ($_REQUEST['title']) ? $_REQUEST['title'] : null;
$categoryID = isset ($_REQUEST['categoryID']) ? $_REQUEST['categoryID'] : null;
$notes = isset ($_REQUEST['notes']) ? $_REQUEST['notes'] : null;
$error = false;

//Empty data section
if (empty($filmID)) {
    $error = true;
}

if (empty($title)) {
    $error = true;
}

if (empty($categoryID)) {
    $error = true;
}

if (empty($notes)) {
    $error = true;
}

if ($error == true) {
    echo "<p>Details not inputted, please try again.</p>\n";
}

//if data has been input without error.
if ($error == false) {
    $title = $dbConn->real_escape_string($filmID);
    $notes = $dbConn->real_escape_string($notes);

    $insertSQL = "INSERT INTO film (filmID, title, categoryID, notes)
    VALUES ('$filmID','$title','$categoryID','$notes')";

    $success = $dbConn->query($insertSQL);
    mysqli_close($dbConn);
}

//Lists details inputted into the database.
if ($error == false) {
    echo "<p>Details inputted into the database:</p>";

    if (!empty ($filmID)) {
        echo "<p>Film ID: $filmID</p>";
    }

    if (!empty ($title)) {
        echo "<p>Title: $title</p>";
    }

    if (!empty ($categoryID)) {
        echo "<p>Category ID: $categoryID</p>";
    }

    if (!empty ($notes)) {
        echo "<p>Notes: $notes</p>";
    }
}

