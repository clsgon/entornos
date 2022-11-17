<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Formulario</title>
</head>
<body>
    <form action="muestraDatos.php" method="POST">
        <label for="name">Nombre: </label>
        <input type="text" name="name" required><br><br>
        <label for="surname">Apellido: </label>
        <input type="text" name="surname" required><br><br>
        <input type="submit"  name="send">
    </form>
</body>
</html>