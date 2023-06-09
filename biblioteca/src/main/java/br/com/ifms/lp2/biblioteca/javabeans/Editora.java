package br.com.ifms.lp2.biblioteca.javabeans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Editora {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEditora;

    private String nome;

    private String endereco;


    public Editora() {}

    public Editora(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }

    // getters e setters


    public Long getIdEditora() {
        return this.idEditora;
    }

    public void setIdEditora(Long idEditora) {
        this.idEditora = idEditora;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


}