public class z9 {
    public static void main(String[] args) {
        System.out.println(whatYear(100));
    }

    public static boolean whatYear(int num) {
        return (num % 4 == 0 && num % 100!= 0) || num % 400 == 0;
    }
}