package edu.miu.cs.swe.myjunittestdemo;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class ArrayFlattenerTest {
	
	private ArrayFlattener arrayFlattener;

	@Before
	public void setUp() throws Exception {
		this.arrayFlattener=new ArrayFlattener();
	}

	@After
	public void tearDown() throws Exception {
		arrayFlattener=null;
	}

	@Test
	public void testFlattenArray() {
		int[][]a_in = {{1,3},{0},{4,5,9}};
		int[]expected= new int[]{1,3,0,4,5,9};
		int[]actual=arrayFlattener.flattenArray(a_in);
		assertArrayEquals(expected,actual);
	}
	@Test
	public void testFlattenArray2() {
		int[][]a_in = null;;
		int[]expected= null;;
		int[]actual=arrayFlattener.flattenArray(a_in);
		assertArrayEquals(expected,actual);
	}
	

}
