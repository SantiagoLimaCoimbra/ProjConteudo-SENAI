package br.senai.sc.controller;

import br.senai.sc.service.ConteudoServiceImple;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConteudoController {

    @Autowired
    ConteudoServiceImple conteudoServiceImple;

    @GetMapping("/conteudo/conteudoList")
    public String conteu(){
        return "conteudo/conteudoList";
    }

    /*@GetMapping("/conteudo/conteudoList")
    public String list(Model model){
        model.addAttribute("conteudos", conteudoService.findAll());
        return "conteudo/conteudoList";
    }*/

}
