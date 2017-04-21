import java.util.List;

/**
 * @author Aymane (Ben) Chafik
 * @version 0
 * @date 4/20/17
 * 
 * MainAccount is a child of Account. It's used to give hospitals
 * one giant account that sub-accounts can link to. Contains the name of the
 * hospital associated with the object, information about which patient 
 * are register to a specific hospital and the sub-accounts linked to it.
 */
public class MainAccount extends Account {
	private List<Long> patients;
	private List<SubAccount> subAcc;
	private String hospital;
	
	/**
	 * Gives back the patients of the calling account object.
	 * @return the list of patients within the account.
	 */
	public List<Long> getPatients( ) {
		return patients;
	}
	
	/**
	 * Replaces the current patients list of the calling account object.
	 * @param patients the new patients list to replace the current one.
	 */
	public void setPatients( List<Long> patients ) {
		this.patients = patients;
	}
	
	/**
	 * Gives back the sub-accounts of the calling account object.
	 * @return the sub-accounts linked to the account.
	 */
	public List<SubAccount> getSubAcc( ) {
		return subAcc;
	}
	
	/**
	 * Replaces the current sub-accounts list of the calling account object.
	 * @param subAcc the new sub-accounts list to replace the current one.
	 */
	public void setSubAcc( List<SubAccount> subAcc ) {
		this.subAcc = subAcc;
	}
	
	/** 
	 * Gives back the hospital of the calling account object.
	 * @return the name of the hospital of the account.
	 */
	public String getHospital( ) {
		return hospital;
	}

	/**
	 * Replaces the current hospital of the calling account object.
	 * @param hospital the new hospital name to replace the current one.
	 */
	public void setHospital( String hospital ) {
		this.hospital = hospital;
	}
		
}
