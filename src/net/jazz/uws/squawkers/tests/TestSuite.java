/**
 *
 */
package net.jazz.uws.squawkers.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

/**
 * @author wasleski
 *
 */
@RunWith(Suite.class)
@SuiteClasses( { TestCat.class,
// ADD YOUR TEST CLASS AFTER HERE
		TestLion.class,
// AND BEFORE HERE
		TestDog.class })
public class TestSuite {

}