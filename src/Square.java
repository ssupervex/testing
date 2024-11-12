public class Square implements ShapeMetods {
    double a;
    String borderColor;
    String backgroundColor;

    public Square(double a, String borderColor, String backgroundColor) {
        this.a = a;
        this.borderColor = borderColor;
        this.backgroundColor = backgroundColor;
    }

    @Override
    public void colorBorders() {
        System.out.println("Цвет границ квадрата " + borderColor);
    }

    @Override
    public void colorBackground() {
        System.out.println("Цвет фона квадрата " + backgroundColor);
    }

    @Override
    public void calcPerimeter() {
        double p = 4 * a;
        System.out.println("Периметр квадрата равен " + p);
    }

    @Override
    public void calcSquare() {
        double s = Math.pow(a, 2);
        System.out.println("Площадь квадрата равна " + s);
    }
}