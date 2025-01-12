package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class TestConnection {

	public static void main(String[] args) {
		Connection con = null;
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the employee id to find details");
//		int id = sc.nextInt();
//		System.out.println("Enter name =");
//		String name = sc.next();
//		System.out.println("Enter Mailid : ");
		//String mail = sc.next();
		System.out.println("Enter first character");
		char c = sc.next().charAt(0);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Driver Loaded");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "aryan", "aryan123");
			System.out.println("Connected...");
			Statement stat = con.createStatement();
			//PreparedStatement ps = con.prepareStatement("select *  from employee where email= ? and name = ?");
			PreparedStatement ps1 = con.prepareStatement("select * from employee where name like ?");
			ps1.setString(1, Character.toString(c)+"%");
//			ps.setString(1, mail);
//			ps.setString(2, name);
			ResultSet rs = stat.executeQuery("select * from Employee");
			while (rs.next()) {
				System.out.println(rs.getInt("empid") + "\t" + rs.getString(2) + "\t" + rs.getDate(3) + "\t" + rs.getLong(4) + "\t" + rs.getDouble(5) + "\t" + rs.getString(6));
			}
			System.out.println();
//			ResultSet rs1 = stat.executeQuery("select * from Employee where empid = " + id);
//			ResultSet rs1 = ps.executeQuery();
//			if(rs1.next()) {
//				System.out.println(rs1.getInt("empid") + "\t" + rs1.getString(2) + "\t" + rs1.getDate(3) + "\t" + rs1.getLong(4) + "\t" + rs1.getDouble(5) + "\t" + rs1.getString(6));
//			}
//			else {
//				System.out.println("Employee not found!");
//			}
			ResultSet rs2 = ps1.executeQuery();
			while(rs2.next()) {
				System.out.println(rs2.getInt("empid") + "\t" + rs2.getString(2) + "\t" + rs2.getDate(3) + "\t" + rs2.getLong(4) + "\t" + rs2.getDouble(5) + "\t" + rs2.getString(6));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				sc.close();
				con.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
