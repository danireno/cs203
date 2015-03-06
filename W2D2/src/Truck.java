
public class Truck extends Automobile {
	private int CarringCapacity;
	private boolean hasTailGate;
	
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
