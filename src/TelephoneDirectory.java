import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class TelephoneDirectory {
    public static HashMap<String, String> td = new HashMap<>();

    public static void fill() {
        td.put("+7 999 999 99 91", "Иванов");
        td.put("+7 999 999 99 92", "Петров");
        td.put("+7 999 999 99 93", "Сидоров");
        td.put("+7 999 999 99 94", "Кравченко");
        td.put("+7 999 999 99 95", "Синичкин");
        td.put("+7 999 999 99 96", "Сидоров");
    }

    public static void add(String number, String lastName) {
        td.put(number, lastName);
    }

    public static void get(String lastName) {
        System.out.println(
                td.entrySet()
                        .stream()
                        .filter(e -> Objects.equals(e.getValue(), lastName))
                        .map(Map.Entry::getKey)
                        .collect(Collectors.toList())
        );
    }

    public static void printAll() {
        System.out.println(td);
    }
}
