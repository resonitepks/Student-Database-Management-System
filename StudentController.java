package com.jsp.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Iterator;

import com.jsp.model.Student;

public class StudentController {
		
// create ArrayList
	ArrayList<Student> listOfStudent=  new ArrayList<Student>();
	public void SaveStudent(Student student) {
//		listOfStudent.add(student);
  System.out.println("Student Saved...");
		try {
			Class.forName("org.postgresql.Driver");
			//2

	Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbcmorningbatch", "postgres", "root");
	//3
	PreparedStatement pstmt =con.prepareStatement("insert into student values(?,?,?,?,?,?,?,?,?)");//======>compilation
	pstmt.setInt(1, student.getId());
	pstmt.setString(2, student.getName());
	pstmt.setString(3, student.getEmail());
	pstmt.setString(4, student.getPassword());
	pstmt.setString(5, student.getDob());
	pstmt.setString(6, student.getAddress());
	pstmt.setString(7, student.getGender());
	pstmt.setLong(8, student.getMob());
	pstmt.setString(9, student.getRelationshipShipStatus());
	//execute
	int  n =pstmt.executeUpdate();
	System.out.println(n);
	//
	con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
		
	public void findStudentById(int stuId) {
//		for (Student s : listOfStudent) {
//			if (s.getId()== stuId) {
//				System.out.println(s);
//				return s;
//				
//			}
//			
//		}
//		System.out.println("RECORD NOT FOUND");
//		return null;
		try {
			//1
			
			Class.forName("org.postgresql.Driver");
			//2

	Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbcmorningbatch", "postgres", "root");
	//3
	PreparedStatement pstmt =con.prepareStatement("select*from student where id=?");//======>compilation
	pstmt.setInt(1, stuId);
	// 
	ResultSet rs = pstmt.executeQuery();
	 boolean b= rs.next();
	 if (!b) {
		 System.out.println("record not found");
		
	} else {
		 System.out.println(rs.getInt(1)+" "+ rs.getString(2));

	}
	 con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	public void updateStudentById(int studI2, String newRelationShipStatus) {
//		for (Student s : listOfStudent) {
//			if (s.getId()== studI2) {
//				s.setRelationshipShipStatus(newRelationShipStatus);
//				System.out.println(s);
//				return;
//			}
			
//	}
//	System.out.println("RECORD NOT FOUND");
		try {
//1
			Class.forName("org.postgresql.Driver");
			//2

	Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbcmorningbatch", "postgres", "root");
	//3
	PreparedStatement pstmt =con.prepareStatement("update student set relationShipStatus=?  where id=?");//======>compilation
	//
	pstmt.setString(1, newRelationShipStatus);
	pstmt.setInt(2, studI2);
	//
	int n= pstmt.executeUpdate();
	if (n!=0) {
		System.out.println(n+ "record updated");
		
	} else {
      System.out.println("record not updated");
      con.close();
	}
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
}
	
	public void deleteStudentById(int studI3) {
//		Student s = findStudentById (studI3);
//		if (s!=null) {
//			boolean b= listOfStudent.remove(s);
//			if (b==true) {
//				System.out.println("RECORD NOT FOUND");
//			}
			try {
				//1
				Class.forName("org.postgresql.Driver");
				//2

		Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbcmorningbatch", "postgres", "root");
		//3
		PreparedStatement pstmt =con.prepareStatement("delete from student where id=?");//======>compilation
		//
		pstmt.setInt(1, studI3);
		//
		int n= pstmt.executeUpdate();
		if (n!=0) {
			System.out.println(n+ "record deleted");
			
		} else {
			System.out.println("record not found");
			con.close();
}
			} catch (Exception e) {
				// TODO: handle exception
			}
		
	}
		
		
	public void findAll() {
//	for (Student s : listOfStudent) {
//		System.out.println(s);
//		
//	}
//		
		try {
			//1
			Class.forName("org.postgresql.Driver");
			//2

	Connection con=DriverManager.getConnection("jdbc:postgresql://localhost:5432/jdbcmorningbatch", "postgres", "root");
	//3
	PreparedStatement pstmt =con.prepareStatement("select * from student");//======>compilation
	//
	 ResultSet  rs=  pstmt.executeQuery();
	 boolean b = rs.next();
	 if (!b) {
		 System.out.println("record not present");
		
	} else {
		do {
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		} while (b= rs.next());

	}
	 con.close();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	}
		
		
	
	