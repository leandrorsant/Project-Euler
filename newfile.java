public class Main {
	private static long f(long num){
		long first=0;
		long second=1;
	    long current = 1;
		for(long x =0; x<num;x++){	
			current = first + second;	
			first = second;
			second = current;
		}
	return current;
	}
	public static void main(String[] args) {
		long limit = 4000000;
		int sum = 0;
		for(long x = 0; x<limit; x++){
			long current = f(x);
			if (current < limit && current %2 ==0){
				sum += current;
			}
		}
		System.out.println(sum);
	}
}