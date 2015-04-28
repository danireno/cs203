import java.util.*;
public class IsOEZ {

	public static void main(String[] args){

		Scanner s=new Scanner (System.in);

		System.out.println("enter a number ");
		int num=s.nextInt();

		int odd=0;
		int even=0;
		int zero=0;

		if(num==0)
			zero++;

		while(num>0){
			double r=num%10;

			if(r==0){
				zero++;
			}

			else if(r%2==0){
				even++;
			}else
				odd++;
			num=num/10;

		}



		System.out.println("Odd digits:" + odd);
		System.out.println("Even digits:" + even);
		System.out.println("Zero digits:" + zero);

	}
	/*
	 * enter a number 
10239
Odd digits:3
Even digits:1
Zero digits:1

	 */

}
