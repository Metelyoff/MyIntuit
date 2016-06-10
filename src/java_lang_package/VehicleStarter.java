package java_lang_package;

interface Vehicle {
	void go();
}

class Automobile implements Vehicle {
	public void go() {
		System.out.println("Automobile go!");
	}
}

class Truck implements Vehicle {
	public Truck(int i) {
		super();
	}

	public void go() {
		System.out.println("Truck go!");
	}
}

public class VehicleStarter {
	public static void main(String[] args) {
		Vehicle vehicle = null;
		String[] vehicleNames = { "java_lang_package.Automobile", "java_lang_package.Truck", "java_lang_package.Tank" };
		for (int i = 0; i < vehicleNames.length; i++) {
			try {
				String name = vehicleNames[i];
				System.out.println("look for class for: " + name);
				Class<?> aClass = Class.forName(name);
				System.out.println("creating vehicle...");
				vehicle = (Vehicle) aClass.newInstance();
				System.out.println("create vehicle: " + vehicle.getClass());
				vehicle.go();
			} catch (ClassNotFoundException e) {
				System.out.println("Exception: " + e);
			} catch (IllegalAccessException e) {
				System.out.println("Exception: " + e);
			} catch (InstantiationException e) {
				System.out.println("Exception: " + e);
			}
		}
	}
}