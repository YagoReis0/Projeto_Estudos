/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.model;

import java.io.Serializable;

/**
 *
 * @author Senac
 */
public class UsuarioBeans implements Serializable{
    
    private int id;
    private String nome;
    private String login;
    private String senha;
    
//---- Construtor --------------------------------------------------------------
    public UsuarioBeans() {
    }
//---- Getter's & Setter's -----------------------------------------------------
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
//---------------------------------------
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
//---------------------------------------
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
//---------------------------------------
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }
//------------------------------------------------------------------------------    
    
    
}
