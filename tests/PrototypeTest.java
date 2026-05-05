import abstract_factory.ContentPrototype;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.testng.AssertJUnit.assertEquals;

public class PrototypeTest {

    @Test
    public void testClone() throws Exception {
       ContentPrototype original = new ContentPrototype("AI Lesson");
        ContentPrototype clone = (ContentPrototype) original.clone();

        assertEquals(original.getTitle(), clone.getTitle());
    }


}