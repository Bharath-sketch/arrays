package com.example;
public class arraypgm {
	public static void main(String args[]) {
		int[] arr = {1,2,3,4,5};
		int sum =0;
		int length =arr.length;
		for(int num:arr) {
			sum=sum+num;
		}
		int avg =sum/length;
		System.out.println(sum);
		System.out.println(avg);
	}
}
//Write a program to initialize an integer array and print the sum and average of the array. 
