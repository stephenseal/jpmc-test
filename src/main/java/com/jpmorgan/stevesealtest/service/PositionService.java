/**
 * 
 */
package com.jpmorgan.stevesealtest.service;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;

import com.jpmorgan.stevesealtest.model.Position;
import com.jpmorgan.stevesealtest.model.PositionKey;
import com.jpmorgan.stevesealtest.model.Trade;

/**
 * This is the services that controls all current positions
 * known to the enterprise.
 * 
 * @author Steve Seal (U776998)
 *
 */
public class PositionService {
	
	/**
	 * LOGGER for this RestController...
	 */
	static Logger logger = Logger.getLogger(PositionService.class);

	/**
	 * Class variables
	 */
	private Map<PositionKey, Position> positionMap;
	
	/**
	 * 
	 */
	public PositionService() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * Add a trade to a new or existing position (based upon
	 * Account Number/Security information
	 * 
	 * @param trade
	 */
	public void addTrade(Trade trade) {
		PositionKey tmpPositionKey = new PositionKey(trade.getSecurityId(), trade.getAccountNumber());
		Iterator<PositionKey> iter = positionMap.keySet().iterator();
		while(iter.hasNext()) {
			PositionKey currentPositionKey = iter.next();
			
		}

	}

	/**
	 * Retrieves all the current positions when called.
	 * 
	 * @return
	 */
	public List<Position> getPositions() {
		return (List<Position>) positionMap.values();
	}

}
