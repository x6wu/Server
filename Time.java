package server;

/**
 * 
 * @author Xinyu
 * @version 1.0
 * @since 2017-04-25
 *
 * Represents a date 
 */

public class Time extends Date{
	private int hour;
	private int min;
	private int sec;

	/**
	 * Creates a new Time.
	 */
	public Time(){
	}

	public void setHour(int hour){
		this.hour = hour;
	}

	public void setMin(int min){
		this.min = min;
	}

	public void setSec(int sec){
		this.sec = sec;
	}

	public int getHour(){
		return this.hour;
	}

	public int getMin(){
		return this.min;
	}

	public int getSec(){
		return this.sec;
	}

}
