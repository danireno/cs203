
public class Player {
	int number=0;
	public void Guess(){
		number=(int) (Math.random() * 10);
		System.out.println("i'm gussing"+ number);
	}

}
