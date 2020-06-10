package edu.miu.cs.swe.myjunittestdemo;

import java.util.Arrays;

public class ArrayReversor {

	private IArrayFlattenerService arrayFlattenerService;

	public ArrayReversor(IArrayFlattenerService arrayFlattenerService) {
		this.arrayFlattenerService = arrayFlattenerService;
	}
	
	public Integer[]reverseArray(Integer[][]smpl){                         //I dont know why it is not working actually i did it as you show us
		
		if(smpl==null)return null;
		Integer[]flattened= arrayFlattenerService.flattenArray(smpl);
		
//		System.out.println(Arrays.toString(flattened));
//		Integer[]flattened=new Integer[] {1,3,0,4,5,9};
		
		Integer[]newArray=new Integer[flattened.length];
		
		for(int i=flattened.length-1, j=0;i>=0;i--) {
			newArray[j]=flattened[i];
			j++;
		}
		return  newArray;
	}

}
