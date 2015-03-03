import java.util.LinkedList;


public class AverageLinkedList {
	public static void main(String args[]){
		
		LinkedList<Integer> num = new LinkedList<Integer> ();
		
		for (int i = 0; i < 100; i++){
			int rand = (int)(Math.random()*100);
			
	
			
			num.add(rand);				
		}
		int sum = 0;
		for (int i = 0; i < num.size();i++){
			sum+=(int)num.get(i);
		}
		
		System.out.println((sum)/(100));	
	}

}
