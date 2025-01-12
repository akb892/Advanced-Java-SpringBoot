package com.cg.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import com.cg.bean.Employee;
import com.cg.config.MyConnection;

public class EmployeeDao implements IEmployeeDao {
	
	Connection con = MyConnection.getConnection();

	@Override
	public List<Employee> getAll() {
		
		List<Employee> employees = new ArrayList<>();
		try {
			Statement stat = con.createStatement();
			ResultSet rs = stat.executeQuery("select * from employee");
			while(rs.next()) {
				Employee obj = new Employee(rs.getInt(1), rs.getString(2),  rs.getDate(3).toLocalDate(), rs.getDouble(5), rs.getString(6), rs.getLong(4));
				employees.add(obj);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return employees;
	}

	@Override
	public Employee findEmployee(int empid) {
		Employee obj= null;
		try {
			PreparedStatement st = con.prepareStatement("select * from Employee where empid = ?");
			st.setInt(1, empid);
			ResultSet rs = st.executeQuery();
			
			if(rs.next()) {
				obj = new Employee(rs.getInt(1), rs.getString(2),  rs.getDate(3).toLocalDate(), rs.getDouble(5), rs.getString(6), rs.getLong(4));
			}
			else {
				System.out.println("Employee not found");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return obj;
	}

	@Override
	public void createEmployee(Employee o) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps = con.prepareStatement("insert into Employee values(?,?,?,?,?,?)");
			ps.setInt(1, o.getEmpid());
			ps.setString(2, o.getName());
			ps.setDate(3, java.sql.Date.valueOf(o.getDob()));
			ps.setLong(4, o.getPhone());
			ps.setDouble(5, o.getSalary());
			ps.setString(6, o.getEmail());
			
			int rows = ps.executeUpdate();
			
			if(rows > 0) {
				System.out.println("Employee Created");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}

	@Override
	public void deleteEmployee(int empid) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps = con.prepareStatement("delete from employee where empid = ?");
			ps.setInt(1, empid);
			int rows = ps.executeUpdate();
			if(rows >0) {
				System.out.println("Employee removed");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateEmployee(Employee o) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps = con.prepareStatement("update employee set name = ?, dob = ?, phone = ? , salary = ?, email = ? where empid = ?");
			ps.setString(1, o.getName());
			ps.setDate(2, java.sql.Date.valueOf(o.getDob()));
			ps.setLong(3, o.getPhone());
			ps.setDouble(4, o.getSalary());
			ps.setString(5, o.getEmail());
			ps.setInt(6, o.getEmpid());
			int rows = ps.executeUpdate();
			if(rows > 0) {
				System.out.println("Employee Updated");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
	}

}
