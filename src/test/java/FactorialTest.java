import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class FactorialTest {

    @Test
    void countFactorial() {
        Factorial fac = new Factorial();
        assertEquals(fac.countFactorial(4), BigInteger.valueOf(24));
    }

    @Test
    void nIsNatural() {
        Factorial fac = new Factorial();
        fac.countFactorial(0);
    }
}