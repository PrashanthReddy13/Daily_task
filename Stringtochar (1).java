class Stringtochar{
	
	public static void main(String args[]){
		for(int i=0;i<args.length;i++){
			String name = args[i];
			for(int j=0;j<name.length();j++){
				char c = name.charAt(j);
				System.out.print("\t"+c);
			}
			System.out.println();
		}
	}
}