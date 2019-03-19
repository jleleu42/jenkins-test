<?php

    echo "hello there<br><br>";

    echo "======== DATABASES ========<br><ul>";

    $pdo = new PDO("mysql:host=bdd;dbname=virtu;charset=utf8;","root","root");
    $result = $pdo->query("SHOW DATABASES");
    while ($row = $result->fetch(PDO::FETCH_NUM)) {
        print_r("<li>" . $row[0] . "</li><br>");
    }
    echo "</ul>";



    echo "======== COMPTEUR ========<br><ul>";


    $sql = "UPDATE cpt SET cpt=cpt+1";
    $stmt= $pdo->prepare($sql);
    $stmt->execute();


    $result = $pdo->query("SELECT cpt from cpt");
    while ($row = $result->fetch(PDO::FETCH_NUM)) {
        print_r("<li>" . $row[0] . "</li><br>");
    }
    echo "</ul><br>";
    
    phpinfo();

?>
