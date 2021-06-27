public class  JavaSwitchDemo2{
                                                                      public static  void  show(String day){
					String result =switch(day){
						case   "M" , "T" , "W"  :
								yield  "dev meet";
						case   "TH","F","S" :
								yield "hr meet";
						default  :
								yield "in default";
					};
					System.out.println(result);
				}
				public static void main(String args[]){
					show("W");
				}
			}