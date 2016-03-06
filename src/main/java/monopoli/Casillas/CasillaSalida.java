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
public class CasillaSalida extends Casilla {

    public CasillaSalida(String aNombre, int aRetibucion) {
        super(aNombre, aRetibucion);
    }
    
    public int addDinero(){
        return 2000;
    }

    public Jugador callback(Jugador j1) {
        j1.addDinero(addDinero(), Boolean.TRUE);
        return j1;
    }
}
