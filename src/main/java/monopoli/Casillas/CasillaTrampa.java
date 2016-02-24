/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoli.Casillas;

import java.util.Random;
/**
 *
 * @author oscar
 */
public class CasillaTrampa extends Casilla {
    Random rnd = new Random();

    public CasillaTrampa(String aNombre, int aRetibucion) {
        super(aNombre, aRetibucion);
    }
      
    public int tryTrampa(){
        return rnd.nextInt(300);
    }
}
