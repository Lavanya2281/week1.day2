package week1.day2.assignments;

public class TwoWheeler {
	
	int noOfWheels = 2;
	short noOfMirrors = 2;
	long chassisNumber = 23469658779L;
	boolean isPunctured = false;
	String bikeName = "HONDA ACTIVA";
	double runningKM = 1200.500;
	
	public static void main(String[] args) {
		TwoWheeler obj = new TwoWheeler ();
		System.out.println("Number of Wheels is " + obj.noOfWheels);
		System.out.println("Number of Mirrors is " + obj.noOfMirrors);
		System.out.println("Chassis Number is " + obj.chassisNumber);
		System.out.println("Is Tyre punctured? " + obj.isPunctured);
		System.out.println("Name of the bike is " + obj.bikeName);
		System.out.println("Kilometer ran " + obj.runningKM);
	}
}
