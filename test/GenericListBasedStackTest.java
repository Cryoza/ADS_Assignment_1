import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class GenericListBasedStackTest {
    private GenericListBasedStack glbs;

    //Before each
    @BeforeEach
    public void setup() {
        glbs = new GenericListBasedStack();
    }

    @Test
    public void pushPopTest() {
        assertEquals(0,glbs.size());
        for(int i = 0; i < 69; i++) {
            glbs.push(i);
        }
        assertEquals(69,glbs.size());
        for(int j = 68; j >= 0; j--) {
            assertEquals(j,glbs.pop());
        }
    }

    @Test
    public void peekTest() {
        assertEquals(null,glbs.peek());
        for(int i = 0; i < 69; i++) {
            glbs.push(i);
            assertEquals(i,glbs.peek());
        }
    }
}
