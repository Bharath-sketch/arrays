package com.example;
import java.util.Arrays;
import java.util.Scanner;
public class duplicateelements {
	public static void main(String args[]) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter the size of an array");
		int n =scr.nextInt();
		System.out.println("Enter the array elements:");
		int[] arr =new int[n];
		{
	for(int i =0;i<n;i++) {
		arr[i]=scr.nextInt();
	}
	Arrays.sort(arr);
	int size =arr.length;
	int[] temp = new int[n];
	int k=0;
	for(int i=0;i<size-1;i++) {
		if(arr[i]!=arr[i+1]) {
			temp[k++]=arr[i];
		}
	}
	temp[k++]=arr[size-1];
	for(int i=0;i<k;i++) {
		System.out.println(temp[i]);
		if(i<k-1) {
	System.out.println();
	}
	}
	}
}
}
