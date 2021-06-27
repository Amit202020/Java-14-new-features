			public class  JavaSwitchDemo1{
                                                                      public static  void  show(String day){
				 String result = switch(day){
						case   "M" , "T" , "W"   ->     "dev meet";
						case   "TH","F","S"  ->   "hr meet";
						default  ->  "in default";
					};
				    System.out.println(result);
				}
				public static void main(String args[]){
					show("M");
				}
			}