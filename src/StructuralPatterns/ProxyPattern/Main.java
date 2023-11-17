package ProxyPattern;

public class Main {
    public static void main(String[] args) {
        EmployeeDaoProxy employeeDaoProxy = new EmployeeDaoProxy();
        employeeDaoProxy.create();
    }
}
