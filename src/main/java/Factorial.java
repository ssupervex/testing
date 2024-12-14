import java.math.BigInteger;

public class Factorial {

    public BigInteger countFactorial(int n) {
        BigInteger result = BigInteger.ONE;
        if (n > 0) {
            for (int i = 2; i <= n; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }
            System.out.println(result);
        } else System.out.println("Введите число больше 0");
        return result;
    }
}
