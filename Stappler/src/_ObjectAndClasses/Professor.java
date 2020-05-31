package _ObjectAndClasses;

public class Professor {
	private String p_name,p_desc,email;
	private int p_AM;
	
	private boolean has_posted,has_commented;
	private String []lessons_teached;
	private int i = 0;
	
	public Professor() {
		
	}
	
	public Professor(String name, String description, String email, int AM) {   //Professor constructor
		this.p_name = name;
		this.p_desc = description;
		this.email = email;
		this.p_AM = AM;
	}
	
	public void posted() {                                                     //Set has_posted to True
		this.has_posted = true;
	}
	
	public void commented() {											   //Set has_commented to True
		this.has_commented = true;
	}
	
	public void notificationserv(String Notification) {						//Print the notification
		System.out.println(Notification);
	}
	
	public void teached(String lesson) {									//Set the lessons that a teacher is teaching
		this.lessons_teached[i] = lesson;
		this.i++;
	}

}
