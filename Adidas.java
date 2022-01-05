class Adidas{
	String shoe;
	String shirt;
	String trackpants;
	String bag;
	String socks;
	int totbag;
	
	Adidas(){
		System.out.print("Excecuted the Default Contructor Adidas() ");
		System.out.println();
	}
	
	Adidas(String sh, String shr, String tp, String bg, String sks ){
		shoe = sh;
		shirt = shr;
		trackpants = tp;
		bag =bg;
		socks = sks;
		System.out.print("Excecuted the Contructor Adidas( String, String, String, String, String, String) ");
	}
	
	Adidas(String sh, int tb){
		
		shoe = sh;
		totbag = tb;
		System.out.print("Excecuted the Contructor Adidas( String, int) ");
	
	}
}	
	