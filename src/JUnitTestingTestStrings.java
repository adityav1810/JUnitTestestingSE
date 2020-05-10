import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JUnitTestingTestStrings {

    @Test
    void addStrings() {
        assertEquals("onetwo", new JUnitTesting().addStrings("one", "two"));
    }
}