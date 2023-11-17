package FascadePattern.NecessaryDetailsEg;

public class EmployeeFascade {
    private EmployeeDao employeeDao;

    public EmployeeFascade() {
        employeeDao = new EmployeeDaoImpl();
    }

    void create(){
        employeeDao.create();
    }
}
