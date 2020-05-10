import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JUnitTestingTestNumbers {

    @Test
    void addNumbers() {
        assertEquals(50, new JUnitTesting().addNumbers(30,20));
    }
}