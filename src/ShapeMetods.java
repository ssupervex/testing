public interface ShapeMetods {
    void calcPerimeter();

    void calcSquare();

    void colorBorders();

    void colorBackground();

    default void test() {
        System.out.println("Test default method");
    };
}
