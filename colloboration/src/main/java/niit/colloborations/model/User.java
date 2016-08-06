package niit.colloborations.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int user_id;
	@Size(min=3, max=30)
	@Column(unique=true)
	private String user_name;
     @Email @NotEmpty(message="email cannot be empty")
    private String email;
    @NotEmpty
     private String name;
    
    public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@NotEmpty (message="location cannot be empty")
	private String location;
    public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@NotEmpty (message="password cannot be empty")
    private String password;
	
	

}
