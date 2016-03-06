/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoli.Casillas;

import java.util.ArrayList;
import monopoli.Jugador;

/**
 *
 * @author oscar
 */
public class CasillaCalle extends Casilla {
    private int casas = 0;
    private int dueño = -1;
    private int precio;

    public CasillaCalle(String aNombre, int aRetibucion, int aValor) {
        super(aNombre, aRetibucion);
        precio = aValor;
    }
    
    public int getCasas() {
        return casas;
    }

    public void setCasas(int casas) {
        this.casas =+ casas;
    }

    public int getDueño() {
        return dueño;
    }

    public void setDueño(int dueño) {
        this.dueño = dueño;
    }

    @Override
    public ArrayList<Jugador> callback(ArrayList<Jugador> jugadores, int j) {
        if(!(this.dueño < 0)){
            jugadores.get(j).addDinero(this.casas*(precio/100*10), Boolean.FALSE);
            jugadores.get(this.dueño).addDinero(this.casas*(precio/100*10), Boolean.TRUE);
        }
        return jugadores;
    }
}
