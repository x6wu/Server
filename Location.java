package server;

public class Location {
	private String city;
	private String state;
	private String country;
	
	public Location(){
	}
	
	public void setCity(String city){
		this.city = city;
	}
	
	public void setState(String state){
		this.state = state;
	}
	
	public void setCountry(String country){
		this.country = country;
	}
	
	public String getCity(){
		return this.city;
	}
	
	public String getState(){
		return this.state;
	}
	
	public String getCountry(){
		return this.country;
	}

}
