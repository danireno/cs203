import java.util.Scanner;


public class Player {
	int number1;
	int number2;
	int number3;
	public void Guess(){
		//number=(int) (Math.random() * 10);
		//this.number=number;
		Scanner player=new Scanner(System.in);
		System.out.print("enter your guess number player 1?");
		number1=player.nextInt();
		System.out.print("enter your guess number player 2?");
		number2=player.nextInt();
		System.out.print("enter your guess number player 3?");
		number3=player.nextInt();
		
		//System.out.println("i'm gussing"+ number);
	}


}
