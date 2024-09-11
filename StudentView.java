package com.jsp.view;
import java.util.Scanner;

import com.jsp.controller.StudentController;
import com.jsp.model.Student;

public class StudentView {
	static Scanner sc =new Scanner (System.in);
	private static Object studI2;
	public static void main(String[] args) {
		System.out.println("WELCOME TO SMS APP\n\n");
		StudentController Controller =new StudentController();
		
		while (true) {
			System.out.println("ENTER THE CHOICE");
			System.out.println("1.Save student");
			System.out.println("2.find the student by id");
			System.out.println("3.update student by id");
			System.out.println("4.delete student by id");
			System.out.println("5.find all");
			System.out.println("6.exit");
//			System.out.println(" THANK YOU");
			
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				Student s = getstudentObject();
				Controller.SaveStudent(s);
				break;
			case 2:
				System.out.println("enter student id");
				int stuId = sc.nextInt();//101
				Controller.findStudentById(stuId);
				break;
			case 3:
				System.out.println("enter student id");
				int stuId2= sc.nextInt();
				System.out.println("enter new Relationship Status");
				sc.nextLine();
				String newRelationShipStatus=sc.nextLine();
				Controller.updateStudentById(stuId2, newRelationShipStatus);
				break;
			case 4:
				System.out.println("enter student id");
				int stuId3=sc.nextInt();
				Controller.deleteStudentById(stuId3);
				System.out.println(4);
				break;
			case 5:
				Controller.findAll();
				break;
			case 6:
				System.out.println("THANK YOU");
				break;

			default:
				System.out.println("invalid option");
				break;
			}
		}

	}
	private static Student getstudentObject() {
		System.out.println("enter student id");
		int id = sc.nextInt();
		System.out.println("enter student name");
		sc.nextLine();
		String name =sc.nextLine();
		System.out.println("enter student email");
		String email= sc.nextLine();
		System.out.println("enter student password");
		String password =sc.nextLine();
		System.out.println("enter student dob");
		String dob =sc.nextLine();
		System.out.println("enter student address");
		String address=sc.nextLine();
		System.out.println("enter student gender");
		String gender =sc.nextLine();
		System.out.println("enter student mob");
		long mob = sc.nextLong();
		System.out.println("enter student relationshipstatus");
		sc.nextLine();//
		String relationshipstatus = sc.nextLine();
		// create Student object
	     Student s =new Student();
	     s.setId(id);
	     s.setName(name);
	     s.setEmail(email);
	     s.setPassword(password);
	     s.setDob(dob);
	     s.setAddress(address);
	     s.setGender(gender);
	     s.setMob(mob);
	     s.setRelationshipShipStatus(relationshipstatus);
	
	     return s;
		
	}

		}