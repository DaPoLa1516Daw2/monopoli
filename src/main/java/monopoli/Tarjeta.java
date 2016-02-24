/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package monopoli;

import java.util.Random;
/**
 *
 * @author oscar
 */
public abstract class Tarjeta {
    public static int getTarjeta(){
        Random rnd = new Random();
        return rnd.nextInt(1001)-500;
    }
}
