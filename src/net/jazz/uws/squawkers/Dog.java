/**
 * 
 */
package net.jazz.uws.squawkers;

import net.jazz.uws.squawk.Squawker;

/**
 * @author wasleski
 *
 */
public class Dog extends Squawker {

	private static final String BOW_WOW = "Bow-wow";

	/* (non-Javadoc)
	 * @see net.jazz.uws.squawk.Squawker#squawk()
	 */
	@Override
	public String squawk() {
		return BOW_WOW;
	}

}
