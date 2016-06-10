package arrays;

abstract class AbstractClass {
}

interface Interface {
}

class Car extends Vehicle {
}

public class Vehicle {
	public void setVehicles(Vehicle c[]) {
		System.out.println(c[0] instanceof Vehicle);
		c[0] = new Vehicle();
	}

	public void setVehicles2(Vehicle c[]) {
		System.out.println(c[0] instanceof Vehicle);
		if (c[0] instanceof Vehicle) {
			c[0] = new Vehicle();
		}
	}

	public void setVehicles3(Car c[]) {
		System.out.println(c[0] instanceof Car);
		if (c[0] instanceof Car) {
			c[0] = new Car();
		}
	}

	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		Vehicle[] vehicleArray = new Car[5];
		try {
			AbstractClass[] abc = new AbstractClass[5];
			Interface[] i = new Interface[5];
			v.setVehicles2(vehicleArray);
			v.setVehicles(vehicleArray); // Exception in thread "main"
											// java.lang.ArrayStoreException:
											// arrays.Vehicle
			// The method setVehicles3(Car[]) in the type Vehicle
			// is not applicable for the arguments (Vehicle[])
			// v.setVehicles3(vehicleArray);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}