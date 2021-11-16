package Done;


// 2번
public class Calculator {
	int num;
	
	public Calculator add(int a) {
		this.num = this.num + a;
		return this;
	}
	
	public Calculator subtract(int b) {
		this.num = this.num - b;
		return this; 
	}
	
	public int out() {
		return this.num;
	}
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		
		int result = calculator.add(4).add(5).subtract(3).out();
		System.out.println(result);
	}
}
