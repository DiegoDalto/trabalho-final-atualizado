package com.example.diego.trabalhoandroidagenda;

import java.io.Serializable;

/**
 * Created by Diego on 21/04/2016.
 */

public class Contato implements Serializable {


    private String id;

    private String nome;

    private String telefone;

    private String imagem;

    public Contato() {
    }

    public Contato(String nome, String telefone, String imagem) {
        this.nome = nome;
        this.telefone = telefone;
        this.imagem = imagem;
    }

    public Contato(String id, String nome, String telefone, String imagem) {
        this.nome = nome;
        this.telefone = telefone;
        this.imagem = imagem;
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getImagem() {
        return imagem;
    }

    public void setImagem(String imagem) {
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}

