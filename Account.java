
/**
 * @author Aymane (Ben) Chafik
 * @version 0
 * @since 4/20/17
 * 
 * Account is the abstract class which contains
 * everything an object representing an account needs
 * such as login and a password.
 */
public abstract class Account {
	long id;
	String login;
	String password_a;
	String password_b;
	String email;
	
	/**
	 * Gives back the id of the calling account object.
	 * @return the id of the account
	 */
	public long getId( ) {
		return id;
	}
	
	/**
	 * Replaces the current id of the calling account object.
	 * @param id the new id to replace the current one.
	 */
	public void setId( long id ) {
		this.id = id;
	}
	
	/**
	 * Gives back the login of the calling account object.
	 * @return the login of the account
	 */
	public String getLogin( ) {
		return login;
	}

	/**
	 * Replaces the current login of the calling account object.
	 * @param login the new login to replace the current one.
	 */
	public void setLogin( String login ) {
		this.login = login;
	}

	/**
	 * Gives back the initial password of the calling account object.
	 * @return the initial password of the account
	 */
	public String getPassword_a( ) {
		return password_a;
	}

	/**
	 * Replaces the current initial password of the calling account object.
	 * @param password_a the new initial password to replace the current one.
	 */
	public void setPassword_a( String password_a ) {
		this.password_a = password_a;
	}

	/** 
	 * Gives back the secondary password of the calling account object.
	 * @return the secondary password of the account
	 */
	public String getPassword_b( ) {
		return password_b;
	}

	/**
	 * Replaces the current secondary password of the calling account object.
	 * @param password_b the new secondary password to replace the current one.
	 */
	public void setPassword_b( String password_b ) {
		this.password_b = password_b;
	}

	/**
	 * Gives back the email of the calling account object.
	 * @return the email of the account.
	 */
	public String getEmail( ) {
		return email;
	}

	/**
	 * Replaces the current email of the calling account object.
	 * @param email the new email to replace the current one.
	 */
	public void setEmail( String email ) {
		this.email = email;
	}
}
