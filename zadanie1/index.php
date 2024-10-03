<?php

include_once("autoloader.php");
include_once("config.php");

if (isset($_GET['cmd'])) {
    $cmd = $_GET['cmd'];
} else {
    $cmd = "";
}

$Controller = new \Application\Controller($cmd, $config);
$ClassName = $Controller -> GetObjectName();

if (class_exists($ClassName)) {
    $Page = new $ClassName($cmd, $config);
    $Page -> Show();
} else {
    $Controller -> RedirectPage("/Web/Start", 1);
}