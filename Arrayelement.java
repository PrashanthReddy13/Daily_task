package com.xworkz.oops.enacapsulation;

public class Arrayelement {
	public static void main(String[] args) {
		Scanner canner=new scanner(System.in);
	
		int []arr=new int[3];
		System.out.println("input array elements");
		for(int i=0;i<arr.length;i++) {
			arr[i]=scanner.nextInt();
		}
		System.out.println("output array elements:");
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]+"\t");
			
		}
		
		}

}
