class SuperHerosTester{
	public static void main(String [] args){
	
	SuperHeroes sph[]=new SuperHeros[5];
	
	SuperHeros sph1=new SuperHeros("blackpanther","martial artist","blackpanther1@gmail.com",30,1966);
	SuperHeros sph2=new SuperHeros("Killmonger","expert tactician","killmonger1@gmail.com",32,1973); 
	SuperHeros sph3=new SuperHeros("Groot","regenerative healing facto","groot1@gmai.com",35,1960);
	SuperHeros sph4=new SuperHeros("Hawkeye"," sword master","hawkey1@gmail.com",33,1964);
	SuperHeros sph5=new SuperHeros("Star-Lord","space travel","starlord1@gmail.com",29,1976);
	
	sph[0]=sph1;
	sph[1]=sph2;
	sph[2]=sph3;
	sph[3]=sph4;
	sph[4]=sph5;
	for(int index=0;index<sph.length;index++){
		System.out.println(sph[index].name+"\t"+sph[index].po+"\t"+sph[index].ei+"\t"+sph[index].ag+"\t"+sph[index].yr);
		
		
	}
	System.out.println("==================================================================================");
	System.out.println();
	Details1.add("Iron Man","ability to fly","ironma1@gmail.com",35,1963);
	System.out.println();
	 Details1.printAll();
	 Details1.updateByName("Iron Man1");
	 
	}

}