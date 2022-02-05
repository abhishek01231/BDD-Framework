package customLib;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import config.Constants;
import support.ExecuteTestcase;
import support.Log;

public class databaseMethods {
	
	private static databaseMethods object = null;
	public int Transactionid;
	
	private databaseMethods() {
		
	}
	
	public static databaseMethods getInstance() {
		if(object == null) {
			object = new databaseMethods();
		}
		return object;
	}
	
	public void verifyDBBeforeEligibilityCheck(String object, String data) {
		/**************************************************************************************************
		 * /** Des: This function is used Fetch the latest transaction id
		 * 
		 * /
		 **************************************************************************************************/
		String databaseURL = Constants.DBURL;
		String user = Constants.userName;
		String password = Constants.pwd;
		String Query = data;
		System.out.println(Query);
		java.sql.Connection conn = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(databaseURL, user, password);
			if (conn != null) {
				System.out.println(Query);
				System.out.println("Connected to the database");
			}

			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(Query);

			while (rs.next()) {
				System.out.println(Query);
				Transactionid = rs.getInt(1);
				System.out.println(Transactionid);
				ExecuteTestcase.bResult = true;
				System.out.println("Value is Stored");
			}

		} catch (ClassNotFoundException ex) {
			System.out.println("Could not find database driver class");
			ExecuteTestcase.bResult = false;
			ex.printStackTrace();
		} catch (SQLException ex) {
			System.out.println("An error occurred.");
			ex.printStackTrace();
		} catch (Exception e) {
			Log.info("An error couured" + e.getMessage());
			ExecuteTestcase.bResult = false;
		}

		finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException ex) {
					ex.printStackTrace();
				}
			}
		}

	}

}
