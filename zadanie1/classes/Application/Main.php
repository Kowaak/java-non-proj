<?php

namespace Application;

class Main {
    public $cmd;
    public $config;

    public function __construct($cmd, $config) {
        $this->cmd = explode('/', $cmd);
        $this->config = $config;
    }

    public function isTemplateExists($file) {
        $path = "templates/" . $this -> config['template'] . "/" . $file;

        if (file_exists($path)) return true;
        return false;
    }

    public function IncludePath($file) {
        return "templates/" . $this -> config['template'] . "/" . $file;
    }

    public function AddCss($file) {
        $this -> config['css'][] = $file;
    }

    public function AddJava($file) {
        $this -> config['js'][] = $file;
    }

    public function LoadCss() {
        $url = $this -> config['proto'] . "://" . $this -> config['url'] . "/templates/" . $this -> config['template'] . "/css/";

        if (count($this -> config['css']) > 0) {
            $html = '';
            foreach ($this -> config['css'] as $w) {
                $html .= '<link rel="stylesheet" href="' . $url . $w . '">';
            }
            return $html;
        }
    }
}
