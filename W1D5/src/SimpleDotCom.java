
public class SimpleDotCom {
	int[] locationCells;
	int numOfHits=0;
	public void SetLocationCells(int[] locs){
		locationCells=locs;
	}
	public String CheckYourSelf (String stringGuess){
		int guess =Integer.parseInt(stringGuess);
		String result="miss";
		for(int cell : locationCells){
			if(guess == cell){
				result="hit";
				numOfHits++;
				break;
			}
		}
		if(numOfHits==locationCells.length){
			result="Kill";
		}
		System.out.println(result);
		return result;
	}

}
