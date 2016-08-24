/**
 * 
 */
package com.jpmorgan.stevesealtest.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * @author Steve Seal (U776998)
 *
 */
public class PositionTradeAMENDTest {

	/**
	 * 
	 */
	private Trade tradeToAdd1;
	private Trade tradeToAdd2;

	/**
	 * 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		TradeKey tradeKey1 = new TradeKey(5678,1);
		tradeToAdd1 = new Trade(tradeKey1, "QED", 200, "BUY", "ACC-2345", "NEW");
		TradeKey tradeKey2 = new TradeKey(5678,2);
		tradeToAdd2 = new Trade(tradeKey2, "QED", 0, "BUY", "ACC-2345", "CANCEL");		
	}

	/**
	 * 
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
		tradeToAdd1 = null;
		tradeToAdd2 = null;
	}

	/**
	 * 
	 */
	@Test
	public void testAddTrade() {
		PositionKey positionKey = new PositionKey(tradeToAdd1.getSecurityId(), tradeToAdd1.getAccountNumber()); 
		Position position = new Position(positionKey);
		position.addTrade(tradeToAdd1);
		position.addTrade(tradeToAdd2);
		assertEquals("Must be ONE trade in this position", 1, position.getPositionTrades().size());
	}
}
