

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testAddition() {
        App app = new App();
        int result = app.addition(10, 5);
        assertEquals(15, result);
    }
}
