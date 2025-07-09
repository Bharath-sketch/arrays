package com.example;
public class sumofelements {
	    public static void main(String[] args) {
	        int[] arr = {10, 3, 6, 1, 2, 7, 9}; 
	        int sum = 0;
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == 6) {
	                while (i < arr.length && arr[i] != 7) {
	                    i++;
	                }
	                continue;
	            }
	            sum += arr[i];
	        }
	        System.out.println("Output: " + sum);
	    }
	}
