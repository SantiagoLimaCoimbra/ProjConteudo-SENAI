package br.senai.sc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UsuarioController {

    @GetMapping("/usuario/usuarioList")
    public String usuari(){
        return "usuario/usuarioList";
    }

}
