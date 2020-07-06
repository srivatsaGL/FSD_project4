
package com.learner.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Registration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="USER_ID")
	private int userId;
	@Column(name="USERNAME", unique=true, nullable = true)
	private String username;
	@Column(name="PASSWORD", nullable =true)
	private String password;
	@Column(name="EMAIL", unique= true, nullable =true)
	private String email;
	@Column(name="admin")
	private String is_admin;
	
	public Registration(){
		
	}
	public Registration(String username, String password, String email, String is_admin) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.is_admin=is_admin;
	}
	
	
	public String getIs_admin() {
		return is_admin;
	}
	public void setIs_admin(String is_admin) {
		this.is_admin = is_admin;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Registration [username=" + username + ", password=" + password + ", email=" + email + "]";
	}

}
