
/**
 * 
 * @author Xinyu
 * @version 1.0
 * @since 2017-04-25
 *
 * Time is a child of Date. It contains more information including the time of 
 * day. It is used as a timestamp.
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

	/**
	 * Replaces the current hour of the calling Time object.
	 * @param hour the new hour to replace the current one
	 */
	public void setHour(int hour){
		this.hour = hour;
	}

	/**
	 * Replaces the current min of the calling Time object.
	 * @param min the new min to replace the current one
	 */
	public void setMin(int min){
		this.min = min;
	}

	/**
	 * Replaces the current sec of the calling Time object.
	 * @param sec the new sec to replace the current one
	 */
	public void setSec(int sec){
		this.sec = sec;
	}

	/**
	 * Gives back the hour of the calling Time object.
	 * @return the hour of the Time
	 */
	public int getHour(){
		return this.hour;
	}

	/**
	 * Gives back min of the calling Time object. 
	 * @return the min of the Time
	 */
	public int getMin(){
		return this.min;
	}

	/**
	 * Gives back sec of the calling Time object.
	 * @return the sec of the Time
	 */
	public int getSec(){
		return this.sec;
	}

}
