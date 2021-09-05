package br.senai.sc.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UsuarioTest {

    private Usuario usuario;

    public UsuarioTest(){
        usuario = new Usuario();
    }

    @Test
    void getNome() {
        usuario.setNome("Santiago");
        assertEquals("Santiago", usuario.getNome());
    }

    @Test
    void setNome() {
        usuario.setNome("Jubileu");
        assertEquals("Jubileu", usuario.getNome());
    }
}