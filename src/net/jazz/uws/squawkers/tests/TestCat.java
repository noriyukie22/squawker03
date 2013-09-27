/**
 * 
 */
package net.jazz.uws.squawkers.tests;

import static org.junit.Assert.assertEquals;
import net.jazz.uws.squawkers.Cat;

import org.junit.Test;

/**
 * @author wasleski
 *
 */
public class TestCat {

	/**
	 * Test method for {@link net.jazz.uws.squawkers.Cat#squawk()}.
	 */
	@Test
	public void testSquawk() {
		Cat squawker = new Cat();
		assertEquals("Meow", squawker.squawk());
	}

}
