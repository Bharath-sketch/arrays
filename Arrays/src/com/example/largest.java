package com.example;
import java.util.Arrays;
public class largest {
	public static void main(String[] args) {
		int[] arr= {23,4,46,51,23,90,86,50};
		Arrays.sort(arr);
		int smallest1 =arr[0];
		int smallest2=arr[1];
		System.out.println(smallest1);
		System.out.println(smallest2);
		int largest1 =arr[arr.length-1];
		int largest2=arr[arr.length-2];
		System.out.println(largest1);
		System.out.println(largest2);
	}


}
