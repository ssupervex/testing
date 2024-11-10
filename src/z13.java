import java.util.Arrays;

public class z13 {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        for (int i = 0; i < arr.length; i++) {
           for (int j = 0; j< arr.length;j++){
               if (i==j || i==arr.length-j-1 ){
                   arr[i][j]=1;
               }
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
