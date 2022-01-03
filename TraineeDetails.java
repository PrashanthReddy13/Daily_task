class TraineeDetails{
	static String names[]= {"null","null","null"};
		static void printAll(){
			for(int index = 0;index < names.length;index++){
				System.out.print(names[index]+"\t");
			}
				System.out.println();
		}
			static void updateName(String oldName,String newName){
				for(int index=0;index<names.length;index++){
					if(oldName.equals(names[index])){
						names[index]=newName;
					}
				}
		}
		add(int index, Strin value)
}