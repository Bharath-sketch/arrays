package com.example;

public class threematrix {
	public static void main(String args[]) {
		if(args.length!=9) {
			System.out.println("Enter the nine digit number");
			return;
		}
		int[][] arr=new int[3][3];
		arr[0][0]=Integer.parseInt(args[0]);
		arr[0][1]=Integer.parseInt(args[1]);
		arr[0][2]=Integer.parseInt(args[2]);
		arr[1][0]=Integer.parseInt(args[3]);
		arr[1][1]=Integer.parseInt(args[4]);
		arr[1][2]=Integer.parseInt(args[5]);
		arr[2][0]=Integer.parseInt(args[6]);
		arr[2][1]=Integer.parseInt(args[7]);
		arr[2][2]=Integer.parseInt(args[8]);
		System.out.println("The given array is :");
		System.out.println(arr[0][0]+" "+arr[0][1]+" "+arr[0][2]);
		System.out.println(arr[1][0]+" "+arr[1][1]+" "+arr[1][2]);
		System.out.println(arr[2][0]+" "+arr[2][1]+" "+arr[2][2]);

		int max =arr[0][0];
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
			if(arr[i][j]>max) {
				max=arr[i][j];
			}
			}
		}
		System.out.println(max);

}
}
