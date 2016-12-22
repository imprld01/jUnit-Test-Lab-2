package ntou.cs.sorter;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MySorterTest {

	private MySorter sorter;
	
	private double tc1[][] = { {}, {} };	// test empty set
	private double tc2[][] = { { 1.0 }, { 1.0 } };	// test single element set
	private double tc3[][] = { { 1.0, 1.1, 2.0, 2.1, 10.10, 100 }, { 1.0, 1.1, 2.0, 2.1, 10.10, 100 } };	// test set with incremental order
	private double tc4[][] = { { 100, 10.10, 2.1, 2.0, 1.1, 1.0 }, { 1.0, 1.1, 2.0, 2.1, 10.10, 100 } };	// test set with decremental order
	private double tc5[][] = { { 2.0, 2.1, 1.1, 10.10, 100, 1.0 }, { 1.0, 1.1, 2.0, 2.1, 10.10, 100 } };	// test set with random order
	private double tc6[][] = { { 1, 2, 5, 4, 3 }, { 1, 2, 3, 4, 5 } };	// test set with all integer value
	private double tc7[][] = { { 1, 2, -99 }, { 1, 2, -99 } };	// test set with negative number
	
	private void assertArrayEquals(double[] expected, double[] actual) {
		
		assertEquals(expected.length, actual.length);
		
		for (int i = 0; i < expected.length; i++) {
			assertEquals(expected[i], actual[i], 0.0001);
		}
	}
	
	@Before
	public void setUp() throws Exception {
		
		sorter = new MySorter();
	}

	@After
	public void tearDown() throws Exception {
		
		sorter = null;
	}
	
	@Test
	public void testSort1() {
		
		sorter.sort(tc1[0]);
		this.assertArrayEquals(tc1[0], tc1[1]);
	}
	
	@Test
	public void testSort2() {
		
		sorter.sort(tc2[0]);
		this.assertArrayEquals(tc2[0], tc2[1]);
	}
	
	@Test
	public void testSort3() {
		
		sorter.sort(tc3[0]);
		this.assertArrayEquals(tc3[0], tc3[1]);
	}
	
	@Test
	public void testSort4() {
		
		sorter.sort(tc4[0]);
		this.assertArrayEquals(tc4[0], tc4[1]);
	}
	
	@Test
	public void testSort5() {
		
		sorter.sort(tc5[0]);
		this.assertArrayEquals(tc5[0], tc5[1]);
	}
	
	@Test
	public void testSort6() {
		
		sorter.sort(tc6[0]);
		this.assertArrayEquals(tc6[0], tc6[1]);
	}
	
	@Test
	public void testSort7() {
		
		sorter.sort(tc7[0]);
		this.assertArrayEquals(tc7[0], tc7[1]);
	}
}