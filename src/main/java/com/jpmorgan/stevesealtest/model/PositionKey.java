/**
 * 
 */
package com.jpmorgan.stevesealtest.model;

import org.apache.log4j.Logger;

/**
 * This represents the key for each unique position
 * <br>
 * Each position correesponds to the aggregate of;
 * <ul>
 * 	<li>Account Number</li>
 * <li>Security ID</li>
 * </ul>
 * 
 * 
 * @author Steve Seal (U776998)
 *
 */
public class PositionKey {
	
	/**
	 * LOGGER for this RestController...
	 */
	static Logger logger = Logger.getLogger(PositionKey.class);

	/**
	 * Class variables
	 */
	private String securityId;
	private String accountNumber;

	/**
	 * Default constructor
	 */
	public PositionKey() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * @param securityId
	 * @param accountNumber
	 */
	public PositionKey(String securityId, String accountNumber) {
		super();
		this.securityId = securityId;
		this.accountNumber = accountNumber;
	}

	/**
	 * @return the securityId
	 */
	public String getSecurityId() {
		return securityId;
	}

	/**
	 * @param securityId the securityId to set
	 */
	public void setSecurityId(String securityId) {
		this.securityId = securityId;
	}

	/**
	 * @return the accountNumber
	 */
	public String getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

}
