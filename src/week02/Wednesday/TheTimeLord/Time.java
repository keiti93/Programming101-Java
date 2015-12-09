package week02.Wednesday.TheTimeLord;

import java.util.Date;

public class Time {
	private Date date;
	
	public Time (Date date){
		this.date = date;
	}
	
	@Override
	public String toString(){
		String result = date.getHours() + ":" + date.getMinutes() + ":" + date.getSeconds() + " " + (date.getDate()) + "." + (date.getMonth()) + "." + (date.getYear() + 1900);
		return result;
	}
	
	public static void main(String args[]) {
	       // Instantiate a Date object
		
	       Time t = new Time(new Date());
	       System.out.println(t.toString());

	   }
}
