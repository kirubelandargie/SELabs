package edu.miu.cs.swe.myjunittestdemo;


import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ArrayReversorTest {
	private ArrayReversor arrayReversor;
	private IArrayFlattenerService arrayFlattenerService= mock(IArrayFlattenerService.class);

	
	
	@Before
	public void setUp() throws Exception {
		this.arrayReversor= new ArrayReversor(arrayFlattenerService);
	}

	@After
	public void tearDown() throws Exception {
		this.arrayReversor=null;
	}

	@Test
	public void testReverseArray() {
		when(arrayFlattenerService.flattenArray(new Integer[][]{{1,3},{0},{4,5,9}})).thenReturn(new Integer[]{1,3,0,4,5,9});
		Integer[]actual=arrayReversor.reverseArray(new Integer[][]{{1,3},{0},{4,5,9}});
		Integer[]expected=new Integer[] {9,5,4,0,3,1};
		assertArrayEquals(expected,actual);
		verify(arrayFlattenerService.flattenArray(new Integer[][]{{1,3},{0},{4,5,9}}));																							//asserThat(actual,Matcher(expected));
	}

}
