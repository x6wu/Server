package server;

public class Result {
	private Time time;
	private String report;
	private Treatment currTreatment;
	
	public Result(){
	}
	
	public void setTime(Time time){
		this.time.setHour(time.getHour());
		this.time.setMin(time.getMin());
		this.time.setSec(time.getSec());
		this.time.setDay(time.getDay());
		this.time.setMonth(time.getMonth());
		this.time.setYear(time.getYear());
	}
	
	public void setReport(String report){
		this.report = report;
	}
	
	public void setCurrTreatment(Treatment treatment){
		this.currTreatment.setName(treatment.getName());
		this.currTreatment.setStartDate(treatment.getStartDate());
		this.currTreatment.setEndDate(treatment.getEndDate());
	}
	
	public Time getTime(){
		return this.time;
	}
	
	public String getReport(){
		return this.report;
	}
	
	public Treatment getTreatment(){
		return this.currTreatment;
	}

}
