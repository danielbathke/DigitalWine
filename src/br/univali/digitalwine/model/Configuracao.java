/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.digitalwine.model;

/**
 *
 * @author 115231
 */
public class Configuracao {
    
    private String login;
    private String senha;

    public Configuracao(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
