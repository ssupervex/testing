public class Cat extends Animal {
    String name;
    boolean satiety;

    public Cat(String name) {
        this.name = name;
        satiety = false;
    }

    @Override
    public void run(int distance) {
        if (distance > 0 && distance <= 200) {
            System.out.println(name + " пробежал " + distance + "м");
        } else {
            System.out.println(name + " столько не пробежит.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eat(){
        satiety=true;
    };
}
