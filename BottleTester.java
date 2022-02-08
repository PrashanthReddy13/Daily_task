package com.xworkz.oops.Hasa;

import java.util.Scanner;

public class BottleTester {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Cap c1=new Cap();
		System.out.println("enter cap colour:");
		c1.setColour(sc.next());
		System.out.println("enter cap shape:");
		c1.setShape(sc.next());
		System.out.println("enter cap size:");
		c1.setSize(sc.next());
		
		Bottle b=new Bottle();
		System.out.println("enter bottle colour:");
		b.setColour(sc.next());
		System.out.println("enter bottle price:");
		b.setPrice(sc.nextInt());
		System.out.println();
		System.out.println("enter bottle type:");
		b.setType(sc.next());
		b.setCap(c1);
		
		
		
		System.out.println(b.getAll());
	

}
}