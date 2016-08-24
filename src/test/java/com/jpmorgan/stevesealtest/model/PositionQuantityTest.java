/**
 * 
 */
package com.jpmorgan.stevesealtest.model;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * To test that the quantity is correct
 * 
 * @author Steve Seal (U776998)
 *
 */
public class PositionQuantityTest {

	/**
	 * 
	 */
	private Trade tradeToAdd;

	/**
	 * 
	 * @throws Exception
	 */
	@Before
	public void setUp() throws Exception {
		TradeKey tradeKey = new TradeKey(5678,1);
		tradeToAdd = new Trade(tradeKey, "QED", 200, "BUY", "ACC-2345", "NEW");
	}

	/**
	 * 
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
		tradeToAdd = null;
	}

	/**
	 * 
	 */
	@Test
	public void testAddTrade() {
		PositionKey positionKey = new PositionKey(tradeToAdd.getSecurityId(), tradeToAdd.getAccountNumber()); 
		Position position = new Position(positionKey);
		position.addTrade(tradeToAdd);
		assertEquals("Position quantity must be 200", 200, position.getPositionQuantity());
	}

}
