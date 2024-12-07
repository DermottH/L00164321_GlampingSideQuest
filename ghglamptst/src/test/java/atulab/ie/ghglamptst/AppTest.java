package atulab.ie.ghglamptst;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit tests for the Glamping Side Quest application.
 */
public class AppTest extends TestCase {

    /**
     * Create the test case.
     *
     * @param testName name of the test case
     */
    public AppTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(AppTest.class);
    }

    /**
     * Test for setting up a camp.
     */
    public void testSetUpCamp() {
        int points = App.setUpCamp();
        assertTrue("Points should be between 5 and 15", points >= 5 && points <= 15);
    }

    /**
     * Test for starting a fire.
     */
    public void testStartFire() {
        int points = App.startFire();
        assertTrue("Points should be between 5 and 10", points >= 5 && points <= 10);
    }

    /**
     * Test for cooking a chicken.
     */
    public void testCookChicken() {
        int points = App.cookChicken();
        assertTrue("Points should be between 10 and 30", points >= 10 && points <= 30);
    }

    /**
     * Test for displaying the help menu.
     * (This test checks the method doesn't crash.)
     */
    public void testShowHelp() {
        try {
            App.showHelp();
        } catch (Exception e) {
            fail("showHelp() should not throw an exception: " + e.getMessage());
        }
    }
}
