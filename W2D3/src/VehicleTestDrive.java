import java.util.ArrayList;


public class VehicleTestDrive {

	public static void main(String[] args) {
		
		ArrayList<Asset> assets = new ArrayList<Asset>();
		ArrayList<Object> obj = new ArrayList<Object>();
		ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
		
		CorporateCar car1 = new CorporateCar();
		
		assets.add(car1);
		obj.add(car1);
		vehicles.add(car1);
		car1.setSpeed(56);
		//System.out.println(car1.getSpeed());
		
		for(Vehicle vec : vehicles){
			vec.accelerate();
			vec.brake();
			vec.accelerate();
			System.out.println(vec.getSpeed());
			
		}
		for(Asset ast : assets){
			
			System.out.println(ast.getPurchasePrice());
			
		}
		for(Object obje : obj){
			System.out.println(obje.toString());
		}
		
		
		

	}

}
