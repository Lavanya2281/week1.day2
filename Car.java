package week1.day2.assignments;

public class Car {
public static void main(String[] args) {
	Car obj = new Car ();
	obj.applyBreak();
	obj.applyGear();
	System.out.println("Is AC Switched on? " + obj.switchOnAC());
	System.out.println("Is accelerator applied? " + obj.applyAccelerate());
}
	
	public void applyBreak() {
		System.out.println("Break is applied in the car");				
	}
	
	public void applyGear() {
		System.out.println("Gear is applied in the car");					
	}
	
	public boolean switchOnAC() {
		boolean AC = true;
		return AC;				
	}
	
	public boolean applyAccelerate() {
		boolean Accelerate = false;
		return Accelerate;					
	}
}
