
public class StaticCarTestDrive {
    public static void main (String[] args) {
	        
	        StaticCar one = new StaticCar();
	        StaticCar two = new StaticCar();
	        
	        StaticCar.setX(one, 3);
	        StaticCar.setY(one, 3);
	        
	        StaticCar.setX(two, -3);
	        StaticCar.setY(two, -3);
	        
	        StaticCar.setName(one, "Car 1");
	        StaticCar.setName(two, "Car 2");
	        
	        StaticCar.moveDown(one, 1);
	        StaticCar.moveRight(one, 1);
	        StaticCar.moveRight(one, 1);
	        StaticCar.moveDown(one, 1);
	        
	        StaticCar.moveUp(two, 1);
	        StaticCar.moveLeft(two, 1);
	        StaticCar.moveLeft(two, 1);
	        StaticCar.moveUp(two, 1);
	        
	        StaticCar.setLocation(one, "Car 1 is at X: " 
	                + StaticCar.getX(one) + ", Y: " + StaticCar.getY(one));
	        StaticCar.setLocation(two,  "Car 2 is at X: " 
	                + StaticCar.getX(two) + ", Y: " + StaticCar.getY(two));
	        
	        System.out.println(StaticCar.getLocation(one));
	        System.out.println(StaticCar.getLocation(two));
	    } 
	}


