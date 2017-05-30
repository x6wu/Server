package server;

/**
 * @author Xinyu
 * @version 1.0
 * @since 2017-04-25
 * 
 * Result contains information about a test result including the current
 * treatment the patient is on, the time when result comes in and a report.
 */
public class Result {
	private Time time;
	private String report;
	private Treatment currTreatment;
	
	
	/**
	 * Creates a new Result
	 */
	public Result(){
	}
	
	/**
	 * 
	 * @param time
	 */
	public void setTime(Time time){
		this.time = time;
	}
	
	/**
	 * @param report
	 */
	public void setReport(String report){
		this.report = report;
	}
	
	/**
	 * @param treatment
	 */
	public void setCurrTreatment(Treatment treatment){
		this.currTreatment = treatment;
	}
	
	/**
	 * @return
	 */
	public Time getTime(){
		return this.time;
	}
	
	/**
	 * @return
	 */
	public String getReport(){
		return this.report;
	}
	
	/**
	 * @return
	 */
	public Treatment getTreatment(){
		return this.currTreatment;
	}

}
