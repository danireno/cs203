import java.util.ArrayList;
public class AutomobileTestDrive {
	public static void main(String args[]){
		ArrayList<Automobile>auto=new ArrayList<Automobile>();
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		
		Truck truck1 = new Truck();
		Truck truck2 = new Truck();
		
		car1.setModel("toyota");
		truck1.setModel("iveco");
		car2.setModel("renault");
		truck2.setModel("scania");
		truck2.setSpeedInstance(20);
		car2.setSpeedInstance(70);
		car2.Accelarate();
		
		auto.add(car1);
		auto.add(truck1);
		auto.add(car2);
		auto.add(truck2);
		System.out.println(car1.getModel());
		
		
		for(Automobile vehicule : auto){
			
			vehicule.Accelarate();
			vehicule.Accelarate();
			vehicule.Accelarate();
			//vehicule.getModel();
			vehicule.brake();
			System.out.println(vehicule.getSpeedInstance());
			//System.out.println(vehicule.getModel());

			
			
			
		}
		
	}

}
