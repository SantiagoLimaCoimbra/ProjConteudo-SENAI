package br.senai.sc.service;

import br.senai.sc.model.Conteudo;
import br.senai.sc.model.Usuario;
import br.senai.sc.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImple implements UsuarioService{

    @Autowired
    UsuarioRepository usuarioRepository;

    @Override
    public List<Usuario> findAll(){
        return usuarioRepository.findAll(Sort.by("nome")); //mudar para data de postagem?
    }

    @Override
    public Usuario findById(Long id){
        return usuarioRepository.findById(id).get();
    }

    @Override
    public boolean save(Usuario usuario){

        try {
            if (usuario != null){
                usuarioRepository.save(usuario);
                return true;
            } else {
                return false;
            }
        } catch (Exception e){
            System.out.println(e.getMessage());
            return false;
        }

    }

    @Override
    public String validarUsuario(Usuario usuario){
        String error = null;
        Usuario u;

        if (usuario.getId() == null) { //novo usuario
            u = usuarioRepository.findByNome(usuario.getNome());
            if (u != null){
                error = "Este nome já existe.";
            }
        } else { //usuario existente
            u = usuarioRepository.findByIdNotAndNome(usuario.getId(), usuario.getNome());
            if (u != null){
                error = "Este nome já existe.";
            }
        }
        return error;
    }

    /*@Override
    public List<Usuario> findByConteudo(Conteudo conteudo) {
        return usuarioRepository.findByConteudo(conteudo);
    }

    @Override
    public List<Usuario> findByCargoIn(List<Conteudo> conteudos) {

        return usuarioRepository.findByConteudoIn(conteudos);
    }*/

    public boolean deleteById(Long id){
        try {
            usuarioRepository.deleteById(id);
            return true;
        } catch (Exception e){
            return false;
        }
    }

}
