package com.studentuser.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.studentuser.model.Student;


public class StudentDAO {

	public int regesterStudent(Student student)throws ClassNotFoundException{
		
		String Insert_User_SQl="Insert into student"+
		"(id,first_name,last_name,username,password,branch,section,contact,email)values"+
				"(?,?,?,?,?,?,?,?,?);";
		int result = 0;
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		try (Connection connection = 
				DriverManager.
				getConnection
			("jdbc:mysql://localhost:3306/student_regestration?useSSL=false","root","farooq");
				PreparedStatement preparedStatement=connection.prepareStatement(Insert_User_SQl)){
			preparedStatement.setInt(1, 1);
			preparedStatement.setString(2, student.getFirstname());
			preparedStatement.setString(3, student.getLastname());
			preparedStatement.setString(4, student.getBranch());
			preparedStatement.setString(5, student.getEmail());
			preparedStatement.setString(6, student.getContact());
			preparedStatement.setString(7, student.getPassword());
			preparedStatement.setString(8, student.getUsername());
			preparedStatement.setString(9, student.getSection());
			
			System.out.println(preparedStatement);
			result=preparedStatement.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e);
		}
		return  result ;
		
	}
}
