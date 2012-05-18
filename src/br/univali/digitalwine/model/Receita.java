/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.digitalwine.model;

import java.util.ArrayList;

/**
 *
 * @author 115231
 */
public class Receita {
    
    private String nome;
    private byte[] imagem;
    private String ingredientes;
    private String preparo;
    private ArrayList<VinhoTipo> vinhoTipos;

    public Receita(String nome, byte[] imagem, String ingredientes, String preparo, ArrayList<VinhoTipo> vinhoTipos) {
        this.nome = nome;
        this.imagem = imagem;
        this.ingredientes = ingredientes;
        this.preparo = preparo;
        this.vinhoTipos = vinhoTipos;
    }

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPreparo() {
        return preparo;
    }

    public void setPreparo(String preparo) {
        this.preparo = preparo;
    }

    public ArrayList<VinhoTipo> getVinhoTipos() {
        return vinhoTipos;
    }

    public void setVinhoTipos(ArrayList<VinhoTipo> vinhoTipos) {
        this.vinhoTipos = vinhoTipos;
    }
}
