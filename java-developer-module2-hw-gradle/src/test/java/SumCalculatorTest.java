import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.module2.SumCalculator;
import static org.junit.jupiter.api.Assertions.*;

public class SumCalculatorTest {

    SumCalculator sumCalculator;

    @BeforeEach
    private void calculatorGenerator(){

        sumCalculator = new SumCalculator();
    }

    @Test
    public void testWithOne(){
        assertEquals(1, sumCalculator.sum(1));
    }

    @Test
    public void testWithThree(){
        assertEquals(6, sumCalculator.sum(3));
    }

    @Test
    public void testWithZero(){
        assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }
}
