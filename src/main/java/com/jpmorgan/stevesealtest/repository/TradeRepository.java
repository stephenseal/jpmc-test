/**
 * 
 */
package com.jpmorgan.stevesealtest.repository;

import java.util.Map;
import org.apache.log4j.Logger;

import com.jpmorgan.stevesealtest.model.Trade;
import com.jpmorgan.stevesealtest.model.TradeKey;

/**
 * This represents a repository of all trades that are 
 * received during the running of the application
 * 
 * @author Steve Seal (U776998)
 *
 */
public class TradeRepository {
	
	/**
	 * LOGGER for this RestController...
	 */
	static Logger logger = Logger.getLogger(TradeRepository.class);

	/**
	 * Class variables
	 */
	private Map<TradeKey, Trade> processedTrades;
	private Map<TradeKey, Trade> tradesOnHold;

	/**
	 * 
	 */
	public TradeRepository() {
		// TODO Auto-generated constructor stub
	}

}
