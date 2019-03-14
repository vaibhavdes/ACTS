<?php
unset ($_SESSION["login_status"]);
unset ($_SESSION["name"]);
unset ($_SESSION["email"]);

header('Location: index.php');
?>