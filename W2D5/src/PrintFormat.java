
public class PrintFormat {
	public static void main(String args[]){
		System.out.println("Dec" + "\t" +"Hy" +"\t" + "Oct" + "\t"+"Char");
		for(int i=33;i<=128;i++){
			System.out.printf("%d\t%X\t%o\t%C\t",i,i,i,i);
			System.out.println();
	}

}
}