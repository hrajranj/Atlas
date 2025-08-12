

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Tag;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestCase02 {

    @Test
    @Tag("firstPriority")
    void testMethod01() {
        System.out.println("Running testMethod01");
        assertEquals(1, 1);
    }

    @Test
    @Tag("firstPriority")
    void runTestcase02() {
        System.out.println("Running runTestcase02");
        assertEquals("hello", "hello");
    }

    @Test
    @Tag("fastTag")
    void testMethod03() {
        System.out.println("Running testMethod03");
        assertEquals(100, 100);
    }

    @Test
    @Tag("slowTag")
    void runTestcase04() {
        System.out.println("Running runTestcase04");
        assertEquals(true, true);
    }
}

