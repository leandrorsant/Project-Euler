public class Main {
	
	private static boolean isPrime(long n){
		if(n == 0 || n == 1)
			return false;
		
		for(long x = 2; x<n; x++){
			if (n % x ==0)
			return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		int n = 0;
		int x;
		
		for(x=2; n < 10001; x++){
			if(isPrime(x)){
				n++;			
			}
		}
	    System.out.println(x-1);
		
		
	}
}