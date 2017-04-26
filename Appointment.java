
/**
 * @author Xinyu
 * @version 1.0
 * @since 2017-04-25
 * 
 * Appointment contains information about patient's appointment including
 * appointment time and doctor.
 */
public class Appointment {
	private Time time;
	private String doctor;
	
	/**
	 * Creates a new Appointment.
	 */
	public Appointment(){
	}
	
	/**
	 * Replaces the current time of the calling Appointment object.
	 * @param time the new time to replace the current one
	 */
	public void setTime(Time time){
		this.time = time;
	}
	

	/**
	 * Replaces the current doctor of the calling Appointment object.
	 * @param doctor the new doctor to replace the current one
	 */
	public void setDoctor(String doctor){
		this.doctor = doctor;
	}
	
	/**
	 * Gives back the time of the calling Appointment object.
	 * @return the time of the Appointment
	 */
	public Time getTime(){
		return this.time;
	}
	
	/**
	 * Gives back the doctor of the calling Appointment object.
	 * @return the doctor of the Appointment
	 */
	public String getDoctor(){
		return this.doctor;
	}
	
	
}
