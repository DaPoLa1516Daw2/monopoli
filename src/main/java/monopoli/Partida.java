/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoli;

import java.io.Serializable;

/**
 *
 * @author .David
 */
public class Partida implements Serializable {
    
    private int bote;
    private int turno;
    private Jugador jugadores[] = new Jugador[8];
    private final Casilla casillas[] = new Casilla[40];
    public Partida() {
        genTablero();
    }

    public int getBote() {
        return bote;
    }

    public int getTurno() {
        return turno;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public Casilla[] getCasillas() {
        return casillas;
    }

    public void setBote(int bote) {
        this.bote = bote;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public void setJugadores(Jugador[] jugadores) {
        this.jugadores = jugadores;
    }
    
    public void genTablero(){
        
        casillas[0] = new Casilla(0,500, TipoCasilla.valueOf("Salida"));
        casillas[1] = new Casilla(60,6, TipoCasilla.valueOf("Calle"));
        casillas[2] = new Casilla(0,0, TipoCasilla.valueOf("Suerte"));
        casillas[3] = new Casilla(60,6, TipoCasilla.valueOf("Calle"));
        casillas[4] = new Casilla(0,-200, TipoCasilla.valueOf("Trampa"));
        casillas[5] = new Casilla(200,20, TipoCasilla.valueOf("Calle"));
        casillas[6] = new Casilla(100,10, TipoCasilla.valueOf("Calle"));
        casillas[7] = new Casilla(0,0, TipoCasilla.valueOf("Suerte"));
        casillas[8] = new Casilla(100,10, TipoCasilla.valueOf("Calle"));
        casillas[9] = new Casilla(120,12, TipoCasilla.valueOf("Calle"));
        casillas[10] = new Casilla(0,2000, TipoCasilla.valueOf("Carcel"));
        casillas[11] = new Casilla(140,14, TipoCasilla.valueOf("Calle"));
        casillas[12] = new Casilla(150,15, TipoCasilla.valueOf("Calle"));
        casillas[13] = new Casilla(140,14, TipoCasilla.valueOf("Calle"));
        casillas[14] = new Casilla(160,16, TipoCasilla.valueOf("Calle"));
        casillas[15] = new Casilla(200,20, TipoCasilla.valueOf("Calle"));
        casillas[16] = new Casilla(180,18, TipoCasilla.valueOf("Calle"));
        casillas[17] = new Casilla(0,2000, TipoCasilla.valueOf("Suerte"));
        casillas[18] = new Casilla(180,18, TipoCasilla.valueOf("Calle"));
        casillas[19] = new Casilla(20,2, TipoCasilla.valueOf("Calle"));
        casillas[20] = new Casilla(0,0, TipoCasilla.valueOf("Bote"));
        casillas[21] = new Casilla(220,22, TipoCasilla.valueOf("Calle"));
        casillas[22] = new Casilla(0,0, TipoCasilla.valueOf("Suerte"));
        casillas[23] = new Casilla(220,22, TipoCasilla.valueOf("Calle"));
        casillas[24] = new Casilla(240,24, TipoCasilla.valueOf("Calle"));
        casillas[25] = new Casilla(200,20, TipoCasilla.valueOf("Calle"));
        casillas[26] = new Casilla(260,26, TipoCasilla.valueOf("Calle"));
        casillas[27] = new Casilla(260,26, TipoCasilla.valueOf("Calle"));
        casillas[28] = new Casilla(150,15, TipoCasilla.valueOf("Calle"));
        casillas[29] = new Casilla(280,28, TipoCasilla.valueOf("Calle"));
        casillas[30] = new Casilla(0,0, TipoCasilla.valueOf("Carcel"));
        casillas[31] = new Casilla(300,30, TipoCasilla.valueOf("Calle"));
        casillas[32] = new Casilla(300,30, TipoCasilla.valueOf("Calle"));
        casillas[33] = new Casilla(0,0, TipoCasilla.valueOf("Suerte"));
        casillas[34] = new Casilla(320,32, TipoCasilla.valueOf("Calle"));
        casillas[35] = new Casilla(200,20, TipoCasilla.valueOf("Calle"));
        casillas[36] = new Casilla(0,0, TipoCasilla.valueOf("Suerte"));
        casillas[37] = new Casilla(350,35, TipoCasilla.valueOf("Calle"));
        casillas[38] = new Casilla(0,-100, TipoCasilla.valueOf("Trampa"));
        casillas[39] = new Casilla(400,40, TipoCasilla.valueOf("Calle"));
    }

    
    
}
