
public class SmallestNumber {

	public static void main(String[] args) {
		double[] num=new double[100];
		for(int i=0;i<num.length;i++){
			double rand1=Math.random()*100;
			num[i]=rand1;
			System.out.println(rand1);
			}
		double small=num[0];
		for(int i=0;i<num.length;i++){
			if(num[i]< small){
				small=num[i];
			}
		}
		System.out.println("The smalles number is " + small);

	}

}
