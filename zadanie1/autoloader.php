<?php

spl_autoload_register(function ($class) {
    $class = str_replace('\\', DIRECTORY_SEPARATOR, $class);
    $path = __DIR__ . "/classes/" . $class . ".php";

    if (file_exists($path)) {
        include_once($path);
    }
});
