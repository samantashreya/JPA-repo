package com.cg.jpa.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class MainUI {

	public static void main(String[] args) {
	
		String url="jdbc:oracle:thin:@localhost:1521:xe";
		Scanner scanner=new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection connection=DriverManager.getConnection(url,"system","orcl11g");
			Employee employee=new Employee();
			System.out.println("Enter ID");
			employee.setId(Integer.parseInt(scanner.nextLine()));
			System.out.println("Enter Name");
			employee.setName(scanner.nextLine());
			System.out.println("Enter Gender");
			employee.setGender(scanner.nextLine());
			System.out.println("Enter Age");
			employee.setAge(Integer.parseInt(scanner.nextLine()));
			System.out.println("Enter Salary");
			employee.setSalary(Double.parseDouble(scanner.nextLine()));
			
			PreparedStatement pstatement=connection.prepareStatement("insert into employee values(?,?,?,?,?)");
			pstatement.setInt(1, employee.getId());
			pstatement.setString(2, employee.getName());
			pstatement.setString(3, employee.getGender());
			pstatement.setInt(4, employee.getAge());
			pstatement.setDouble(5, employee.getSalary());
		
			int result=pstatement.executeUpdate();
			System.out.println(result + "row(s) inserted into database");
			scanner.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
