public class smallestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numb=new int[100];
		int y=0;
		for(int i=0;i<numb.length;i++ ){
			int x=(int)(Math.random()*100);
			numb[i]=x;
		
		}
		
		for(int i=0;i<numb.length;i++ ){
			if(numb[i]<numb[i+1]){
				y=numb[i];
 			break;
		}	
			
		}
		System.out.println(y);
		}
		
	}