package br.senai.sc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.sql.Date;

@Entity(name="conteudo")
public class Conteudo {

    //ATRIBUTOS
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Size(max=50)
    @NotNull
    private String nome;

    @Size(max=250)
    @NotNull
    private String descricao;

    @NotNull
    private Date dataConteudo;

    //private usuario usuario;


    //GET E SET

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataConteudo() {
        return dataConteudo;
    }

    public void setDataConteudo(Date dataConteudo) {
        this.dataConteudo = dataConteudo;
    }


    //To String

    @Override
    public String toString() {
        return "Conteudo{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                ", dataConteudo=" + dataConteudo +
                '}';
    }
}
