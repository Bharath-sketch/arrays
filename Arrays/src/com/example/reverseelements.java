package com.example;

public class reverseelements {
	public static void main(String args[]) {
		if(args.length!=4) {
			System.out.println("Enter the four digit integer");
			return;
		}
		int[][] arr=new int[2][2];
		arr[0][0]=Integer.parseInt(args[0]);
		arr[0][1]=Integer.parseInt(args[1]);
		arr[1][0]=Integer.parseInt(args[2]);
		arr[1][1]=Integer.parseInt(args[3]);
		System.out.println("The given array is :");
		System.out.println(arr[0][0]+"   "+arr[0][1]);
		System.out.println(arr[1][0]+"   "+arr[1][1]);
		System.out.println("The reversed array is :");
		System.out.println(arr[1][1]+"   "+arr[1][0]);
		System.out.println(arr[0][1]+"   "+arr[0][0]);
		
	}
}
//Write a program to reverse the elements of a given 2*2 array. Four integer numbers needs to be passed as Command Line arguments. 
