package server;
import java.util.*;
/**
 * @author Aymane (Ben) Chafik - Xinyu
 * @version 0
 * @since 5/2/2017
 *
 * The patient class holds basic information about a single patient.
 * information includes full name, sex, phone number, date of birth,
 * list of appointments and list of results. It also includes comments
 * written by staff.
 */
public class Patient {
	private String id;
	private String firstName;
	private String lastName;
	private char sex;
	private String phoneNum;
	private Date dob;
	private String comments;
	private List<Appointment> appointments;
	private List<Result> results;


	/**
	 * Replaces the current id of the calling Patient object.
	 * @param id the new id to replace the current one.
	 */
	public void setID(String id){
		this.id = id;
	}

	/**
	 * Replaces the current firstName of the calling Patient object.
	 * @param firstName the new first name to replace the current one.
	 */
	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	/**
	 * Replaces the current lastName of the calling Patient object.
	 * @param lastName the new last name to replace the current one.
	 */
	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	/**
	 * Replaces the current sex of the calling Patient object.
	 * @param sex the new sex to replace the current one.
	 */
	public void setSex(char sex){
		this.sex = sex;
	}

	/**
	 * Replaces the current phoneNum of the calling Patient object.
	 * @param phoneNum the new phone number to replace the current one.
	 */
	public void setPhoneNum(String phoneNum){
		this.phoneNum = phoneNum;
	}

	/**
	 * Replaces the current dob of the calling Patient object.
	 * @param dob the new date of birth to replace the current one.
	 */
	public void setDob(Date dob){
		this.dob = dob;
	}

	/**
	 * Replaces the current comments of the calling Patient object.
	 * @param comments the new comments to replace the current one.
	 */
	public void setComments(String comments){
		this.comments = comments;
	}

	/**
	 * Replaces the current appointments of the calling Patient object.
	 * @param appointments the new appointment list to replace the current one.
	 */
	public void setAppointments(List<Appointment> appointments){
		this.appointments = appointments;
	}

	/**
	 * Replaces the current results of the calling Patient object.
	 * @param results the new result list to replace the current one.
	 */
	public void setResults(List<Result> results){
		this.results = results;
	}

	/**
	 * Gives back the id of the calling Patient object.
	 * @return id of the patient
	 */
	public String getID(){
		return this.id;
	}

	/**
	 * Gives back the firstName of the calling Patient object.
	 * @return the first name of the patient
	 */
	public String getFirstName(){
		return this.firstName;
	}

	/**
	 * Gives back the lastName of the calling Patient object.
	 * @return the last name of the patient
	 */
	public String getLastName(){
		return this.lastName;
	}

	/**
	 * Gives back the sex of the calling Patient object.
	 * @return the sex of the patient
	 */
	public char getSex(){
		return this.sex;
	}

	/**
	 * Gives back the phoneNum of the calling Patient object.
	 * @return the phone number of the patient
	 */
	public String getPhoneNum(){
		return this.phoneNum;
	}

	/**
	 * Gives back the dob of the calling Patient object.
	 * @return the date of birth of the patient
	 */
	public Date getDob(){
		return this.dob;
	}

	/**
	 * Gives back the comments of the calling Patient object.
	 * @return the comments on the patient
	 */
	public String getComments(){
		return this.comments;
	}

	/**
	 * Gives back the appointments of the calling Patient object.
	 * @return the appointment list of the patient
	 */
	public List<Appointment> getAppointments(){
		return this.appointments;
	}

	/**
	 * Gives back the results of the calling Patient object.
	 * @return the result list of the patient
	 */
	public List<Result> getResults(){
		return this.results;
	}




}
