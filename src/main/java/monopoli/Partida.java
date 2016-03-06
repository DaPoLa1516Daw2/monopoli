/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoli;

import monopoli.Casillas.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;


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
        casillas[0] = Casilla.getCasillaSalida("C1", 1000);
        casillas[1] = Casilla.getCasillaCalle("C2", 60, 6);
        casillas[2] = Casilla.getCasillaSuerte("C3", 0);
        casillas[3] = Casilla.getCasillaCalle("C4", 60, 6);
        casillas[4] = Casilla.getCasillaTrampa("C5", 0);
        casillas[5] = Casilla.getCasillaCalle("C6", 200, 20);
        casillas[6] = Casilla.getCasillaCalle("C7", 100, 10);
        casillas[7] = Casilla.getCasillaSuerte("C8", 0);
        casillas[8] = Casilla.getCasillaCalle("C9", 100, 10);
        casillas[9] = Casilla.getCasillaCalle("C10", 120, 12);
        casillas[10] = Casilla.getCasillaCarcel("C11", 0);
        casillas[11] = Casilla.getCasillaCalle("C12", 140, 14);
        casillas[12] = Casilla.getCasillaTrampa("C13", 0);
        casillas[13] = Casilla.getCasillaCalle("C14", 140, 14);
        casillas[14] = Casilla.getCasillaCalle("C15", 160, 16);
        casillas[15] = Casilla.getCasillaCalle("C16", 200, 20);
        casillas[16] = Casilla.getCasillaCalle("C17", 180, 18);
        casillas[17] = Casilla.getCasillaSuerte("C18", 0);
        casillas[18] = Casilla.getCasillaCalle("C19", 180, 18);
        casillas[19] = Casilla.getCasillaCalle("C20", 200, 20);
        casillas[20] = Casilla.getCasillaBote("C21", 0);
        casillas[21] = Casilla.getCasillaCalle("C22", 220, 22);
        casillas[22] = Casilla.getCasillaSuerte("C23", 0);
        casillas[23] = Casilla.getCasillaCalle("C24", 220, 22);
        casillas[24] = Casilla.getCasillaCalle("C25", 240, 24);
        casillas[25] = Casilla.getCasillaCalle("C26", 200, 20);
        casillas[26] = Casilla.getCasillaCalle("C27", 260, 26);
        casillas[27] = Casilla.getCasillaCalle("C28", 260, 26);
        casillas[28] = Casilla.getCasillaTrampa("C29", 0);
        casillas[29] = Casilla.getCasillaCalle("30", 280, 28);
        casillas[30] = Casilla.getCasillaCarcel("C31", 0);
        casillas[31] = Casilla.getCasillaCalle("C32", 300, 30);
        casillas[32] = Casilla.getCasillaCalle("C33", 300, 30);
        casillas[33] = Casilla.getCasillaSuerte("C34", 0);
        casillas[34] = Casilla.getCasillaCalle("C35", 320, 32);
        casillas[35] = Casilla.getCasillaCalle("C36", 200, 20);
        casillas[36] = Casilla.getCasillaSuerte("C37", 0);
        casillas[37] = Casilla.getCasillaCalle("C38", 350, 35);
        casillas[38] = Casilla.getCasillaTrampa("C39", 0);
        casillas[39] = Casilla.getCasillaCalle("C40", 400, 40);
    }
    
    public void initPartida() {
        for(Jugador j : jugadores) {
            casillas[0].setJugador(j);
            j = casillas[0].callback(j);
        }
    }
    
    public int tiraDado() {
        Random rnd = new Random();
        return rnd.nextInt(10)+2;
    }
    
    public void mover(int tirada) {
        casillas[jugadores.get(turno).getCasilla()].removeJugador(jugadores.get(turno));
        jugadores.get(turno).setCasilla(tirada);
        casillas[jugadores.get(turno).getCasilla()].setJugador(jugadores.get(turno));
        if(jugadores.get(turno).getCasilla() == 0){
            jugadores.set(turno, casillas[jugadores.get(turno).getCasilla()].callback(jugadores.get(turno)));
        } else if (jugadores.get(turno).getCasilla() == 2 ||
                jugadores.get(turno).getCasilla() ==  7 ||
                jugadores.get(turno).getCasilla() == 17 ||
                jugadores.get(turno).getCasilla() == 22 ||
                jugadores.get(turno).getCasilla() == 33 ||
                jugadores.get(turno).getCasilla() == 36) {
            jugadores.set(turno, casillas[jugadores.get(turno).getCasilla()].callback(jugadores.get(turno)));
        } else if (jugadores.get(turno).getCasilla() == 4 ||
                jugadores.get(turno).getCasilla() == 12 ||
                jugadores.get(turno).getCasilla() == 28 ||
                jugadores.get(turno).getCasilla() ==  38){
            int val = casillas[jugadores.get(turno).getCasilla()].callback();
            this.bote += val;
            jugadores.get(turno).addDinero(val, Boolean.FALSE);
        } else if(jugadores.get(turno).getCasilla() == 30){
            jugadores.set(turno, casillas[jugadores.get(turno).getCasilla()].callback(jugadores.get(turno),this.bote));
            this.bote = 0;
        }// else {
//            jugadores = casillas[jugadores.get(turno).getCasilla()].callback(jugadores, turno);
//        }
    }
    
    public int avanzaTurno() {
        
        if(turno == jugadores.size()-1){
            turno=0;
        }else {
            turno++;
        }
        return turno;
    } 
    
    public void deleteJugadores() {
        jugadores.clear();
    }

    public void compraCasilla() {
        if(casillas[jugadores.get(turno).getCasilla()].getDueño() == -1){
            jugadores.get(turno).setCasillas(jugadores.get(turno).getCasilla());
            ((CasillaCalle)casillas[jugadores.get(turno).getCasilla()]).setDueño(turno);
        }
    }
}
