
public class Car extends Automobile {
	private boolean convertable;
	private int truckCapacity;
	
	Car(String make,String model,int year,String color,boolean convertable,int truckCapacity ){
		super(make,model,year,color);
		this.convertable=convertable;
		this.truckCapacity=truckCapacity;
		
	}
	Car(String make,String model,int year,int truckCapacity, String color){
		this(make,model,year,color,false,truckCapacity);
	}
	Car(String make,String model,int truckCapacity ){
		super(make,model);
		this.convertable=false;
		this.truckCapacity=truckCapacity;
	}
	public boolean isConvertable() {
		return convertable;
	}
	public void setConvertable(boolean convertable) {
		this.convertable = convertable;
	}
	public int getTruckCapacity() {
		return truckCapacity;
	}
	public void setTruckCapacity(int truckCapacity) {
		this.truckCapacity = truckCapacity;
	}
	public void accelerate(){
		this.Speed=this.Speed+12;
	}
	
	}

