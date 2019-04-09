/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import DAO.ConexaoDAO;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Carros;
import model.CarrosBEANS;

/**
 *
 * @author Senac
 */
public class ServletCarros extends HttpServlet {

    public ServletCarros() {
        super();
    }
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String sCategoria = request.getParameter("categoria");
        String sFabricante = request.getParameter("fabricante");
        HttpSession sessao = request.getSession();
        sessao.setMaxInactiveInterval(60);
        sessao.invalidate();
        
        /**CarrosBEANS dados = new CarrosBEANS();
        List<CarrosBEANS> lista = new ArrayList<>();
        
        Connection conn;
        ConexaoDAO conex = new ConexaoDAO();
        
        try{
            conn = conex.conectar();
            
            String sql = "select * from veiculosdb where categoria='?' and fabricante='?'";
            
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, sCategoria);
            stmt.setString(1, sFabricante);
            
            ResultSet rs = stmt.executeQuery();
            
            while(rs.next()){
                dados.setVeiculo(rs.getString("Veiculo"));
                dados.setMotor(rs.getString("Motor"));
                dados.setArCond(rs.getString("ArCond"));
                dados.setCambio(rs.getString("Cambio"));
                dados.setGps(rs.getString("GPS"));
                dados.setCombustivel(rs.getString("Combustivel"));
                dados.setBancos(rs.getString("Bancos"));
                dados.setOpcionais1(rs.getString("Opcionais1"));
                dados.setOpcionais2(rs.getString("Opcionais2"));
                dados.setOpcionais3(rs.getString("Opcionais3"));
                
                lista.add(dados);
            }
            
            
        } catch (SQLException ex) {
            request.getRequestDispatcher("error.jsp");
        } finally {
            conex.desconectar();*/
            request.setAttribute("categoria", sCategoria);
            request.setAttribute("fabricante", sFabricante);
            request.getRequestDispatcher("resultado.jsp").forward(request, response);
        //}
        
    }

}
