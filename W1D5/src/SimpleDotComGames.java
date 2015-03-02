
public class SimpleDotComGames {
	public static void main(String[]args){
		int numOfGuesses=0;
		GameHelper helper =new GameHelper();
		SimpleDotCom theDotCom=new SimpleDotCom();
		int randomNum=(int)(Math.random()*5);
		int[]locations={randomNum,randomNum+1,randomNum+2};
		theDotCom.SetLocationCells(locations);
		boolean isAlive=true;
		while(isAlive==true){
			String guess=helper.getUserInput("enter a number");
			String result=theDotCom.CheckYourSelf(guess);
			numOfGuesses++;
			if(result.equals("Kill")){
				isAlive=false;
				System.out.println("you took " + numOfGuesses + "guesses");
			}
				
		}
	}

}
