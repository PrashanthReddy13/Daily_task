class Factorial{
	public static void main(String args[]){
		int start = Integer.parseInt(args[0]);
		int end = Integer.parseInt(args[1]);
		int fact=1;
		for(;start <= end; start++){
				
			for(int i=1;i<=start;i++){
				fact= fact*i;
			}
			System.out.println("factorial of "+start+" is "+ fact);
			fact =1;
		}
	}
}