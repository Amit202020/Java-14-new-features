class   JavaSwitchDemo{
				public static void main(String args[]){
				String day = "S";
                                                                           String output=null;
				switch(day){
				     case   "M":
				     case   "T":
				     case   "W":{
					       output =  "dev meet";
					       break;
					}
				     case    "TH":
				     case    "F":
				     case    "S":{
				                         output= "hr meet";
					      break;
					}	
				};
				System.out.println(output);
			}
			}





