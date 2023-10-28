package SingeltonPattern.Eager;

public class DBConnection {

    private static DBConnection dbConnection = new DBConnection(); // eager

    private DBConnection() {
    }

    public static  DBConnection getInstance(){
        return dbConnection;
    }
}
