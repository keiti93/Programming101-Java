package week01.Wednesday;

public class Problem07 {
	
	private static long kthFactorial(int k, int n){
		if (k ==0){ return n;}
		else if (k<0 || n<0){//TODO throw an exception when we know what it is
			}
		
		long fac = n;
		for(int i =0; i<k;i++){
			long temp = fac;
			for (long p=2; p<temp;p++){
				fac *= p;
			}
		}
		return fac;
	}
public static void main(String[] args){
	System.err.println(kthFactorial(2,4));
}
}
