/**
 * 
 */
package db.jdbc;

import play.db.*;
import java.sql.*;
import java.util.List;
import java.util.ArrayList;

/**
 * @author jtorres
 *
 */
public class DBase {
	public static Connection connect(){
		return DB.getConnection();
	}
	
	public static void disconnect(Connection connection) throws Exception{
		connection.close();
	}
	
	public static void createTable() throws Exception{
		Connection c = connect();
		try{
			c.createStatement().executeUpdate("create table test(value varchar(50))");
		}
		finally{
			disconnect(c);
		}
	}
	
	public static void insertData(String v) throws Exception{
		Connection c = connect();
		try{
			c.createStatement().executeUpdate("insert into test values ('" + v + "')");
		}
		finally{
			disconnect(c);
		}
	}
	
	public static List<String> getData() throws Exception{
		Connection c = connect();
		try{
			ResultSet rset = c.createStatement().executeQuery("select * from test");
			List<String> values = new ArrayList<String>();
			while (rset.next()){
				values.add(rset.getString(1));
			}
			return values;
		}
		finally{
			disconnect(c);
		}
	}
}
