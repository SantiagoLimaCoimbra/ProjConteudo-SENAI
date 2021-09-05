package br.senai.sc.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConteudoTest {

    private Conteudo conteudo;

    public ConteudoTest(){
        conteudo = new Conteudo();
    }

    @Test
    void getNome() {
        conteudo.setNome("História");
        assertEquals("História", conteudo.getNome());
    }

    @Test
    void setNome() {
        conteudo.setNome("Geografia");
        assertEquals("Geografia", conteudo.getNome());
    }

    @Test
    void getDescricao() {
        conteudo.setDescricao("Hoje iremos estudar o Brasil Colonial.");
        assertEquals("Hoje iremos estudar o Brasil Colonial.", conteudo.getDescricao());
    }

    @Test
    void setDescricao() {
        conteudo.setDescricao("Esta aula será sobre Globalização.");
        assertEquals("Esta aula será sobre Globalização.", conteudo.getDescricao());
    }
}