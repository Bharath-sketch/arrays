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
//Write a program to print the sum of the elements of an array following the given below condition. 
If the array has 6 and 7 in succeeding orders, ignore the numbers between 6 and 7 and consider the other numbers for calculation of sum. 
Eg1) Array Elements - 10,3,6,1,2,7,9 O/P: 22 
[i.e 10+3+9] 

