

import java.util.Scanner;

public class TestDigitalCamera {
	public static void main(String[] args) {
		DigitalCamera[] dc = new DigitalCamera[4];

		Scanner scanner = new Scanner(System.in);

		String brand;
		float resolution;

		for (int i = 0; i < 4; i++) {
			System.out.print("Brand: ");
			brand = scanner.next();
			System.out.print("Resolution: ");
			resolution = scanner.nextFloat();

			dc[i] = new DigitalCamera(brand, resolution);
		}


		dc[0].setResolution(30);

		for (int i = 0; i < 4; i++) {
			System.out.println(dc[i]);
		}
		/*Brand: Sony 
Resolution: 30
Brand: Hp
Resolution: 10
Brand: cannon 
Resolution: 1
Brand: nikon
Resolution: 2
Brand: Sony; Resolution: 10.0; Price: 129.0
Brand: Hp; Resolution: 10.0; Price: 129.0
Brand: cannon; Resolution: 1.0; Price: 99.0
Brand: nikon; Resolution: 2.0; Price: 99.0*/

	}
}




