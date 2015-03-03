import java.util.ArrayList;

	public class AverageArrayList {
		
		public static void main(String args[]){
			
			ArrayList<Integer> num = new ArrayList<Integer> ();
			
			for (int i = 0; i < 100; i++){
				int rand = (int)(Math.random()*100);
				
		
				
				num.add(rand);				
			}
			int sum = 0;
			for (int i = 0; i < num.size();i++){
				sum+=num.get(i);
			}
			
			System.out.println((sum)/(100));	
		}


	}

