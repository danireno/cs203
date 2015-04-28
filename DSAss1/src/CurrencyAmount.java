
public class CurrencyAmount {
	public static void main(String[] args){

		CurrencyAmount ob1=new CurrencyAmount();
		ob1.Dollar(11.56);

	}

	static void Dollar(double x){

		
		int dollar=(int) x;
		double cent=x-dollar;

		int quarters=0;
		int dimes=0;
		int nickels = 0;
		int pennies=0;

		
		int t= (int) (cent/0.25);
		if(t>0){
			quarters+=t;
			cent-=t*0.25;
		}
		t=(int) (cent/0.10);
		if(t>0){
			dimes+=t;
			cent-=t*0.10;
		}
		t=(int) (cent/0.05);
		if(t>0){
			nickels+=t;
			cent-=t*0.05;
		}
		t=(int) (cent/0.01);
		if(t>0){
			pennies+=t;
			cent-=t*0.01;
		}
	

		System.out.println("dollar is "+ dollar);
		System.out.println("quarters "+ quarters  );
		System.out.println("dimes " + dimes);
		System.out.println("nickels " + nickels);
		System.out.println("pennies "+ pennies);



	}
	
	//out put 
	/*dollar is 11
	quarters 2
	dimes 0
	nickels 1
	pennies 1*/

	





}
