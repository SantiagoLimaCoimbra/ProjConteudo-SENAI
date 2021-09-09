package br.senai.sc.service;

import br.senai.sc.model.Conteudo;

import java.util.List;

public interface ConteudoService {

    public Conteudo findById(Long id);
    public Conteudo findByNome(String nome);
    public List<Conteudo> findAll();
    public String validarConteudo(Conteudo conteudo);
    //public List<Conteudo> findByNomeNot(String nome);

    public boolean save(Conteudo conteudo);
    public boolean deleteById(Long id);

}
