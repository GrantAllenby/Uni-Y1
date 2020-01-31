<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Order confirmed</title>
</head>
<body>
<h1>You ordered</h1>
<?php
$planetype = $_GET['planetype'];
$quantity = $_GET['quantity'];
$name = $_GET['name'];
$address = $_GET['address'];
echo "<p>Name of customer: $name</p>";
echo "<p>Address: $address</p>";
echo "<p>Your choice of fish was $fish</p>";
echo "<p>You ordered $quantity</p>";
?>
</body>
</html>