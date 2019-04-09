/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

/**
 *
 * @author Senac
 */
public class testaConexão {
    
    public static void main(String[] args) {
        
        ConexaoDAO conex = new ConexaoDAO();
        
        conex.conectar();
        
        System.out.println(conex.statusConexao());
        
        conex.desconectar();
        
        System.out.println(conex.statusConexao());
    }
    
}
