package jdbc.mysql;

import java.sql.SQLException;
import java.util.List;

public class JdbcTestController {

	public static void main(String[] args) {
		try {
			JdbcTestDAO jdbcTestDAO = new JdbcTestDAO();
			List<Employee> employeeslist = jdbcTestDAO.JdbcMain();
			System.out.println(employeeslist);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
