package palindrom;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class PallindromeTest1 {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		System.out.println("before the test");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("after the test");
	}

	@Test
public void testIsPal2() {
		
		palindrom test = new palindrom();
		assertTrue(test.isPal(1221));
		for(int i=0;i<10;i++)
		assertFalse(test.isPal(i));
	
}
}
