                                                            interface  MyInterface{
                                                                         String  getName();
                                                             }
		                       class   RecordDemo{
                                                                                   record    UserRecord(String firstName,String lastName,int userId)implements MyInterface{
                                                                                                     static String user="max";
                                                                                                     
                                                                                                     
                                                                                                     void  demo(){
                                                                                                         System.out.println("inside record instance method");
                                                                                                     }
                                                                                                     static void demo1(){
                                                                                                          System.out.println("inside record static method");
                                                                                                      }
                                                                                                      public String  getName(){
                                                                                                          
                                                                                                          System.out.println("overriden method");
                                                                                                          return null;
                                                                                                      }
                                                                                   }
                                                                                   public static void main(String args[]){
                                                                                                UserRecord   rec = new UserRecord("srini","kumar",3333); //immutable object
                                                                                                System.out.println(rec.firstName());
                                                                                                //rec.firstName="navin";
                                                                                                 System.out.println(rec.user);
                                                                                              //   System.out.println(rec.user1);
                                                                                                  rec.demo();
                                                                                                  rec.demo1();

                                                                                                 UserRecord   rec1 = new UserRecord("srini","kumar",3333); //immutable object
                                                                                                 UserRecord   rec2 = new UserRecord("srini","kumar",3333); //immutable object
                                                                                                 System.out.println(rec1.equals(rec2));
                        
                                                                                                 System.out.println(rec1==rec2);                                                                        
                     
                                                                                    }
                                                                      }