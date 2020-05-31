package _ObjectAndClasses;

import java.util.Date;

public class Post extends Student {
	private String title,post_content;
	private int post_id;
	private Date post_date;
	
	public Post(String title, String content, int id, Date date) {  					//Post constructor
		this.title = title;
		this.post_content = content;
		this.post_id = id;
		this.post_date = new Date(System.currentTimeMillis());
	}
	
	public String getAuthor() {															//return the name of the author
		return super.name;
	}
}
