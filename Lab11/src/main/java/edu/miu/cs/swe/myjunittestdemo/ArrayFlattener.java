package edu.miu.cs.swe.myjunittestdemo;


import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayFlattener {
	
		
	 public ArrayFlattener() { };
	
	
	 public  int[] flattenArray(int[][] arr) {
		 if(arr==null)return null;

			int[] array = Stream.of(arr).flatMapToInt(IntStream::of).toArray();				
			return array;
	
	 }
	
	
}
