package day17;


public class PrimeNumbers {
	
	/**
	 * Method to check the prime no
	 * @param n
	 */
	public static void checkPrime(int n) {
		int count=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				count+=1;
			}
		}
		if(count==2) {
			System.out.println(n);
		}
		
	}
	
	/**
	 * Main function to input nos from 0-1000
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter the number for prime check :");
		for(int i=1;i<=1000;i++) {
			checkPrime(i);
		}
		
	}

}
