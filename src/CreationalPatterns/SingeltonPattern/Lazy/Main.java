package SingeltonPattern.Lazy;


public class Main {
    public static void main(String[] args) {
        DBConnection dbConnection = DBConnection.getInstance();
        System.out.println(dbConnection);
    }
}