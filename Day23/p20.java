package Day23;
/*
 13. Static Nested Class: Database Connection
Problem: Create a Database class with a static nested class Connection to manage database connections. 
 */
class Database {
    private static String dbName = "MyDatabase";

    static class Connection {
        void connect() {
            System.out.println("Connected to: " + dbName);
        }
    }
}

public class p20{
    public static void main(String[] args) {
        Database.Connection connection = new Database.Connection();
        connection.connect(); // Output: Connected to: MyDatabase
    }
}