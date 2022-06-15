package week1.day2.assignments;

public class MyCar {
public static void main(String[] args) {
	Car obj = new Car ();
	obj.applyBreak();
	obj.applyGear();
	System.out.println("Is AC Switched on? " + obj.switchOnAC());
	System.out.println("Is accelerator applied? " + obj.applyAccelerate());
}
}
