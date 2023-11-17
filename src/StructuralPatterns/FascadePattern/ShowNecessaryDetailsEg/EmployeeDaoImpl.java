package FascadePattern.NecessaryDetailsEg;

public class EmployeeDaoImpl implements EmployeeDao{
    @Override
    public void create() {
        System.out.println("CREATE");
    }

    @Override
    public void get() {
        System.out.println("GET");
    }

    @Override
    public void delete() {
        System.out.println("DELETE");
    }
}
