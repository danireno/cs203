
public class Automobile {
private String make;
private String model;
private int year;
private String color;
private int Speed;
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public String getModel() {
	return model;
}
public void setModel(String model) {
	this.model = model;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getSpeedInstance() {
	return Speed;
}

public void setSpeedInstance(int speedInstance) {
	this.Speed = speedInstance;
}

public void move(){
	System.out.print("Room Room");
}
public void Accelarate(){
	this.Speed+=10;
	
}
public void brake(){
	if(Speed>=10)
		this.Speed-=10;
	
}

}

