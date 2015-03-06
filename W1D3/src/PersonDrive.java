
public class PersonDrive {
	public static void main(String[]args){
		Person[] PO=new Person[5];
		Person P1 = new Person();
		P1.FirstName="john";
		P1.LastName="Don";
		for(int i=0;i<PO.length;i++){
			PO[i]=P1;
		
			System.out.println("this is the new : "+ " " + PO[i].FirstName +" "+ PO[i].LastName);
			
		}
	     PO[0].LastName="Smith";
		for(int i=0;i<PO.length;i++){
		   System.out.println("this is the new : "+ " " + PO[i].FirstName +" "+ PO[i].LastName);
		}
	
	}

}
