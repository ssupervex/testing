public class Triangle implements ShapeMetods {
    String borderColor;
    String backgroundColor;
    double base;
    double height;
    double a;
    double c;

    public Triangle(double base, double a, double c, double height, String borderColor, String backgroundColor) {
        this.base = base;
        this.a = a;
        this.c = c;
        this.height = height;
        this.borderColor = borderColor;
        this.backgroundColor = backgroundColor;
    }

    @Override
    public void colorBorders() {
        System.out.println("Цвет границ треугольника " + borderColor);
    }

    @Override
    public void colorBackground() {
        System.out.println("Цвет фона треугольника " + backgroundColor);
    }

    @Override
    public void calcPerimeter() {
        double p = a + base + c;
        System.out.println("Периметр треугольника равен " + p);
    }

    @Override
    public void calcSquare() {
        double s = (base * height) / 2;
        System.out.println("Площадь треугольника равна " + s);
    }
}
