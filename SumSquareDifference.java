public class Main {
	private static int sumOfSquares(int n){
		int sum = 0;
		for(int x=1;x<=n;x++){
			sum+= Math.pow(x,2);
		}
		return sum;
	}
	
	private static int squareOfTheSum(int n){
		int sum = 0;
		for(int x=1;x<=n;x++){
			sum+= x;
		}	
		return (int) Math.pow(sum,2);
	}
	public static void main(String[] args) {
				
		System.out.println(squareOfTheSum(100)-sumOfSquares(100));
	
	}
}