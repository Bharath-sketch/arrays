package com.example;
import java.util.Arrays;
import java.util.Scanner;
public class largestandsmallest {
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("enter the array size:");
		int n =scr.nextInt();
		System.out.println("Enter the array values");
		int[] arr= new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=scr.nextInt();
	}
		int size=arr.length;
		Arrays.sort(arr);
		for(int i =0;i<size;i++) {
			System.out.println(arr[i]);
		}
	}
}
