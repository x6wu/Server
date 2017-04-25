package server;

public class Appointment {
	private Time date = new Time();
	private String doctor;
	
	public Appointment(){
	}
	
	public void setDate(Time date){
		this.date.setDay(date.getDay());
		this.date.setMonth(date.getMonth());
		this.date.setYear(date.getYear());
	}
	
	public void setDoctor(String doctor){
		this.doctor = doctor;
	}
	
	public Time getDate(){
		return this.date;
	}
	
	public String getDoctor(){
		return this.doctor;
	}
	
	

}
