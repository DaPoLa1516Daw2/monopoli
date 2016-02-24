/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoli.Casillas;

/**
 *
 * @author oscar
 */
public class CasillaSalida extends Casilla {

    public CasillaSalida(String aNombre, int aRetibucion) {
        super(aNombre, aRetibucion);
    }
    
    public int addDinero(){
        return 1000;
    }
}
