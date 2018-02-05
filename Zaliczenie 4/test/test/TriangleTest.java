package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

class TriangleTest {

	private static Triangle test = new Triangle(3, 4, 5, "Triangle");
	
	@Before
	public static void setUp()
	{
		test = new Triangle(3, 4, 5, "Triangle");
	}
	
	@Test
	public void areaTest() 
	{
		assertEquals(6.0, test.calculateArea());
	}
	
	@Test
	public void circiutTest()
	{
		assertNotEquals(11.0, test.calculateCircuit());
	}

	@Test
	public void rectangularTest()
	{
		assertTrue(test.isRectangular());
	}
	
	@Test
	public void anotherRectangularTest()
	{
		assertFalse(test.isRectangular(6, 5, 9));
	}
	
	@Test
	public void isItNotNull()
	{
		assertNotNull(test.getName());
	}
	
	@Test
	public void isItNull()
	{
		assertNull(test.getTemp());
	}
}
