/*
 * Esta classe será responsável por abrir e fechar a conexão com banco de dados.
 * 
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Senac
 */
public class ConexaoDAO {
    
    // variavel para informar o status da conexão.
    public String status = "Sem conexão com banco de dados";
    // variavel de conexão.
    public Connection conn = null;
    // definição de url de conexão ao banco de dados.
    public String url = "jdbc:mysql://localhost/weblocar?autoReconnect=true&useSSL=false&useTimezone=true&serverTimezone=UTC";
    // user do banco de dados.
    public String user = "root";
    // senha do user do banco de dados.
    public String password = "root";
    
//---- Método para estabelecer conexão -----------------------------------------
    public Connection conectar(){
        
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            conn = (Connection) DriverManager.getConnection(url, user, password);
            
            status = "Conexão realizada com sucesso!";
        } catch (SQLException ex) {
            status = "Erro na Conexão - Não foi possível conectar ao banco de dados";
            return null;
        } catch (ClassNotFoundException ex) {
            status = "O Driver especifico não foi encontrado...";
        }
        
        return conn;
    }
//---- Método para finalizar a conexão -----------------------------------------
    public boolean desconectar(){
        
        try{
            
            conn.close();
            status = "Conexão finalizada";
            return true;
        } catch (SQLException ex) {
            return false;
        }
    }
//---- Método que retorna o status da sua conexão ------------------------------
    public String statusConexao(){
        return status;
    } 
    
}
