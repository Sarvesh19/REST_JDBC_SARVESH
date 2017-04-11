package jdbc.mysql;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/getpersondata")
public class JdbcWebService {

	@GET
	@Path("getdata")
	@Produces(MediaType.TEXT_PLAIN)
	public Response getMsg(@PathParam("isCallFromUI") boolean isCallFromUI) throws ClassNotFoundException, SQLException {
		JdbcTestDAO jdbcTestDAO = new JdbcTestDAO();
		List<Employee> employeeslist = jdbcTestDAO.JdbcMain();
		return Response.ok(employeeslist, MediaType.TEXT_PLAIN).build();
	}
}
