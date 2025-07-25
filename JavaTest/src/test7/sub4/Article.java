package test7.sub4;

import java.util.ArrayList;
import java.util.List;

public abstract class Article implements Commentable {
	protected String no;
	protected String title;
	protected String content;
	protected User user;
	protected List<Comment> comment = new ArrayList<Comment>();
	
	public Article(String no, String title, String content, User user) {
		this.no = no;
		this.title = title;
		this.content = content;
		this.user = user;
	}
	
	public String getNo() {
		return no;
	}

	public String getTitle() {
		return title;
	}

	public String getContent() {
		return content;
	}

	public User getUser() {
		return user;
	}

	public void addComment(Comment comment) {
		
	}
	
	public List<Comment> getComments(){
		
		return comment;		
	}
	
}
