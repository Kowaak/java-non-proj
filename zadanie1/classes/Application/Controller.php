<?php

namespace Application;

class Controller {
  private $cmd;
  private $config;

  public function __construct($cmd, $config) {
    $this->cmd = explode('/', $cmd);
    $this->config = $config;
  }

  public function GetObjectName() {
    if (isset($this->cmd[0]) && isset($this->cmd[1])) {
      $ObjectName = "\\" . $this->cmd[0] . "\\" . $this->cmd[1];

      if (class_exists($ObjectName)) {
        return $ObjectName;
      }
    }
    return false;
  }

  public function RedirectPage($site, $end=0) {
    $url = $this -> config['proto'] . '://' . $this -> config['url'] . $site . ".html";
      

    if ($end == 1) {
      die();
    }
  }
}