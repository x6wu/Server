package server;

public class Time {
	private int year;
	private int month;
	private int day;

	public Time(){
	}

	public void setYear(int year){
		this.year = year;
	}

	public void setMonth(int month){
		this.month = month;
	}

	public void setDay(int day){
		this.day = day;
	}

	/*
	public void setTime(Time time){
		this.year = time.getYear();
		this.month = time.getMonth();
		this.day = time.getDay();

	}
	*/

	public int getYear(){
		return this.year;
	}

	public int getMonth(){
		return this.month;
	}

	public int getDay(){
		return this.day;
	}

}
