import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class MathUtilTest {
    @Test
    public void testAdd() {
        assertEquals(5, MathUtil.add(2, 3));
    }
    @Test
    public void testSubtract() {
     assertEquals(1, MathUtil.subtract(2, 1));
    }
}