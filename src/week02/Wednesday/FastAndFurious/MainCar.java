package week02.Wednesday.FastAndFurious;


public class MainCar {
	public static void main(String[] args){
	Car vw = new Volkswagen();
	boolean testing = false;
	System.out.println(vw.isEcoFriendly(testing));
	
	Audi audi = new Audi();
	audi.setMileage(12345);
	
	System.out.println(audi.getMileage());
	}
}
