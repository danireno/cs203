

public class Truck extends Automobile {
	private int CarringCapacity;
	private boolean hasTailGate;
	
	Truck(String make,String model,int year,String color,int carryingCapacity,boolean hasTailgate){
		super(make,model,color);
		
		this.CarringCapacity=CarringCapacity;
		this.hasTailGate=hasTailgate;
	}
	Truck(String make,String model,int year,String color,int carryingCapacity){
		this(make,model,year,"unknown", carryingCapacity,false);
		
	}
	Truck(String make,String model,int carringCapacity){
		super(make,model);
		this.CarringCapacity=CarringCapacity;
		this.hasTailGate=false;
		
	}
	
	public int getCarringCapacity() {
		return CarringCapacity;
	}
	public void setCarringCapacity(int carringCapacity) {
		CarringCapacity = carringCapacity;
	}
	public boolean isHasTailGate() {
		return hasTailGate;
	}
	public void setHasTailGate(boolean hasTailGate) {
		this.hasTailGate = hasTailGate;
	}
	public void Accelarate(){
		this.Speed+=7;
		
		
	}

}

