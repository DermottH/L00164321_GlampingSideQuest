/**
 * 
 */
package atulab.ie.ghmvntst;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */
class CarTest {

	/**
	 * Test method for {@link atulab.ie.ghmvntst.Car#getDoors()}.
	 */
	@Test
	void testGetDoors() {
		atulab.ie.ghmvntst.Car car = new Car();
		car.setDoors(1);
		int j = car.getDoors();
		assertEquals(1,j);
	}

	/**
	 * Test method for {@link atulab.ie.ghmvntst.Car#setDoors(int)}.
	 */
	@Test
	void testSetDoors() {
		atulab.ie.ghmvntst.Car car = new Car();
		car.setDoors(0);
		int j = car.getDoors();
		assertEquals(0,j);
	}

}
