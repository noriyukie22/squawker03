/**
 * 
 */
package net.jazz.uws.squawkers.tests;

import static org.junit.Assert.assertEquals;
import net.jazz.uws.squawkers.Dog;

import org.junit.Test;

/**
 * @author wasleski
 *
 */
public class TestDog {

	/**
	 * Test method for {@link net.jazz.uws.squawkers.Dog#squawk()}.
	 */
	@Test
	public void testSquawk() {
		Dog squawker = new Dog();
		assertEquals("Bow-wow", squawker.squawk());
	}

}
