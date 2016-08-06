package niit.colloborations.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class BlogBody {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private int blogid;
	
	@Column(unique=true)
	private String btitle;
	private String bname;
	private String user_name;
	private String content;
	private String comments;

	public String getComments() {
		return comments;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public int getBlogid() {
		return blogid;
	}
	public void setBlogid(int blogid) {
		this.blogid = blogid;
	}
	public String getBtitle() {
		return btitle;
	}
	public void setBtitle(String btitle) {
		this.btitle = btitle;
	}
	public String getBname() {
		return bname;
	}
	public void setBname(String bname) {
		this.bname = bname;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String username) {
		this.user_name = username;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
		
	
}
