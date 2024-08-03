import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EmployeeDao {
    public static void createEmployee(Employee employee) throws SQLException {
        Connection con = DB.connect();
        String query = Query.insert;
        PreparedStatement pstm = con.prepareStatement(query);
        pstm.setInt(1, employee.getId());
        pstm.setString(2, employee.getName());
        pstm.setString(3, employee.getEmail());
        pstm.setInt(4, employee.getSalary());
        System.out.println("\n ps =" + pstm + "\n");
        pstm.executeUpdate();
        pstm.close();

    }

    public static void updateEmployee(int id, String name) throws SQLException {
        Connection con = DB.connect();
        String query = Query.update;
        PreparedStatement pstm = con.prepareStatement(query);
        pstm.setString(1, name);
        pstm.setInt(2, id);
        System.out.println("\n ps =" + pstm + "\n");
        pstm.executeUpdate();
        pstm.close();

    }

    public static ArrayList<Employee> readAllEmployee() throws SQLException {
        ArrayList<Employee> empList = new ArrayList<Employee>();
        Connection con = DB.connect();
        String query = Query.select;
        PreparedStatement pstm = con.prepareStatement(query);
        ResultSet rs = pstm.executeQuery(query);
        while (rs.next()) {
            Employee emp = new Employee(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4));
            empList.add(emp);
        }
        pstm.close();
        return empList;

    }

    public static void deleteEmployee(int id) throws SQLException {
        Connection con = DB.connect();
        String query = Query.delete;
        PreparedStatement pstm = con.prepareStatement(query);
        pstm.setInt(1, id);
        System.out.println("\n ps =" + pstm + "\n");
        pstm.executeUpdate();
        pstm.close();

    }
}
