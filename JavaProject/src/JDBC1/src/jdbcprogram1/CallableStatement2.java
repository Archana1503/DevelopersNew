package jdbcprogram1;
//
//import java.sql.CallableStatement;
//import java.sql.Connection;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.Scanner;
//
//public class CallableStatement2 {
//	Connection con=null;
//	CallableStatement cs=null;
//	Scanner sc=new Scanner(System.in);
//	CallableStatement2() throws ClassNotFoundException,SQLException
//	{
//		con= Connection1.getConnection();
//		
//	}
//	void callProcedure()throws SQLException
//	{
//		cs=con.prepareCall("{call proc4(?)}");
//		System.out.println("Enter customer id");
//		int id=sc.nextInt();
//		System.out.println("Enter model no");
//		int m_no=sc.nextInt();
//		cs.setInt(1, id);
//		cs.setInt(2, m_no);
//		
//		boolean b=cs.execute();
//		if(true) {
//			
//		}
//		ResultSet rs=cs.getResultSet();
//		while(rs.next()) {
//			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
//		}
//		boolean b1=cs.getMoreResults();
//		System.out.println("...........Second result.....");
//		if(true) {
//			ResultSet rs1=cs.getResultSet();
//			while(rs1.next())
//			{
//				System.out.println(rs1.getInt(1)+" "+rs1.getString(2));
//			}
//		}
//		
//	}
//	
//	
//
//	public static void main(String[] args)  throws ClassNotFoundException,SQLException
//	{
//		
//	
//		CallableStatement2 cs=new CallableStatement2();
//     cs.callProcedure();
//
//
//	}
//
//}


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class CallableStatement2 {
    Connection con = null;
    CallableStatement cs = null;
    Scanner sc = new Scanner(System.in);

    CallableStatement2() throws ClassNotFoundException, SQLException {
        con = Connection1.getConnection();
    }

    void callProcedure() throws SQLException {
        cs = con.prepareCall("{call proc4(?)}");
        System.out.println("Enter customer id");
        int id = sc.nextInt();
        cs.setInt(1, id);

        boolean b = cs.execute();
        if (b) {
            ResultSet rs = cs.getResultSet();
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4));
            }
        }

        boolean b1 = cs.getMoreResults();
        System.out.println("...........Second result.....");
        if (b1) {
            ResultSet rs1 = cs.getResultSet();
            while (rs1.next()) {
                System.out.println(rs1.getInt(1) + " " + rs1.getString(2));
            }
        }
    }
    public static void main(String[] args)  throws ClassNotFoundException,SQLException
	{
			
	CallableStatement2 cs=new CallableStatement2();
    cs.callProcedure();


	}
}

