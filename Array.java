package com.xworkz.oops.enacapsulation;

public class Array {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int n=scanner.nextInt();
		System.out.println("number of elements want to store is:"+n);
		int []array=new int[7];
		System.out.println("enter the elements of the array:");
		for(int i=0;i<n;i++) {
			array[i]=scanner.nextInt();
		}
		System.out.println("array elements are:");
		for(int i=0;i<n;i++) {
			System.out.println(array[i]);
		}
		
		
	}

}

}
