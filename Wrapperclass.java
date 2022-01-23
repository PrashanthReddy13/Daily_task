class Wrapperclass{
   public static void main(String []args){
    String value="85";
	int num=Integer.parseInt(value);
	System.out.println("string to int"+"\t"+num);
	
	String value1="55";
	byte val=Byte.parseByte(value1);
	System.out.println("string to byte"+"\t"+val);
	
	String n="8888";
	
	short v1=Short.parseShort(n);
	System.out.println("string to short"+"\t"+v1);
	
	String number="67";
	float n3=Float.parseFloat(number);
	System.out.println("string to float"+"\t"+n3);
	
	String num1="123456789";
	long num2=Long.parseLong(num1);
	System.out.println("string to long"+"\t"+num2);
	
	String num3="654321";
	double num4=Double.parseDouble(num3);
    System.out.println("string to double"+"\t"+num4);
	
	String num5="12";
	boolean num6=Boolean.parseBoolean(num5);
	System.out.println("string to boolean"+"\t"+num6);
	
	String s="13";
	for(int i=0;i<s.length();i++){
	char c=s.charAt(i);
	System.out.println("string to char"+"\t"+c);
	}
	}
	}