/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import mvc.DAO.ConexaoDAO;
import mvc.DAO.UsuarioDAO;
import mvc.model.UsuarioBeans;

/**
 *
 * @author Senac
 */
//@WebServlet(name = "ServletLOGIN", urlPatterns = {"/ServletLOGIN"})
public class ServletLOGIN extends HttpServlet {
  

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        
        String redir = "";
        String msg="";
        
        
            String users = req.getParameter("login");
            String passwords = req.getParameter("senha");
            
            UsuarioBeans usuario = new UsuarioBeans();
            usuario.setLogin(users);
            usuario.setSenha(passwords);
            
            UsuarioDAO dao = new UsuarioDAO();
            UsuarioBeans logado = dao.AutenticaUser(usuario);
            
            if((logado.getLogin().equals(users.trim())) && (logado.getSenha().equals(passwords.trim()))){
                //req.getSession().setAttribute("usuarioLogado", logado);
                msg = users;
                redir = "mvc.view/check.jsp";
            } else {
                msg = "Usuário ou Senha Inválido!";
                redir = "mvc.view/login.jsp";
            }
            
        
        req.setAttribute("msg", msg);
        RequestDispatcher rd = req.getRequestDispatcher(redir);
        rd.forward(req, resp);
        
    }

}
