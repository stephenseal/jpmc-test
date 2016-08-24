/**
 * 
 */
package com.jpmorgan.stevesealtest.model;

import org.apache.log4j.Logger;

/**
 * This is the concrete Trade object that represents a trade event
 * occuring
 * 
 * @author Steve Seal (U776998)
 *
 */
public class Trade {
	
	/**
	 * LOGGER for this RestController...
	 */
	static Logger logger = Logger.getLogger(Trade.class);
	
	/**
	 * Class variables
	 */
	private TradeKey tradeKey;
	private String securityId;
	private int quantity;
	private String direction;
	private String accountNumber;
	private String operation;
	
	

	/**
	 * Default constructor
	 */
	public Trade() {
		// TODO Auto-generated constructor stub
	}



	/**
	 * Field level constructor
	 * 
	 * @param tradeKey
	 * @param securityId
	 * @param quantity
	 * @param direction
	 * @param accountNumber
	 * @param operation
	 */
	public Trade(TradeKey tradeKey, String securityId, int quantity, String direction, String accountNumber,
			String operation) {
		super();
		this.tradeKey = tradeKey;
		this.securityId = securityId;
		this.quantity = quantity;
		this.direction = direction;
		this.accountNumber = accountNumber;
		this.operation = operation;
	}



	/**
	 * @return the tradeKey
	 */
	public TradeKey getTradeKey() {
		return tradeKey;
	}



	/**
	 * @param tradeKey the tradeKey to set
	 */
	public void setTradeKey(TradeKey tradeKey) {
		this.tradeKey = tradeKey;
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
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}



	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	/**
	 * @return the direction
	 */
	public String getDirection() {
		return direction;
	}



	/**
	 * @param direction the direction to set
	 */
	public void setDirection(String direction) {
		this.direction = direction;
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



	/**
	 * @return the operation
	 */
	public String getOperation() {
		return operation;
	}



	/**
	 * @param operation the operation to set
	 */
	public void setOperation(String operation) {
		this.operation = operation;
	}

	

}
