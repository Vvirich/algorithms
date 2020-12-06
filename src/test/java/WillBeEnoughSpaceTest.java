import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WillBeEnoughSpaceTest {

    @Test
    public void testWillBeEnoughSpace() {
        assertEquals("Should return 0.", 0, WillBeEnoughSpace.enough(10, 5, 5));
        assertEquals("Should return 10.", 10, WillBeEnoughSpace.enough(100, 60, 50));
        assertEquals("Should return 0.", 0, WillBeEnoughSpace.enough(20, 5, 5));
    }
}