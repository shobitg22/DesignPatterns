package SingeltonPattern.Syncronized;

public class DBConnection {
    private static DBConnection dbConnection;

    private DBConnection() {
    }

    synchronized public static DBConnection getInstance(){ // expensive
        if (dbConnection==null){
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }
}
