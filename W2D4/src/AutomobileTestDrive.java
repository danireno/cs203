
import java.util.ArrayList;
public class AutomobileTestDrive {
	public static void main(String args[]){
		ArrayList<Automobile>auto=new ArrayList<Automobile>();
		Car car1 = new Car("nisanW","BMw",1920,"red",true,90);
		
		
		auto.add(car1);
		
		System.out.println(car1.getModel());
		
		
		for(Automobile vehicule : auto){
			
			vehicule.Accelarate();
			vehicule.Accelarate();
			vehicule.Accelarate();
			//vehicule.getModel();
			vehicule.brake();
			System.out.println(vehicule.getMake());
			System.out.println(vehicule.getModel());
			System.out.println(vehicule.getYear());
			System.out.println(vehicule.getColor());
			
			
			
			
			//System.out.println(vehicule.getModel());

			
			
			
		}
		
	}

}
