public class Main {
	private static boolean isDivisibleFrom(int n,int from,int to){
		for(int x=from;x<to;x++){
			if(!(n % x == 0))
				return false;
			
		}
		return true;
	}
	public static void main(String[] args) {
		int smallestMultiple = 1;
		while(!isDivisibleFrom(smallestMultiple, 1, 20)){
			smallestMultiple++;
		}
		System.out.println(smallestMultiple);
	}
}