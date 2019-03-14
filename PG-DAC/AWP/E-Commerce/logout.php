<?php
    session_destroy();
    unset($_SESSION['user']);
    header('Location: index.php');
?>