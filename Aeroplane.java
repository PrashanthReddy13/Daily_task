 class Aeroplane{
	String name;
	String colour;
	int speed;
	float milage;
	
	Aeroplane(){
		System.out.println("default constructor");
	
	}
	Aeroplane(int speed,float milage){
		this();
		this.speed=speed;
		this.milage=milage;
		
	}
	Aeroplane(String name,String colour,int speed){
		this(460,18.5f);
		this.name=name;
		this.colour=colour;
		
	
	}
}   
	
