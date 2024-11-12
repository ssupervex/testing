public class Circle implements ShapeMetods {
    double r;
    String borderColor;
    String backgroundColor;

    public Circle(double r, String borderColor, String backgroundColor) {
        this.r = r;
        this.borderColor = borderColor;
        this.backgroundColor = backgroundColor;
    }

    @Override
    public void colorBorders() {
        System.out.println("Цвет границ круга " + borderColor);
    }

    @Override
    public void colorBackground() {
        System.out.println("Цвет фона круга " + backgroundColor);
    }

    @Override
    public void calcPerimeter() {
        double l = 2 * Math.PI * r;
        System.out.println("Длина окружности равна " + l);
    }

    @Override
    public void calcSquare() {
        double s = Math.PI * Math.pow(r, 2);
        System.out.println("Площадь круга равна " + s);
    }
}
