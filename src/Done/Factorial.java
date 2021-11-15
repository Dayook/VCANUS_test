package Done;

public class Factorial {
		// 3번
		public static int factorial(int num) {
			if(num == 1) {
				return 1;
			}
			return num * factorial(num - 1);
		}
		
		// 4번 
		public static int factorial2(int num) {
			int[] factorialArr = new int[num + 1];
			factorialArr[1] = 1; 
			for(int i = 2; i < num + 1; i++) {
				factorialArr[i] = factorialArr[i-1] * i;
			}
			return factorialArr[num];
		}
		
	public static void main(String[] args) {
		// 3번
		System.out.println(factorial(4));
				
		// 4번
		System.out.println(factorial2(9));
	}
}
