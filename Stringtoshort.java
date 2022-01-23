class Stringtoshort{
  public static void main(String[]args){
  for(int i=0;i<args.length;i++){
   short balance=Short.parseShort(args[i]);
   System.out.println(balance);
  }
   }
   }