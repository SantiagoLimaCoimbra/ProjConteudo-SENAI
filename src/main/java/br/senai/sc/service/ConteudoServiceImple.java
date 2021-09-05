package br.senai.sc.service;

import br.senai.sc.model.Conteudo;
import br.senai.sc.repository.ConteudoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConteudoServiceImple implements ConteudoService{

    @Autowired
    ConteudoRepository conteudoRepository;

    @Override
    public Conteudo findById(Long id) {
        return conteudoRepository.findById(id).get();
    }

    @Override
    public Conteudo findByNome(String nome) {
        return conteudoRepository.findByNome(nome);
    }

    @Override
    public List<Conteudo> findAll() {
        return conteudoRepository.findAll(Sort.by("nome"));
    }

    @Override
    public String validarConteudo(Conteudo cargo) {
        String error = null;
        Conteudo c;
        if (conteudo.getId() == null) {//Novo
            c = conteudoRepository.findByNome(cargo.getNome());
            if ( c != null){
                error = "Cargo já existe.";
            }
        } else {//Conteudo Existente
            c = conteudoRepository.findByIdNotAndNome(cargo.getId(), cargo.getNome());
            if ( c != null){
                error = " Já existe um cargo com esse nome.";
            }
        }
        return error;
    }

    @Override
    public List<Conteudo> findByNomeNot(String nome) {
        return ConteudoRepository.findByNomeNot(nome);
    }

    @Override
    public boolean save(Conteudo conteudo) {
        try{
            if (conteudo != null){
                conteudoRepository.save(conteudo);
                return true;
            } else {
                return false;
            }
        } catch (Exception e){
            System.out.println("Erro ao salvar o cargo: " + e.getMessage());
            return false;
        }
    }

    @Override
    public boolean deleteById(Long id) {
        try{
            if (id != null || id > 0){
                conteudoRepository.deleteById(id);
                return true;
            } else {
                return false;
            }
        } catch (Exception e){
            System.out.println("Erro ao deletar o cargo. " + e.getMessage());
            return false;
        }

    }
}
