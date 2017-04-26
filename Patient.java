package server;

import java.util.*;



public class Patient {
	private String id;
	private String firstName;
	private String lastName;
	private char sex;
	private String phoneNum;
	private Date dob;
	private String comments;
	private List<Appointment> appointments;
	private List<Result> results;
	
	public Patient(){
	}
	
	public void setID(String id){
		this.id = id;
	}
	
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName){
		this.lastName = lastName;
	}
	
	public void setSex(char sex){
		this.sex = sex;
	}
	
	public void setPhoneNum(String phoneNum){
		this.phoneNum = phoneNum;
	}
	
	public void setDob(Date dob){
		this.dob = dob;
	}
	
	public void setComments(String comments){
		this.comments = comments;
	}
	
	public void setAppointments(List<Appointment> appointments){
		this.appointments = appointments;
	}
	
	public void setResults(List<Result> results){
		this.results = results;
	}
	
	public String getID(){
		return this.id;
	}
	
	public String getFirstName(){
		return this.firstName;
	}
	
	public String getLastName(){
		return this.lastName;
	}
	
	public char getSex(){
		return this.sex;
	}
	
	public String getPhoneNum(){
		return this.phoneNum;
	}
	
	public Date getDob(){
		return this.dob;
	}
	
	public String getComments(){
		return this.comments;
	}
	
	public List<Appointment> getAppointments(){
		return this.appointments;
	}
	
	public List<Result> getResults(){
		return this.results;
	}
	
	
	

}
