import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@Tag("withoutParameters")

public class Tests {

    @Test
    void firstTest(){
        assertTrue(false);
    }

    @Test
    @Tag("withParameters")
    void secondTest(){
        String a= System.getProperty("a");
        System.out.println("++++++++++++++++++");
        System.out.println(a);
        System.out.println("++++++++++++++++++");
        assertEquals("3",a);
    }

    @Test
    void therdTest(){
        assertNull(null);
    }
}
