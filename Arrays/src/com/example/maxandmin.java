package com.example;

public class maxandmin {
	public static void main(String args[]) {
		int[] arr = {23,45,67,54,34};
		int min =arr[0];
		int max =arr[0];
		for(int num :arr) {
			if(num>max) {
				max =num;
			}
		   if(num<min) {
			min =num;
		   }
		}
		   System.out.println(min);
		   System.out.println(max);
	}
}
