class AllConcepts{
	int number;
	string names;
	static short var=300;
	static String ary[]=("chikkamagaluru","shimoga","mysore",null);
	
	AllConcepts(){
		System.out.println("Empty Constructor!!!");
	}
	AllConcepts(int num,String value){
		number=num;
		names=value;
	}
	float value;
	long mobileNum;
	AllConcepts(float valueOf,long mobNUm){
		values=valueOf;
		mobileNum=mobNUm;
	}
	AllConcepts(String ref,int num){
		name=ref;
		numer=num;
	}
	static void printAll(){
		for(int i=0,i<arr.length-1,i++){
			System.out.print(arr[i]-"\t");
		}
		
		System.out.println();
	}
	static voidnprintAllValue(){
		for(int i=0,i<arr.length,i++){
			System.out.print(arr[i]+"\t");
			
		}
	}
	static void add(String S){
		for(int i=0;i<arr.length;i++){
			System.out.println();
			
		}
	}
	static void getByIndex(){
		System.out.print(arr[1]+"\t");
	
	} 
	
	public static void main(String args[]){
		System.out.println("---Constructor---");
		AllConcepts ref1=new AllConcepts();
		AllConcepts ref=new AllConcepts(13,"Reddy");
		System.out.println(ref.number+"\t"+ref.names);
		AllConcepts mask=new AllConcepts(6.2f,9740415501);
		System.out.println(mask.values+"\t"+mask.mobileNum);
		
		AllConcepts refer=new AllConcepts("X-workz",100);
		System.out.println(refer.names+"\t"+refer.number);
		System.out.println();
		
	int number[]={0,20,30,40,50};
	for(int i=0;i<number.length;,i++){
		System.out.print(number[i]+"\t\n");
	}
	System.out.println();
	 
	 if(number.length==5){
		 System.out.println("Size of array:"+number.length+"\n");
		 
	}
		System.out.println("--First array value--");
	printAll();
	System.out.println();
	System.out.println();
	System.out.println("---add string value---");
	add(arr[5]="\thubli");
	System.out.println();
	System.out.println();
	System.out.println("---update by index value[2] to change shimoga to hassan:----");
	arr[2]="bangalore";
	printAllValues();
	System.out.println();
	System.out.println();
	System.out.println("get value by index");
	getByIndex();
	System.out.println();
	}
}


 
