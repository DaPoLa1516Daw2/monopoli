/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoli;

import monopoli.Casillas.*;
import java.io.Serializable;
import java.util.ArrayList;


public class Partida implements Serializable {
    
    private int bote;
    private int turno;
    private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
    private final Casilla casillas[] = new Casilla[40];
    
    public Partida() {
        this.genTablero();
        this.turno = 0;
    }

    public int getBote() {
        return bote;
    }

    public int getTurno() {
        return turno;
    }

    public ArrayList<Jugador> getJugadores() {
        System.out.println(jugadores);
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

    public boolean setJugador(Jugador jugador) {
        if(jugadores.size() == 8)
            return false;
        else
            this.jugadores.add(jugador);
            return true;
    }
    
    public void genTablero(){
        casillas[0] = Casilla.getCasillaSalida("", 1000);
        casillas[1] = Casilla.getCasillaCalle("", 60, 6);
        casillas[2] = Casilla.getCasillaSuerte("", 0);
        casillas[3] = Casilla.getCasillaCalle("", 60, 6);
        casillas[4] = Casilla.getCasillaTrampa("", 0);
        casillas[5] = Casilla.getCasillaCalle("", 200, 20);
        casillas[6] = Casilla.getCasillaCalle("", 100, 10);
        casillas[7] = Casilla.getCasillaSuerte("", 0);
        casillas[8] = Casilla.getCasillaCalle("", 100, 10);
        casillas[9] = Casilla.getCasillaCalle("", 120, 12);
        casillas[10] = Casilla.getCasillaCarcel("", 0);
        casillas[11] = Casilla.getCasillaCalle("", 140, 14);
        casillas[12] = Casilla.getCasillaCalle("", 150, 15);
        casillas[13] = Casilla.getCasillaCalle("", 140, 14);
        casillas[14] = Casilla.getCasillaCalle("", 160, 16);
        casillas[15] = Casilla.getCasillaCalle("", 200, 20);
        casillas[16] = Casilla.getCasillaCalle("", 180, 18);
        casillas[17] = Casilla.getCasillaSuerte("", 0);
        casillas[18] = Casilla.getCasillaCalle("", 180, 18);
        casillas[19] = Casilla.getCasillaCalle("", 200, 20);
        casillas[20] = Casilla.getCasillaBote("", 0);
        casillas[21] = Casilla.getCasillaCalle("", 220, 22);
        casillas[22] = Casilla.getCasillaSuerte("", 0);
        casillas[23] = Casilla.getCasillaCalle("", 220, 22);
        casillas[24] = Casilla.getCasillaCalle("", 240, 24);
        casillas[25] = Casilla.getCasillaCalle("", 200, 20);
        casillas[26] = Casilla.getCasillaCalle("", 260, 26);
        casillas[27] = Casilla.getCasillaCalle("", 260, 26);
        casillas[28] = Casilla.getCasillaCalle("", 150, 15);
        casillas[29] = Casilla.getCasillaCalle("", 280, 28);
        casillas[30] = Casilla.getCasillaCarcel("", 0);
        casillas[31] = Casilla.getCasillaCalle("", 300, 30);
        casillas[32] = Casilla.getCasillaCalle("", 300, 30);
        casillas[33] = Casilla.getCasillaSuerte("", 0);
        casillas[34] = Casilla.getCasillaCalle("", 320, 32);
        casillas[35] = Casilla.getCasillaCalle("", 200, 20);
        casillas[36] = Casilla.getCasillaSuerte("", 0);
        casillas[37] = Casilla.getCasillaCalle("", 350, 35);
        casillas[38] = Casilla.getCasillaTrampa("", 0);
        casillas[39] = Casilla.getCasillaCalle("", 400, 40);
    }
}
