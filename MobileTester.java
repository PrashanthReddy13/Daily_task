package com.xworkz.mobileCrud.FlipKart;

public class MobileTester {
	public static void main(String[] args) {
		MobileDTO dto=new MobileDTO ();	
		dto.setBrandName("Samsung");
		dto.setColor("gray");
		dto.setModelName("Galaxy M12");
		dto.setPrice(12499f);
		dto.setRam((byte)6);
		dto.setRatings(4.1f);
		dto.setStorage(128);	
		
		
		MobileDTO dto1=new MobileDTO ();	
		dto1.setBrandName("Vivo");
		dto1.setColor("silver");
		dto1.setModelName("Y33s");
		dto1.setPrice(18990f);
		dto1.setRam((byte)8);
		dto1.setRatings(4.3f);
		dto1.setStorage(128);		
		
		FlipkartDAOImp f=new FlipkartDAOImp();
		String a=f.add(dto);
			System.out.println("dto"+"\t"+a);
		System.out.println("--------------------------");
		String a1=f.add(dto1);
		System.out.println("dto1"+"\t"+a1);
	}

}
