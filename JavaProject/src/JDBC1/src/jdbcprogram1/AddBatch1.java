package jdbcprogram1;//working
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class AddBatch1 {

	Connection con=null;
		AddBatch1() throws ClassNotFoundException, SQLException
		{
			con=Connection1.getConnection();
		}
		
		void add() throws SQLException
		{
			Statement st=con.createStatement();
			//st.addBatch("insert into model values(1006,'RoyalEnfield',36000)");
			
			st.addBatch("insert into model values(1007,'Unicorn',40000)");
			st.addBatch("update model set cost=35000 where model_id=103");
			st.addBatch("delete from model where model_id=1007");
			
			int a[]=st.executeBatch();
			for(int i=0;i<a.length;i++)
			{
				System.out.println(a[i]+ "row affected");
			}
					
			
		}

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			AddBatch1 a=new AddBatch1();
			a.add();

		}

	}
