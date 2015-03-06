
public class Car {
	private int x=0;
	private int y=0;
	//int $dan=1;
	
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
	public void printLocation(){
		System.out.println("("+ this.x+" "+ this.y+")");
	}

}
