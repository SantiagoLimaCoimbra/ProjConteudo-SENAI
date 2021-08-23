package br.senai.sc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConteudoController {

    @GetMapping("/conteudo/conteudoList")
    public String conteu(){
        return "conteudoList";
    }



    /*@GetMapping("/conteudo/conteudoList")
    public String list(Model model){
        model.addAttribute("conteudo", conte...)
    }*/

}
