import java.util.ArrayList;

public class Words {
    static String[] arr = {"Арбуз", "Морковь", "Вишня", "Персик", "Груша", "Арбуз", "Дыня", "Нектарин", "Нектарин", "Арбуз", "Метро", "Клубника", "Яблоко", "Мандарин", "Мандарин", "Арбуз"};
    static ArrayList<String> unique = new ArrayList<>();

    public static void uniquesWords() {
        for (int i = 0; i < arr.length; i++) {
            if (!unique.contains(arr[i])) {
                unique.add(arr[i]);
            }
        }
        System.out.println(unique);
    }

    public static void countEachWord() {
        for (int h = 0; h < unique.size(); h++) {
            String currentValue = unique.get(h);
            int currentValueCount = 0;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == currentValue) {
                    currentValueCount += 1;
                }
            }
            System.out.println(currentValue);
            System.out.println(currentValueCount);
        }
    }
}
