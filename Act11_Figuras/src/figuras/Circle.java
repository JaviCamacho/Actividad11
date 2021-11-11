/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author avile
 */
public class Circle implements Shape {

    private double ratio;

    public Circle(double ratio) {
        this.ratio = ratio;
    }

    public void setRatio(double ratio) {
        this.ratio = ratio;
    }

    @Override
    public String getPerimeter() {
        double result = 2 * Math.PI * ratio;
        return "El Perimetro del circulo es: "+ result;
    }

    @Override
    public String getArea() {
        double result = Math.PI * (ratio * ratio);
        return "El Area del circulo es: "+ result;
    }

}
