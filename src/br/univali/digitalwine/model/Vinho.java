/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.digitalwine.model;

/**
 *
 * @author 115231
 */
public class Vinho {
    
    private int acessos;
    private boolean emEstoque;
    private byte[] imagem;
    private String nome;
    private double preco;
    private VinhoTipo vinhoTipo;
    private Vinicola vinicola;

    public Vinho(byte[] imagem, String nome, double preco, VinhoTipo vinhoTipo, Vinicola vinicola) {
        this.imagem = imagem;
        this.nome = nome;
        this.preco = preco;
        this.vinhoTipo = vinhoTipo;
        this.vinicola = vinicola;
    }

    public int getAcessos() {
        return acessos;
    }

    public void setAcessos(int acessos) {
        this.acessos = acessos;
    }

    public boolean isEmEstoque() {
        return emEstoque;
    }

    public void setEmEstoque(boolean emEstoque) {
        this.emEstoque = emEstoque;
    }

    public byte[] getImagem() {
        return imagem;
    }

    public void setImagem(byte[] imagem) {
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public VinhoTipo getVinhoTipo() {
        return vinhoTipo;
    }

    public void setVinhoTipo(VinhoTipo vinhoTipo) {
        this.vinhoTipo = vinhoTipo;
    }

    public Vinicola getVinicola() {
        return vinicola;
    }

    public void setVinicola(Vinicola vinicola) {
        this.vinicola = vinicola;
    }
    
}
