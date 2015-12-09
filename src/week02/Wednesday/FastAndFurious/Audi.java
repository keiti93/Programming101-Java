package week02.Wednesday.FastAndFurious;

public class Audi extends Car {

	private int mileage = 0;
	
	public Audi(int mileage){
		this.mileage = mileage;
	}
	public Audi(){}
	
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	@Override
	boolean isEcoFriendly(boolean testing) {
		// TODO Auto-generated method stub
		return true;
	}
	


}
