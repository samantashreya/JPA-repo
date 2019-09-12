package com.cg.jpa.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java.util.List;

public class MainApp {

	public static void main(String[] args) {
	
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection=DriverManager.getConnection(url,"system","orcl11g");
			Statement statement=connection.createStatement();
			ResultSet rs=statement.executeQuery("select * from employee");
			List<Employee> employees=new ArrayList<>();
			while(rs.next()) {
				Employee employee=new Employee();
				//Here we can specify column name or column index both are valid
				employee.setId(rs.getInt(1));
				employee.setName(rs.getString(2));
				employee.setGender(rs.getString(3));
				employee.setAge(rs.getInt("age"));
				employee.setSalary(rs.getDouble("salary"));
				employees.add(employee);
			}
			
			for (Employee employee: employees ){
				System.out.println(employee);
				
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
