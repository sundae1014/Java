package test7.sub4;

public abstract class Comment implements Commentable{
	protected int no;
	protected String content;
	
	public Comment(int no, String content) {
		this.no = no;
		this.content = content;
	}
	
	public int getNo() {
		return no;
	}
	
	public String getContent() {
		return content;
	}	
}
