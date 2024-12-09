public class Main {
    public static void main (String[] args){
        Words.uniquesWords();
        Words.countEachWord();
        TelephoneDirectory.fill();
        TelephoneDirectory.add("+7 999 999 99 97", "Высоцкий");
        TelephoneDirectory.printAll();
        TelephoneDirectory.get("Сидоров");
    }
}
