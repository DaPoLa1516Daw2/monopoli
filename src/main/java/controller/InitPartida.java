/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import monopoli.Jugador;
import monopoli.Partida;

/**
 *
 * @author oscar
 */
public class InitPartida extends HttpServlet {
    private Partida pMono = new Partida();

    protected void NewJugador(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        pMono.setJugador(new Jugador(request.getParameter("Nombre"), request.getParameter("UserIcon")));
        RequestDispatcher rd = request.getRequestDispatcher("/tablero.jsp");
        rd.forward(request, response);
    }
    
    protected void route(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if("/monopoli/Juego/Entrar".equals(request.getRequestURI())){
            NewJugador(request, response);
        }
            
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        route(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        route(request, response);
    }
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
