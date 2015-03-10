
public class ExceptionTestDriver {
	public static void main(String args[]){
		try{
		   doThingsA();
		}catch(Exception e){
			//e = new MyException("I am sorry something went wrong !!");
			System.out.println("some exception occured");
		}
		
	}
   public static void doThingsA() throws MyException{
	   System.out.println("This is A");
	   doThingsB();
	   
	   
   }
   public static void doThingsB()throws MyException {
	   try{
		   doThingsC();
		   
	   }catch(Exception e){throw new MyException ("didn't really want to deal with it",e); 
	   }finally{System.out.println("Finally,we're doing it");
	   }
   }
	   
	   
	   
   
   public static void doThingsC(){
	  System.out.println("we are in c");
		   doThingsD();
	
	  }
   public static void doThingsD() throws MyException{
	   throw new MyException("we are done");
   }
	   
}

