package data.models;

import java.util.List;

public class Students {
	private String name;
	private int id;
	private String email;
	private String password;
	private String phoneNumber;
	private List<Courses> courses;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
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
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public List<Courses> getCourses() {
		return courses;
	}
	
	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}
	
	@Override
	public String toString() {
		return "Students{" + "name ==>'" + getName() + "\n" +
				            ", id ==> " + getId() + "\n" +
				            ", email ==> '" + getEmail() + "\n" +
				            ", password==> '" + getPassword() + "\n" +
				            ", phoneNumber==> '" + getPhoneNumber() + "\n" +
				            ", courses ==> " + getCourses() + "\n" +
							"}";
	}
}
