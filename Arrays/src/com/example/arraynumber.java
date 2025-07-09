package com.example;
import java.util.Scanner;
public class arraynumber {
	public static void main(String args[]) {
		int[] arr = {23,43,51,76,55};
		Scanner s = new Scanner(System.in);
        System.out.print("Enter the number to search: ");
        int target = s.nextInt();
        int index= -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        System.out.println(index);
        }
        }
//Write a program to initialize an integer array with values and check if a given number is present in the array or not
