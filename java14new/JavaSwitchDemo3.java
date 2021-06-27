		 class   JavaSwitchDemo3{
				public static void main(String args[]){
				String  day="A";
				String output=switch(day){
				            case  "M","T","W"   ->  "dev meet" ;
				            case   "TH","F","S"   ->  "hr meet";
				            default   -> {
					  yield    "please insert valid day";
					}
				};
				System.out.println(output);
			}
			}