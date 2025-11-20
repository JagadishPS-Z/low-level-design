public class EmployeeDaoImpl implements EmployeeDao {

    @Override
    public void create(String client, EmployeeDo obj) throws Exception {
        //creates a new Row
        System.out.println("created new row in the Employee table");
    }

    @Override
    public void delete(String client, int employeeId) throws Exception{
        //delete a Row
        System.out.println("deleted row with employeeID:" + employeeId);
    }

    @Override
    public EmployeeDo get(String client, int employeeId) throws Exception {
        //fetch row
        System.out.println("fetching data from the DB");
        return new EmployeeDo();
    }
}
