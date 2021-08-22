package assignmentweek3.day1;

public class StudentsMethodOverload {

	public void getStudentsInfo(int a, String s1) {

		System.out.println("The Student ID is " + a);
		System.out.println("The Student name is " + s1);

	}

	public void getStudentsInfo(long ph, String s2) {

		System.out.println("The Student ID is " + ph);
		System.out.println("The Student name is " + s2);

	}

	public static void main(String[] args) {

		StudentsMethodOverload student = new StudentsMethodOverload();
		student.getStudentsInfo(1, "Vishal");
		student.getStudentsInfo(9879879870L, "example@gmail.com");
	}
}