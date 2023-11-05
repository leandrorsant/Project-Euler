public class Main {
	public static int nthFibonacciTerm(int n) {
    	double squareRootOf5 = Math.sqrt(5);
    	double phi = (1 + squareRootOf5)/2;
    	int nthTerm = (int) ((Math.pow(phi, n) - Math.pow(-phi, -n))/squareRootOf5);
    	return nthTerm;
	}
	
	public static void main(String[] args) {
		int limit = 4000000;
		int sum = 0;
		for(int x = 0; x<limit; x++){
			
			int current = nthFibonacciTerm(x);
			
			if(current > limit)
			 	break;
			
			if (current < limit && current %2 ==0){
				sum += current;
			}
		}
		System.out.println(sum);		
	}
}