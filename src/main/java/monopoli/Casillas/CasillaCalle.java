/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoli.Casillas;

import monopoli.Jugador;

/**
 *
 * @author oscar
 */
public class CasillaCalle extends Casilla {
    private int casas = 0;
    private Jugador dueño;
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

    public Jugador getDueño() {
        return dueño;
    }

    public void setDueño(Jugador dueño) {
        this.dueño = dueño;
    }
        
        
}
