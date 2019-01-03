//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
//import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.*;


public class SimpleTest {
    Simple m;
    @BeforeEach
    public void setUp() throws Exception {
        m = new Simple();
    }

    @AfterEach
    public void tearDown() throws Exception {
    }

    @Test
    public void sub() {
//        Simple m = new Simple();
        assertEquals(42,m.sub());
    }
}