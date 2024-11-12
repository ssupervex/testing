public class Task2Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3, "красный", "голубой");
        circle1.colorBorders();
        circle1.colorBackground();
        circle1.calcPerimeter();
        circle1.calcSquare();

        Square square1 = new Square(4, "жёлтый","зелёный");
        square1.colorBorders();
        square1.colorBackground();
        square1.calcPerimeter();
        square1.calcSquare();

        Triangle tr1 = new Triangle(4, 3, 2,5, "серый","розовый");
        tr1.colorBorders();
        tr1.colorBackground();
        tr1.calcPerimeter();
        tr1.calcSquare();
        tr1.test();
    }
}
