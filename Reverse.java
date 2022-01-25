class Reverse{
	public static void main(String []args){
	int num=2535,one=0;
	for(;num!=0;num=num/10){
		int two=num%10;
		one=one*10+two;
	}
	 System.out.println(one);
}  		
}