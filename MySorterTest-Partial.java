package ntou.cs.sorter;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MySorterTest
{
	// test empty set
	private double tc1[][] = { {}, {} };
	// test single element set
	private double tc2[][] = { { 1.0 }, { 1.0 } };
	// test set with incremental order
	private double tc3[][] = { { 1.0, 1.1, 2.0, 2.1, 10.10, 100 },
			{ 1.0, 1.1, 2.0, 2.1, 10.10, 100 } };
	// test set with decremental order
	private double tc4[][] = { { 100, 10.10, 2.1, 2.0, 1.1, 1.0 },
			{ 1.0, 1.1, 2.0, 2.1, 10.10, 100 } };
	// test set with random order
	private double tc5[][] = { { 2.0, 2.1, 1.1, 10.10, 100, 1.0 },
			{ 1.0, 1.1, 2.0, 2.1, 10.10, 100 } };
	// test set with all integer value
	private double tc6[][] = { { 1, 2, 5, 4, 3 }, { 1, 2, 3, 4, 5 } };
	// test set with negative number
	private double tc7[][] = { { 1, 2, -99 }, { 1, 2, -99 } };

	private MySorter sorter;
	
	private void assertArrayEquals (double[] expected, double[] actual)
	{
		assertEquals(expected.length, actual.length);
		for (int i = 0; i < expected.length; i++)
		{
			assertEquals(expected[i], actual[i], 0.0001);
		}
	}
}
