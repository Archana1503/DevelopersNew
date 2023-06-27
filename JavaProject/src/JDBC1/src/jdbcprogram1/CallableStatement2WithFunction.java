package jdbcprogram1;//check output once

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Types;



public class CallableStatement2WithFunction {
	Connection con=null;
	
	CallableStatement2WithFunction() throws ClassNotFoundException, SQLException
	{
		con=Connection1.getConnection();
	}
	
	void show_data(int amount) throws ClassNotFoundException, SQLException
	{
	
	String sql="{?=call discount1(?)}";
	CallableStatement cs=con.prepareCall(sql);
	cs.registerOutParameter(1, Types.INTEGER);
	cs.setInt(2,amount);
	
	cs.execute();
	
	int temp=cs.getInt(1);
	System.out.println(temp);
	}
	void show_data2(String first,String second) throws ClassNotFoundException, SQLException
	{
	
	String sql="{?=call merging(?,?)}";
	CallableStatement cs=con.prepareCall(sql);
	cs.registerOutParameter(1, Types.VARCHAR);
	cs.setString(2,first);
	cs.setString(3, second);
	
	cs.execute();
	
	String temp=cs.getString(1);
	System.out.println(temp);
	}
	
	
	
	


	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		CallableStatement2WithFunction cs=new CallableStatement2WithFunction();
		cs.show_data(1900);
		cs.show_data2("pooja", "sharma");

	}

}
