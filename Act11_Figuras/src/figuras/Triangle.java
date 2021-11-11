/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

import javax.swing.JOptionPane;

/**
 *
 * @author Javi
 */
public class Triangle implements Shape {

    private double base, heigh, side1, side2;

    public Triangle(double base, double heigh) {
        this.base = base;
        this.heigh = heigh;
    }

    @Override
    public String getPerimeter() {
        base = Double.parseDouble(JOptionPane.showInputDialog(null, "Indica el lado 1 del triangulo"));
        side1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Indica el lado 2 del triangulo"));
        side2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Indica el lado 3 del triangulo"));
        return "El perimetro es: " + (base + side1 + side2);
    }

    @Override
    public String getArea() {
        return "El Area es: " + ((base * heigh) / 2);
    }

}
