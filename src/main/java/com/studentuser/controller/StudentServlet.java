package com.studentuser.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.studentuser.dao.StudentDAO;
import com.studentuser.model.Student;

@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       private StudentDAO  studentdao= new  StudentDAO();
    public StudentServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, 
			HttpServletResponse response) throws ServletException, IOException {
	
	RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/views/Student_register.jsp");
	requestDispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

	String firstname= request.getParameter("firstname");
	String lastname= request.getParameter("lastname");
	String email= request.getParameter("email");
	String contact = request.getParameter("contact");
	String username= request.getParameter("username");
	String password= request.getParameter("password");
	String branch= request.getParameter("branch");
	String section= request.getParameter("section");
	
	Student student = new Student();
	student.setFirstname(firstname);
	student.setLastname(lastname);;
	student.setBranch(branch);;
	student.setEmail(email);;
	student.setContact(contact);;
	student.setSection(section);;
	student.setUsername(username);;
	student.setPassword(password);;
	try {
		studentdao.regesterStudent(student);
	} catch (ClassNotFoundException e) {
		e.printStackTrace();
	}
	//response.sendRedirect("");
	RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/views/Student_details.jsp");
	requestDispatcher.forward(request, response);
	}
//http://localhost:8080/student_Regestration_Application/StudentServlet
}
