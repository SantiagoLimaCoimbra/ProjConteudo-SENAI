package br.senai.sc.repository;

import br.senai.sc.model.Conteudo;
import br.senai.sc.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

    public Usuario findByNome(String nome);
    public Usuario findByIdNotAndNome(Long id, String nome);

    /*public List<Usuario> findByConteudo(Conteudo conteudo);
    public List<Usuario> findByConteudoIn(List<Usuario> usuarios);*/

}
