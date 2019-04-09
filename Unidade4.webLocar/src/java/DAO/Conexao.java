
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * classe conexão jdbc com mysql
 * @author Senac
 */
public class Conexao {

    // atributos para conexão jdbc
    private Statement stmt;
    private ResultSet rs;
    private Connection conn;
    
    // construtor da classe livros
    public Conexao() {
        String url = "jdbc:mysql://localhost/weblocar?autoReconnect=true&useSSL=false";
        String usuario = "root";
        String senha = "root";
        
        // instância de conexão
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(url, usuario, senha);
                stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_READ_ONLY);
         } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Erro");
        } 
    }
      // fim do construtor  
    
    // método para pesquisar livros no banco de dados
    public ResultSet veiculosListar(String categoria, String fabricante) throws SQLException {
        String sql = "select * from veiculosdb where categoria='"+ categoria +"' and fabricante='"+ fabricante +"'";
        rs = stmt.executeQuery(sql);
        return rs;
    }
    
}

