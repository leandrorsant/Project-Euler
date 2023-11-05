public class Main {
	private static boolean isPalindrome(int x){
		String number = String.valueOf(x);
		return number.equals( new StringBuffer(number).reverse().toString());
	}
	public static void main(String[] args) {
		int largestFactor=0;
		
		for(int x =100;x<=999;x++){
			for(int y=100;y<=999;y++){
				int currentNumber = x*y;
				if(isPalindrome(currentNumber)){
					if((currentNumber)>largestFactor ){
						largestFactor = currentNumber;
					}
				}
			}
			}
			System.out.println(largestFactor);
		}
}