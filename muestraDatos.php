<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Mostramos los datos</title>
</head>
<body>
    <?php
        if(isset($_POST["name"])){
            $name = $_POST["name"];
            $surname = $_POST["surname"];

            echo "Hola $name $surname";
        }

    ?>
</body>
</html>