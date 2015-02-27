
public class Car {

	private int x=0;
	private int y=0;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public void MoveUp(){
		y+=1;
	}
	public void MoveDown(){
		y-=1;

	}
	public void Moveright(){
		x+=1;

	}
	public void MoveLeft(){
		x-=1;
	}
	public String returnLocation(){
		
		return "("+ this.x+" "+ this.y+")";
	}
	public void Display(){
		System.out.println(returnLocation());
	}
}



