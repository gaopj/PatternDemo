package gpj.decorator;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class Client {

	public static void main(String[] args) {
		Car car = new Car();
		car.move();
		
		System.out.println("\n增加新功能，飞行————————");
		FlyCar flyCar = new FlyCar(car);
		flyCar.move();

		System.out.println("\n增加新功能，水里游————————");
		WaterCar waterCar = new WaterCar(car);
		waterCar.move();
		
		System.out.println("\n增加两个新功能，天上飞，水里游————————");
		WaterCar waterCar2 = new WaterCar(flyCar);
		waterCar2.move();
		
		//Reader reader= new BufferedReader(new InputStreamReader(new FileInputStream(new File("d:/a.txt"))));
	}

}
