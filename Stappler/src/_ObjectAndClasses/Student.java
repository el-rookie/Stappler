package _ObjectAndClasses;

import java.util.Date;

public class Student {
	protected String name;
	private String email;
	private int AM,etos;
	private Date birthday;
	
	boolean passed = false, commented = false, posted = false;
	
	public Student() {
		
	}
	
	public Student(String name, String email, int AM, int etos, Date bday) {			//Student constructor
		this.name = name;
		this.email = email;
		this.AM = AM;
		this.etos = etos;
		this.birthday = bday;
	}
	
	public void posted() {																//Sets the posted variable to true
		this.posted = true;
	}
	
	public boolean commented() {														// sets the commented variable to true
		this.commented = true;
		return commented;
	}
	
	public boolean passed() {															//sets the passed variable to true
		this.passed = true;
		return passed;
	}
	
	public void notificationserv(String notification) {									// Print notification
		System.out.println(notification);
	}
}
