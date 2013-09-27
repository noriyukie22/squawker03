/**
 * 
 */
package net.jazz.uws.squawkers.tests;

import static org.junit.Assert.assertEquals;
import net.jazz.uws.squawkers.Lion;

import org.junit.Test;

/**
 * @author bluezie
 *
 */
public class TestLion {

	/**
	 * Test method for {@link net.jazz.uws.squawkers.Lion#squawk()}.
	 */
	@Test
	public void testSquawk() {
		Lion squawker = new Lion();
		assertEquals("Roar", squawker.squawk());
	}

}
