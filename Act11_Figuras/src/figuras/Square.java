package figuras;

public class Square implements Shape {

    private double base;

    public Square(double base) {
        this.base = base;
    }

    @Override
    public String getPerimeter() {
        return "El perimetro es: " + (base * 4);
    }

    @Override
    public String getArea() {
        return "El area es: " + (base * base);
    }

}
