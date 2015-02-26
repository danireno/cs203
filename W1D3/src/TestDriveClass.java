
public class TestDriveClass {
	public static void main(String args[]){
		Hamster[] hamsters =new Hamster[100] ;
		for (int i =0; i < 100; i++) {
			Hamster h = new Hamster();
			h.age = Math.random() * 3;
			hamsters[i] = h;
		}
		int sum=0;
		for(int j=0;j<100;j++){
			sum+=hamsters[j].age;
		}
		System.out.println("avg:" + sum/100);
		
	}

}
