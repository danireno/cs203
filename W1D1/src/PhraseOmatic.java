
public class PhraseOmatic {

	public static void main(String[] args) {
		String[] WorldListOne={"one","two","three","four"};
		String[] WorldListTwo={"5","6","7","8"};
		String[] Worldlistthree={"dani","teddy"};
		int one=WorldListOne.length;
		int two=WorldListTwo.length;
		int three=Worldlistthree.length;
		int rand1=(int) (Math.random()*one);
		int rand2=(int) (Math.random()*two);
		int rand3=(int) (Math.random()*three);
		String phrase=WorldListOne[rand1]+" " +WorldListTwo[rand2]+" " +Worldlistthree[rand3];
		System.out.println(phrase);
		
		

	}

}
