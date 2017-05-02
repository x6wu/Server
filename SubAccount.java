
/**
 * @author Aymane (Ben) Chafik
 * @version 0
 * @since 4/20/17
 * 
 * SubAccount is a child of Account. It's used for doctors within
 * a specific hospital. The only extra information as of now is a
 * link back to the main-account it's linked to.
 */
public class SubAccount {
	MainAccount parentAccount;

	/**
	 * Gives back the main-account of the calling account object.	 * 
	 * @return the main-account linked to the account.
	 */
	public MainAccount getParentAccount( ) {
		return parentAccount;
	}

	/**
	 * Replaces the current main-account of the calling account object.
	 * @param parentAccount the new main-account to replace current one.
	 */
	public void setParentAccount(MainAccount parentAccount) {
		this.parentAccount = parentAccount;
	}	
}
