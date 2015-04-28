
public class DigitalCamera {

	private String brand;
	private float resolution;

	public DigitalCamera(String brand, float resolution){
		this.brand = brand;
		this.setResolution(resolution);
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getResolution() {
		return resolution;
	}

	public void setResolution(float resolution) {
		this.resolution = resolution;

		if(this.resolution > 10){
			this.resolution = 10;
		}
	}

	public float getPrice() {
		if(this.resolution <= 6){
			return 99;
		} else {
			return 129;
		}		
	}

	public String toString(){
		StringBuilder builder = new StringBuilder();

		builder.append("Brand: ");
		builder.append(this.brand);
		builder.append("; Resolution: ");
		builder.append(this.resolution);
		builder.append("; Price: ");
		builder.append(this.getPrice());

		return builder.toString();
	}
}



