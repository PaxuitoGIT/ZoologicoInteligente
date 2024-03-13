package Zoo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AppTest {
    @Test
    public void testMain() {
        String[] args = {};
        try {
            App.main(args);
        } catch (Exception e) {
            fail("El método main lanzó una excepción: " + e.getMessage());
        }
    }
}