class    Demo3{
    static  void validateObject(Object obj){
    	
     	 if(obj  instanceof  String s){
                                     //String  str =  (String)obj;
                  		System.out.println("obj is String"+s.toUpperCase());
                          }
                    }  

                   public static void main(String args[]) {
			validateObject("hello");
	}
}    