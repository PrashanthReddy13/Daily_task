class PrimeNum{
	public static void main(String []args){
		for(int i=0;i<args.length;i++){
			int primecheck=0;
			int num = Integer.parseInt(args[i]);
			
			for(int j=2;j<=num/2;j++){
				if(num%j==0){
					System.out.println("number :"+num+" is not a prime number");
					primecheck=1;
					break;
				}
			}
			if(primecheck==0){
					System.out.println("number :"+num+" is a prime number");
			}
		}
	}
}