package doubt1;

import java.util.LinkedList;
import java.util.Scanner;

class Student {
	int stdid;
	String stdname;
	String stdmail;

	public Student(int stdid, String stdname, String stdmail) {
		super();
		this.stdid = stdid;
		this.stdname = stdname;
		this.stdmail = stdmail;
	}

	@Override
	public String toString() {
		return "Student [stdid=" + stdid + ", stdname=" + stdname + ", stdmail=" + stdmail + "]";
	}

	static void mul(LinkedList l1) {
		System.out.println("the values are-->\n");
		for (Object obj : l1) {
			System.out.println(obj);
		}
	}
}

public class StudentDetails {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Total Count of Students");
		int n = sc.nextInt();
		int i = 1;
		boolean jo = true;
		LinkedList l1 = new LinkedList();
		// if (jo) {
		while (i <= n) {
			System.out.println("Enter the User Inputs");
			switch (sc.nextInt()) {
			case 1: {
				System.out.println("Enter the Student details\n");
				System.out.println("Enter the stdid");
				int id = sc.nextInt();
				System.out.println("Enter the name");
				String name = sc.next();
				System.out.println("Enter the mail");
				String mail = sc.next();
				l1.add(new Student(id, name, mail));
				System.out.println("Done...! Entered all the values");
				i++;
			}
				break;
			case 2: {
				System.out.println("Print the values");
				for (Object obj : l1) {
					System.out.println(obj);
				}

			}
				break;
			case 3: {
				jo = false;
				break;
			}
			default: {
				System.out.println("Enter the valid inputs");
				break;
			}
			}// switch close
				// break;
			if (jo == false)
				break;

		} // while close
		System.out.println("You cant enter more values\n");
		Student.mul(l1);

	}

}
