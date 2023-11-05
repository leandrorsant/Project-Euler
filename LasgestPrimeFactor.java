public class Main {
	
	private static boolean isPrime(long n){
		for(long x = 2; x<n; x++){
			if (n % x ==0)
			return false;
		}
		return true;
	}
			
	private static boolean primeFactorOf(long n, long x){
		if(isPrime(x))	
			return n % x == 0;
		return false;
	}
	
	public static void main(String[] args) {
		long number = 13195;
		long longestPrimeFactor = 0;
		for(long x = 2; x< number; x++){
			if(primeFactorOf(number, x)){			
					longestPrimeFactor = x;
				
			}
	    }
	    System.out.println(longestPrimeFactor);
		
	}
}