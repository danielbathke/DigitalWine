/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.digitalwine.model;

/**
 *
 * @author 115231
 */
public class Vinicola {
    
    private String nome;
    private Pais pais;

    public Vinicola(String nome, Pais pais) {
        this.nome = nome;
        this.pais = pais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }
    
}
