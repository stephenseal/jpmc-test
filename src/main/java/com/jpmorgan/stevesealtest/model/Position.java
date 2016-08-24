/**
 * 
 */
package com.jpmorgan.stevesealtest.model;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import org.apache.log4j.Logger;

/**
 * This represents the position which an aggregation of the 
 * quantity across account and security  
 * 
 * @author Steve Seal (U776998)
 *
 */
public class Position {
	
	/**
	 * LOGGER for this RestController...
	 */
	static Logger logger = Logger.getLogger(Position.class);
	
	/**
	 * Class variables
	 */
	private PositionKey positionKey;
	private List<Trade> positionTrades;

	/**
	 * Default constructor 
	 */
	public Position() {
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Constructor that represents the uniqueness of 
	 * a position (account number and security)
	 * 
	 * @param positionKey
	 */
	public Position(PositionKey positionKey) {
		super();
		this.positionKey = positionKey;
		this.positionTrades = new ArrayList<Trade>();
	}

	/**
	 * @return the positionTrades
	 */
	public List<Trade> getPositionTrades() {
		logger.info("positionTrades has : " + positionTrades.size() + " Trades");
		return positionTrades;
	}

	/**
	 * @param positionTrades the positionTrades to set
	 */
	public void setPositionTrades(List<Trade> positionTrades) {
		this.positionTrades = positionTrades;
	}
	

	/**
	 * Adds a trade to the overall position
	 * 
	 * @param trade
	 */
	public void addTrade(Trade trade) {
		logger.info("Received a trade to add : " + trade.getDirection() + "," + trade.getOperation());
		TradeKey incomingTradeKey = trade.getTradeKey();
		if(trade.getOperation() == "NEW") {
			logger.info("Adding trade to positionTrades... it is NEW");
			positionTrades.add(trade);
		} else if(trade.getOperation() == "AMEND" || trade.getOperation() == "CANCEL") {
			Iterator<Trade> tradeIter = positionTrades.iterator();
			while(tradeIter.hasNext()) {
				Trade tmpTrade = tradeIter.next();
				TradeKey tmpTradeKey = tmpTrade.getTradeKey();
				if(tmpTradeKey.getTradeId() == incomingTradeKey.getTradeId()) {
					removeTrade(tmpTrade);
					positionTrades.add(trade);
				}
			}
		}
	}
	
	/**
	 * Removes a trade from the position
	 * 
	 * @param trade
	 */
	public void removeTrade(Trade trade) {
		positionTrades.remove(trade);
	}
	
	/**
	 * Returns the current quantity of this position
	 * 
	 * @return
	 */
	public int getPositionQuantity() {
		int tmpPositionQqntity = 0;
		Iterator<Trade> tradeIter = positionTrades.iterator();
		while(tradeIter.hasNext()) {
			Trade tmpTrade = tradeIter.next();
			if(tmpTrade.getDirection() == "BUY") {
				if(tmpTrade.getOperation() == "NEW" || tmpTrade.getOperation() == "AMEND") {
					tmpPositionQqntity += tmpTrade.getQuantity();
				}
			} else if(tmpTrade.getDirection() == "SELL") {
				if(tmpTrade.getOperation() == "CANCEL") {
					tmpPositionQqntity += tmpTrade.getQuantity();
				}
			}
			if(tmpTrade.getDirection() == "SELL") {
				if(tmpTrade.getOperation() == "NEW" || tmpTrade.getOperation() == "AMEND") {
					tmpPositionQqntity -= tmpTrade.getQuantity();
				}
			} else if(tmpTrade.getDirection() == "BUY") {
				if(tmpTrade.getOperation() == "CANCEL") {
					tmpPositionQqntity -= tmpTrade.getQuantity();
				}
			}
		} 
		return tmpPositionQqntity ;
	}
	
}
