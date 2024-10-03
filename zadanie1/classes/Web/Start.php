<?php

namespace Web;

class Start extends \Application\Main {
  
  public function __construct($cmd, $config) {
    parent::__construct($cmd, $config);
  }

  public function Show() {
    $this -> AddCss("start.css");
    $message = "Witaj na stronie startowej!";

    if ($this -> isTemplateExists("header.php")) {
      include_once($this -> IncludePath("header.php"));
    }

    if ($this -> isTemplateExists("start.php")) {
      include_once($this -> IncludePath("start.php"));
    }

    if ($this -> isTemplateExists("footer.php")) {
      include_once($this -> IncludePath("footer.php"));
    }
  }
}
