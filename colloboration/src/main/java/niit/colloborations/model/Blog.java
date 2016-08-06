package niit.colloborations.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Blog {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int blog_id;
	@NotEmpty(message="name cannot be blank")
	private String user_name;
	
	@NotEmpty(message="blog name cannot be blank")
	private String blog_name;
	@NotEmpty(message="content cannot be blank")
	private String content;
	
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	private Date creationDate;
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getBlog_id() {
	return blog_id;
	}
	public void setBlog_id(int blog_id) {
	this.blog_id = blog_id;
	}
	public String getBlog_name() {
		return blog_name;
	}
	public void setBlog_name(String blog_name) {
		this.blog_name = blog_name;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}


}
