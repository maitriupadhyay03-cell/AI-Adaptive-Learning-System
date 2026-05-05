@Test
public void testSingleton() {
    DatabaseConnection db1 = DatabaseConnection.getInstance();
    DatabaseConnection db2 = DatabaseConnection.getInstance();

    assertSame(db1, db2);
}