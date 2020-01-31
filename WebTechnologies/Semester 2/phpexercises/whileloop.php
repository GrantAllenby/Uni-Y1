<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Variables</title>
</head>
<body>
<p>

<?php
$number = 1;
$limit = 13;

while ($number !=$limit) {
    echo "12 times $number = ";
    echo ($number*12)."<br>";
    $number++;
}
echo "<p><b>12 times 12 = 144</b></p>";
echo "Table finished";
?>

</p>
</body>
</html>
