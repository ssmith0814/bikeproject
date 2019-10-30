package bikeproject;

public class BikeDriver {

	public static void main(String[] args) {
		
		RoadBike bike1 = new RoadBike();
		RoadBike bike2 = new RoadBike("drop", "tourer", "semi-grip", "comfort", 14, 25, 18);		
		MountainBike bike3 = new MountainBike();
		Bike bike4 = new Bike("bullhorn", "banana", "fat", "cushy", 82);

		System.out.println(bike1.toString());
		System.out.println(bike2.toString());
		System.out.println(bike3.toString());
		//bike3.abstring();
		MountainBike bike = new MountainBike("bullhorn", "banana", "fat", "cushy", 82, "firm", "water", 5);

		//bike4.printDescription();

		Bike myBikes[] = {bike1, bike2, bike3};//polymorphism
		for (Bike b : myBikes){
			System.out.println(b.toString());//polymorphismmm
			//virtual method invocation
		}

	}//end method main

}//end class BikeDriver
