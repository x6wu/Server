package server;

/**
 * @author Xinyu
 * @version 1.0
 * @since 2017-04-25
 * 
 * Represents a treatment given to patients.
 */
public class Treatment {
	private String name;
	private Time startDate;
	private Time endDate;
	
	
	/** 
	 * Creates a new Treatment.
	 */
	public Treatment(){
	}
	
	/**
	 * Changes the name of this Treatment.
	 * @param name This Treatment's new name.
	 */
	public void setName(String name){
		this.name = name;
	}
	
	public void setStartDate(Time start){
		this.startDate.setYear(start.getYear());
		this.startDate.setMonth(start.getMonth());
		this.startDate.setDay(start.getDay());
	}
	
	public void setEndDate(Time end){
		this.endDate.setYear(end.getYear());
		this.endDate.setMonth(end.getMonth());
		this.endDate.setDay(end.getDay());
	}
	
	/**
	 * Gets the name of this Treatment.
	 * @return this Treatment's name.
	 */
	public String getName(){
		return this.name;
	}
	
	public Time getStartDate(){
		return this.startDate;
	}
	
	public Time getEndDate(){
		return this.endDate;
	}

}
