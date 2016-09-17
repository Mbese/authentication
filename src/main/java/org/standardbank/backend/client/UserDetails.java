package org.standardbank.backend.client;

public class UserDetails {
	private String username;
	private String password;
	private String employeeNumber;
	private String jobTitle;
	private String firstName;
	private String lastName;
	
	public UserDetails(){
		
	}
	
	public UserDetails(String username, String password){
		this.username = username;
		this.password = password;
	}
	
	public UserDetails(String username, String password, String employeeNumber, String jobTitle, String firstName, String lastName){
		this.username = username;
		this.password = password;
		this.employeeNumber = employeeNumber;
		this.jobTitle = jobTitle;
		this.firstName = firstName;
		this.lastName = lastName;
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

	public String getEmployeeNumber(){
		return employeeNumber;
	}
	
	public void setEmployeeNumber(String employeeNumber){
		this.employeeNumber = employeeNumber;
	}
	
	public String getJobTitle(){
		return jobTitle;
	}
	
	public void setJobTitle(String jobTitle){
		this.jobTitle = jobTitle;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public String getLastname(){
		return lastName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}

}
