import org.testng.annotations.Test;

import java.math.BigInteger;

import static org.testng.Assert.*;

public class FactorialTest {

    @Test
    public void testCountFactorial() {
        Factorial fac = new Factorial();
        assertEquals(fac.countFactorial(3), BigInteger.valueOf(6));
    }

    @Test
    public void nIsNatural() {
        Factorial fac = new Factorial();
        fac.countFactorial(-1);
    }
}