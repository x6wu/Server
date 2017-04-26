
/**
 * @author Xinyu
 * @version 1.0
 * @since 2017-04-25
 *
 * Date is the date of one day.
 */
public class Date {
	private int year;
	private int month;
	private int day;

	/**
	 * Creates a new Date.
	 */
	public Date(){
	}

	/**
	 * Replaces the year of the calling Date object.
	 * @param year the new year to replace the current one
	 */
	public void setYear(int year){
		this.year = year;
	}

	/**
	 * Replaces the month of the calling Date object.
	 * @param month the new month to replace the current one
	 */
	public void setMonth(int month){
		this.month = month;
	}

	/**
	 * Replaces the day of the calling Date object.
	 * @param day the new day to replace the current one
	 */
	public void setDay(int day){
		this.day = day;
	}

	/**
	 * Gives back the year of the calling Date object.
	 * @return the year of the Date
	 */
	public int getYear(){
		return this.year;
	}

	/**
	 * Gives back the month of the calling Date object.
	 * @return the month of the Date
	 */
	public int getMonth(){
		return this.month;
	}

	/**
	 * Gives back the day of the calling Date object.
	 * @return the day of the Date
	 */
	public int getDay(){
		return this.day;
	}

}
