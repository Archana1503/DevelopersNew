package jdbcprogram1;
import java.sql.*;


public class InsertUpdateDelete {
	Connection con=null;
	Statement st;
	InsertUpdateDelete() throws ClassNotFoundException,SQLException
	{
		con= Connection1.getConnection();
		
	}
	void insert()throws SQLException
	{
		st=con.createStatement();
		int a=st.executeUpdate("insert into customer values(9,'Rajesh','Joshi',1009,'76584783','male','rssdsaanl@gmail.com')");
		System.out.println(a+" row inserted");
		
	}
	void show() throws SQLException
	{
		st=con.createStatement();
		ResultSet rs=st.executeQuery("select*from customer");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+ " "+rs.getString(3)+" "+rs.getInt(4)+" "
		+rs.getString(5)+ " "+rs.getString(6));
		}
	}
	void update()throws SQLException
	{
		st=con.createStatement();
		int a=st.executeUpdate("update customer set phone_no='98997766' where cust_id=3");
		System.out.println(a+"row updated");
		
	}
	void delete()throws SQLException
	{
		st=con.createStatement();
		int a=st.executeUpdate("delete from customer where cust_id=1");
		System.out.println("Row deleted");
	}
	public static void main(String[]args)throws ClassNotFoundException,SQLException{
		InsertUpdateDelete i=new InsertUpdateDelete();
		//i.insert();
		i.update();
		i.delete();
		i.show();
	}
	
	}
	













