package server;
/**
 * @author Xinyu
 * @version 1.0
 * @since 2017-04-25
 *
 * Location contains information of one place including city, state and country.
 */
public class Location {
	private String city;
	private String state;
	private String country;
	
	/**
	 * Creates a new Location.
	 */
	public Location(){
	}
	
	/**
	 * Replaces the city of the calling Location object.
	 * @param city the new city to replace the current one
	 */
	public void setCity(String city){
		this.city = city;
	}
	
	/**
	 * Replaces the state of the calling Location object.
	 * @param state the new state to replace the current one
	 */
	public void setState(String state){
		this.state = state;
	}
	
	/**
	 * Replaces the country of the calling Location object.
	 * @param country the new country to replace the current one
	 */
	public void setCountry(String country){
		this.country = country;
	}
	
	/**
	 * Gives back the city of the calling Location object.
	 * @return the city of the Location
	 */
	public String getCity(){
		return this.city;
	}
	
	/**
	 * Gives back the state of the calling Location object.
	 * @return the state of the Location
	 */
	public String getState(){
		return this.state;
	}
	
	/**
	 * Gives back the country of the calling Location object.
	 * @return the country of the Location
	 */
	public String getCountry(){
		return this.country;
	}

}
