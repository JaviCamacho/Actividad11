/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author Javi
 */
public class Figuras {

    public static boolean datoPSacar;       //False: Area        True: Perimetro
    public static int shape;        //0 : Triangle   1 : Circle   2 : Square
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Interfaz mpu = new Interfaz();
        mpu.setVisible(true);
        mpu.setLocationRelativeTo(null);
    }

}
