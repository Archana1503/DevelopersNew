package jdbcprogram1;//have to check output

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLType;
import java.sql.Types;

public class CallableStatementOut {
	Connection con=null;

	
	CallableStatementOut() throws ClassNotFoundException, SQLException
	{
		 con=	Connection1.getConnection();
	}
	void show_data(int m_id) throws ClassNotFoundException, SQLException
	{
	
	String sql="{call proc2(?,?)}";
	CallableStatement cs=con.prepareCall(sql);
	cs.setInt(1,m_id);
	cs.registerOutParameter(2,Types.INTEGER);
	
	boolean b=cs.execute();
	//if(b==false)
	System.out.println(cs.getInt(2));
	}
	
	

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		CallableStatementOut  cs=new CallableStatementOut ();
		cs.show_data(103);

	}

}
