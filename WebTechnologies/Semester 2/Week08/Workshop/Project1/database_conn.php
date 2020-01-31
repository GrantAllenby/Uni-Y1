<?php
$dbConn = new mysqli('localhost', 'unn_w18013678', 'DevinTownsend1994!', 'unn_w18013678');

if ($dbConn->connect_error) {
    echo "<p>Connection failed: ".$dbConn->connect_error."</p>\n";
    exit;
}
?>
