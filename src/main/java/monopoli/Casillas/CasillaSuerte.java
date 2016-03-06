/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoli.Casillas;
import monopoli.Jugador;
import monopoli.Tarjeta;

/**
 *
 * @author oscar
 */
public class CasillaSuerte extends Casilla {

    public CasillaSuerte(String aNombre, int aRetibucion) {
        super(aNombre, aRetibucion);
    }
    
    public int trySuerte(){
        return Tarjeta.getTarjeta();
    }

    public Jugador callback(Jugador j1) {
        j1.addDinero(trySuerte(), Boolean.TRUE);
        return j1;
    }
}
