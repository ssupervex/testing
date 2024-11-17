import java.util.Arrays;

public class MyArray {
    public static void myArray(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        if (arr.length == 4) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length != 4) {
                    throw new MyArraySizeException("Количество столбцов не равно 4");
                }
            }
        } else {
            throw new MyArraySizeException("Количество строк не равно 4");
        }

        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Ошибка в ячейке " + i + ";" + j + " : " + "символ " + arr[i][j]);
                }
            }
        }
    }

    public static void main(String[] args) {
        String[][] arr = {{"1", "h", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}, {"1", "2", "3", "4"}};

        try {
            myArray(arr);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }

        System.out.println("Конец");

    }

}

