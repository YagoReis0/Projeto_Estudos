/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import mvc.controller.ServletLOGIN;
import mvc.model.UsuarioBeans;

/**
 *
 * @author Senac
 */
public class UsuarioDAO {
    
    public UsuarioBeans AutenticaUser(UsuarioBeans usuario) {
     
        String sql = "select * from usuarios where login = '?' and senha = '?'";
        
        Connection conex = null;
        ConexaoDAO dao = new ConexaoDAO();
        UsuarioBeans user = new UsuarioBeans();
        PreparedStatement psm = null;
        ResultSet rs = null;       
        
        try {
            conex = dao.conectar();
            psm = conex.prepareStatement(sql);
            psm.setString(1, usuario.getLogin());
            psm.setString(2, usuario.getSenha());
            
            rs = psm.executeQuery();
            
            while (rs.first()){
                String login = rs.getString("login");
                String senha = rs.getString("senha");
                
                user.setLogin(login);
                user.setSenha(senha);
            }
            
            
            psm.close();
            conex.close();
     
            
        } catch (SQLException ex) {
            Logger.getLogger(ServletLOGIN.class.getName()).log(Level.SEVERE, null, ex);
        }
        return user;
    }
    
}
