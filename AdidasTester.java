class AdidasTester{
		
	public static void main(String []arg){
		Adidas product = new Adidas();
		System.out.println("1st object for Adidas()");
		System.out.println();
		System.out.println("Shoe : "+product.shoe + "\t Shirt : "+ product.shirt+"\t trackpants : "+product.trackpants+ "\tbag : "+product.bag+"\tsocks :"+product.socks );
		System.out.println();
		System.out.println("--------------------------------------------------------------------");
		
		Adidas product1 = new Adidas();
		System.out.println("2nd object for Adidas()");
		System.out.println("Shoe :"+product1.shoe + "\t Shirt : "+ product1.shirt+"\t trackpants : "+product1.trackpants+ "\tbag : "+product1.bag+"\tsocks :"+product1.socks );
		System.out.println();
		System.out.println("--------------------------------------------------------------------");
		
		Adidas product2 = new Adidas("Sports shoe", "Casual Shirts", " black pants","College bag","Ankle socks");
		System.out.println();
		System.out.println("1st object for Adidas(5 string)");
		System.out.println("Shoe : "+product2.shoe + "\t Shirt : "+ product2.shirt+"\t trackpants : "+product2.trackpants+ "\tbag : "+product2.bag+"\tsocks :"+product2.socks );
		System.out.println();
		System.out.println("--------------------------------------------------------------------");
		
		Adidas product3 = new Adidas("Sports shoe", "Casual Shirts", " black pants","College bag","Ankle socks");
		System.out.println();
		System.out.println("2nd object for Adidas(5 String)");
		System.out.println("Shoe : "+product3.shoe + "\t Shirt : "+ product3.shirt+"\t trackpants : "+product3.trackpants+ "\tbag : "+product3.bag+"\tsocks :"+product3.socks );
		System.out.println();
		System.out.println("--------------------------------------------------------------------");
		
		Adidas product4 = new Adidas("Sports shoe", 200);
		System.out.println();
		System.out.println("1st object for Adidas(string, int)");
		System.out.println("Shoe : "+product4.shoe + "\t Shirt :"+ product4.shirt+"\t trackpants : "+product4.trackpants+ "\tbag : "+product4.bag+"\tsocks :"+ product4.socks );
		System.out.println();
		System.out.println("--------------------------------------------------------------------");
		
		Adidas product5 = new Adidas("Formal shoe", 200);
		System.out.println();
		System.out.println("2nd object for Adidas(string, int)");
		System.out.println("Shoe : "+product5.shoe + "\t Shirt :"+ product5.shirt+"\t trackpants : "+product5.trackpants+ "\tbag : "+product5.bag+"\tsocks :"+ product5.socks );
		System.out.println();
		System.out.println("--------------------------------------------------------------------");
		
	}
	
	

}
	