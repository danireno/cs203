
public class GarageTestDrive {
	public static void main(String args[]){
		
		Car c1 = new Car();
		Truck t1  = new Truck();
		Garage g1 = new  Garage();
		Item i1= new Item();
		i1.setName("volvo");
		Item i2= new Item();
		i2.setName("merciedise");
		Item i3= new Item();
		i3.setName("Fiat");
		Item i4=new Item();
	    c1.setModel("dani");
		
		
		g1.store(c1);
		g1.store(t1);
		g1.store(i1);
		g1.store(i2);
		g1.store(i3);
		
		
		System.out.println(g1.retrieve(2).getName());
		
		
	}

}
