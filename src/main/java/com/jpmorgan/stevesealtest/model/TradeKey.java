/**
 * 
 */
package com.jpmorgan.stevesealtest.model;

import org.apache.log4j.Logger;

/**
 * This represents the key of a trade that will be hanlded
 * by the application for positioning purposes
 * 
 * @author Steve Seal (U776998)
 *
 */
public class TradeKey {
	
	/**
	 * LOGGER for this RestController...
	 */
	static Logger logger = Logger.getLogger(TradeKey.class);

	/**
	 * Class variables
	 */
	private int tradeId;
	private int tradeVersion;

	/**
	 * Default constructor 
	 */
	public TradeKey() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Field level constructor
	 * 
	 * @param tradeId
	 * @param tradeVersion
	 */
	public TradeKey(int tradeId, int tradeVersion) {
		super();
		this.tradeId = tradeId;
		this.tradeVersion = tradeVersion;
	}

	/**
	 * @return the tradeId
	 */
	public int getTradeId() {
		return tradeId;
	}

	/**
	 * @param tradeId the tradeId to set
	 */
	public void setTradeId(int tradeId) {
		this.tradeId = tradeId;
	}

	/**
	 * @return the tradeVersion
	 */
	public int getTradeVersion() {
		return tradeVersion;
	}

	/**
	 * @param tradeVersion the tradeVersion to set
	 */
	public void setTradeVersion(int tradeVersion) {
		this.tradeVersion = tradeVersion;
	}



	

}
