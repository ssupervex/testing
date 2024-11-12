public class Dog extends Animal {
    String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public void run(int distance) {
        if (distance > 0 && distance <= 500) {
            System.out.println(name + " пробежал " + distance + "м");
        } else {
            System.out.println(name + " столько не пробежит.");
        }
    }

    @Override
    public void swim(int distance) {
        if (distance > 0 && distance <= 10) {
            System.out.println(name + " проплыл " + distance + "м");
        } else {
            System.out.println(name + " столько не проплывёт.");
        }
    }
}
