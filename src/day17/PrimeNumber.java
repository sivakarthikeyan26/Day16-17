package day17;

public class PrimeNumber {
	static int r=0;
	static int col=0;
	static int[][] arr = new int[10][100];
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
			if(col<99) {
				arr[r][col]=n;
				col++;
			}
			else {
				arr[r][col]=n;
				r=r+1;
				col=0;
			}
		}
		
	}
	public static void display() {
		for(int i=0; i<10; i++) {
			for(int j=0; j<100;j++) {
				System.out.print(" " +arr[i][j]);
			}
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		for(int i=1;i<=1000;i++) {
			checkPrime(i);
		}
		display();
	}

}
