package com.array;

public class ArrayDecclarationEx {

	public static void name (String []args) {
		
		int arr[];
		arr = new int[5];
		
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		for(int i=0;i<arr.length;i++) {
			 System.out.println("Elements ;" + i + ";" +arr[i]);
		}
	}
}
