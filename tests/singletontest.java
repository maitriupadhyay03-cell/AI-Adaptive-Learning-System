import abstract_factory.DatabaseConnection;
import org.junit.Test;

import static org.testng.AssertJUnit.assertSame;

@Test
public void testSingleton() {
    DatabaseConnection db1 = DatabaseConnection.getInstance();
    DatabaseConnection db2 = DatabaseConnection.getInstance();

    assertSame(db1, db2);
}

void main() {
    testSingleton();
}

