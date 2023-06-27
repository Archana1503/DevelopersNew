package jdbcprogram1;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class PreParedStatement {
    Connection con = null;
    PreparedStatement ps = null;
    Scanner sc = new Scanner(System.in);

    PreParedStatement() throws ClassNotFoundException, SQLException {
        con = Connection1.getConnection();
    }

    void insert() throws SQLException {
        ps = con.prepareStatement("insert into customer values (?,?,?,?,?,?,?)");
        System.out.println("Enter customer id");
        int id = sc.nextInt();
        System.out.println("Enter customer first name");
        String fname = sc.next();
        System.out.println("Enter customer last name");
        String lname = sc.next();
        System.out.println("Enter customer Model no");
        int model = sc.nextInt();
        System.out.println("Enter customer phone number");
        String phone = sc.next();
        System.out.println("Enter customer gender");
        String gen = sc.next();
        System.out.println("Enter customer email");
        String email = sc.next();
        ps.setInt(1, id);
        ps.setString(2, fname);
        ps.setString(3, lname);
        ps.setInt(4, model);
        ps.setString(5, phone);
        ps.setString(6, gen);
        ps.setString(7, email);
        int a = ps.executeUpdate();
        System.out.println(a + " row inserted");
    }

    public static void main(String[] args) {
        try {
            PreParedStatement preparedStatement = new PreParedStatement();
            preparedStatement.insert();
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
