package SingeltonPattern.Lazy;

public class DBConnection {

    private static DBConnection dbConnection ; // lazy

    private DBConnection() {
    }

    public static DBConnection getInstance(){
        if(dbConnection==null){
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }
}
