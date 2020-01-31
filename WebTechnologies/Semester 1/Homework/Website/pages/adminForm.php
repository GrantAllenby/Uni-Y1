<!DOCTYPE html>

<html lang="en">

<head>

    <meta name="viewport" content="width=device-width, initial-scale=1">

    <meta charset="UTF-8">
    <link href="index.css" rel="stylesheet" type="text/css">

    <title>Admin</title>

    <div id="banner">

        <h1>Chollerton Tearooms</h1> <!-- Advertises the name of the page. -->
        <img class="teapot" src="../images/teapot1.png" alt="teapot">

    </div>
<body>
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
    <h2>Admin</h2>
    <div id="adminform">
    <?php
    include 'database_conn.php';      // make db connection

    $sql = "SELECT expressInterestID, forename, surname, postalAddress, landLineTelNo, mobileTelNo, email, sendMethod, CT_expressedInterest.catID, catDesc
        FROM CT_expressedInterest
        INNER JOIN CT_category
        ON CT_category.catID = CT_expressedInterest.catID
        ORDER BY surname";

    $queryResult = $dbConn->query($sql);
    // Check for and handle query failure
        if ($queryResult === false) {
            echo "<p>Query failed: " . $dbConn->error . "</p>\n</body>\n</html>";
            exit;
        } // Otherwise fetch all the rows returned by the query one by one

        else {
            while ($rowObj = $queryResult->fetch_object()) {
                echo "<div class='Expressed Interest'>
                <span class='forename'>{$rowObj->forename}</span>
                <span class='surname'>{$rowObj->surname}</span>
                <span class='postalAddress'>{$rowObj->postalAddress}</span>
                <span class='landLineTelNo'>{$rowObj->landLineTelNo}</span>
                <span class='mobileTelNo'>{$rowObj->mobileTelNo}</span>  
                <span class='email'>{$rowObj->email}</span>
                <span class='sendMethod'>{$rowObj->sendMethod}</span>
                <span class='catDesc'>{$rowObj->catDesc}</span>
              </div>\n";
            }
        }
    $queryResult->close();
    $dbConn->close();
    ?>
    </div>
</main>
<footer>

    <p>Page and it's content are of free non-commercial use images and content only, unless stated.</p>

    <a id="index" href="../pages/index.html">Site Index</a>

    <p id="sitecreator">Site created by Grant Allenby</p>

</footer>
</body>
</html>
