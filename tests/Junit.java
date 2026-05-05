import org.junit.Test;
import static org.junit.Assert.*;

public class PrototypeTest {

    @Test
    public void testClone() throws Exception {
        ContentPrototype original = new ContentPrototype("AI Lesson");
        ContentPrototype clone = (ContentPrototype) original.clone();

        assertEquals(original.getTitle(), clone.getTitle());
    }
}