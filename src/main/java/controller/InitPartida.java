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
        pMono.deleteJugadores();
        int n = Integer.parseInt(request.getParameter("nJugadores"));
        for(int i = 0; i < n; i++)
            pMono.setJugador(new Jugador(request.getParameter("Nombre"+i), request.getParameter("UserIcon"+i)));       
    }
    
    protected void route(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        if("/monopoli/Juego/Entrar".equals(request.getRequestURI())){
            NewJugador(request, response);
        }
        
        if("/monopoli/Juego/Dado".equals(request.getRequestURI())){
            int tirada = pMono.tiraDado();
            request.setAttribute("tirada", tirada);
            request.setAttribute("d12", tirada);
        } else {
            request.setAttribute("d12", 12);
        }
        
        if("/monopoli/Juego/avanzaTurno".equals(request.getRequestURI())) {
            int turno = pMono.avanzaTurno();
            request.setAttribute("turno", turno);
        }
        
        request.setAttribute("Jugadores", pMono.getJugadores());
        
        RequestDispatcher rd = request.getRequestDispatcher("/tablero.jsp");
        rd.forward(request, response);
    }
    
    private void test(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet test</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
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
