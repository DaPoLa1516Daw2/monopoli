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
public class CasillaBote extends Casilla {

    public CasillaBote(String aNombre, int aRetibucion) {
        super(aNombre, aRetibucion);
    }
    
    @Override
    public Jugador callback(Jugador j1, int bote) {
        j1.addDinero(bote, Boolean.TRUE);
        return j1;
    }
}
