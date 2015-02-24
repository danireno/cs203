
public class BeerSong2 {
	public static void main(String[] args) {
		int beerNum=99;
		String word="bottles";
		while(beerNum>0){
			
			System.out.println(beerNum+ " " + word + " of beer on the wall");
			System.out.println(beerNum+ " " + word + " of beer.");
			System.out.println("Take one dowm.");
			System.out.println("Pass it around.");
			beerNum=beerNum-1;
			if(beerNum==1){
				word="bottle";
			}
			if(beerNum > 0){
				//word="bottle";
				System.out.println(beerNum + " " + word + " first of beer on the wall"); 
				
			}else{
				System.out.println("no more bottle of beer on the wall" );
			}
		}
	}

}


