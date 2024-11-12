public class Task1Main {
    static int animalCount;
    static int catCount;
    static int dogCount;
    static int bowl;

    public static Cat createCat(String name) {
        animalCount++;
        catCount++;
        return new Cat(name);
    }

    public static Dog createDog(String name) {
        animalCount++;
        dogCount++;
        return new Dog(name);
    }

    public static void printCounters() {
        System.out.println("Всего животных: " + animalCount);
        System.out.println("Всего котов: " + catCount);
        System.out.println("Всего собак: " + dogCount);
    }

    public static void fillBowl(int foodAmount) {
        if (foodAmount > 0) {
            bowl += foodAmount;
        }
    }

    public static void main(String[] args) {
        Dog dog1 = createDog("Року");
        dog1.run(600);
        Cat cat1 = createCat("Локи");
        cat1.swim(20);
        printCounters();

        String[] catNames = {"Барсик", "Лютик", "Локи", "Персик", "Сплюшка", "Панчи", "Силя", "Степан", "Тимоша", "Кузя"};
        Cat[] cats = new Cat[catNames.length];

        for (int i = 0; i < catNames.length; i++) {
            cats[i] = createCat(catNames[i]);
        }

        fillBowl(70);

        for (int i = 0; i < cats.length; i++) {
            int foodAmount = 10;
            if (bowl >= foodAmount) {
                cats[i].eat();
                bowl -= foodAmount;
            }
        }

        for (Cat cat : cats) {
            System.out.println(cat.name + " поел? " + cat.satiety);
        }
        printCounters();

    }

}
