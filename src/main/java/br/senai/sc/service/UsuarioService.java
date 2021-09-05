package br.senai.sc.service;

import br.senai.sc.model.Conteudo;
import br.senai.sc.model.Usuario;

import java.util.List;

public interface UsuarioService {

    public List<Usuario> findAll();
    public Usuario findById(Long id);
    public String validarUsuario(Usuario usuario);

    /*public List<Usuario> findByConteudo(Conteudo conteudo);
    public List<Usuario> findByConteudoIn(List<Conteudo> conteudos); //acho que esse aqui ta errado*/

    public boolean save(Usuario usuario);
    public boolean deleteById(Long id); //Esse também vai precisar?
}
