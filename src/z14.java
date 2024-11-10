import java.util.Arrays;

public class z14 {
    public static void main(String[] args) {
       ARR(5,6);
    }
    public static void ARR(int len, int initialValue){
        int[] arr= new int[len];
        for (int i=0; i< arr.length; i++){
            arr[i]=initialValue;
        }
        System.out.println(Arrays.toString(arr));
    }
}
