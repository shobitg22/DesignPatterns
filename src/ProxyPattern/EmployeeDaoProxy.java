package ProxyPattern;

public class EmployeeDaoProxy implements EmployeeDao{
    private EmployeeDao employeeDao;

    public EmployeeDaoProxy() {
        this.employeeDao = new EmployeeDaoImpl();
    }

    @Override
    public void create() {
        // we can write some logic, if admin role, then only call create other throw exception
        employeeDao.create();
    }
}
