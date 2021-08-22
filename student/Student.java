package org.student;

import org.college.College;
import org.department.Departement;

public class Student extends Departement {

	public void studentName() {
		System.out.println("Student Name is  Vishal");
	}

	public void studentDepartment() {
		System.out.println("Student Department is  Computer Science");
	}

	public void studentId() {
		System.out.println("Student Id is  200");
	}

	public static void main(String[] args) {

		College col = new College();
		col.collegeName();
		col.collegeCode();
		col.collegeRank();

		Departement dep = new Departement();
		dep.departmentName();

		Student stud = new Student();
		stud.studentName();
		stud.studentDepartment();
		stud.studentId();
	}

}
