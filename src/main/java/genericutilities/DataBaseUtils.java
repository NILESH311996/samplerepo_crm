package genericutilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Driver;


	
	public class DataBaseUtils 

	{

		Connection conn = null;
		ResultSet result = null;
		/**Establishes a connection to the MySQL database using the credentials defined in the link
		 *  This method must be invoked before calling any executeQuery or updateQuery operations.
		 * @throws SQLException if database driver registration or connection fails
		 */

		public void connectToDb() throws SQLException {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			// get connection for databse

			conn = DriverManager.getConnection(IPathConstants.dbUrl, IPathConstants.dbusername, IPathConstants.Dbpassword);
		}

}
