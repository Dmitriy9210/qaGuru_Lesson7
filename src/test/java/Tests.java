import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


@Tag("good")

public class Tests {

    @Test
    @Tag("bad")
    void firstTest(){
        assertTrue(false);
    }

    @Test
    void secondTest(){
        String a= System.getProperty("a","3");
        System.out.println("++++++++++++++++++");
        System.out.println(a);
        System.out.println("++++++++++++++++++");
        assertEquals("3",a);
    }

    @Test
    void thirdTest(){
        assertNull(null);
    }
}
