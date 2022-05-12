package Operaciones;


public class Operations {

	public static void main (String arguments[]) {
		private int result = 0;
		new Operations().division();		
		new Operations().sum();
	}
	
	private void division() {
		int num1 = 100, num2 = 50;
		System.out.println("dividend " + num1);
		System.out.println("divider " + num2);
		result = num1 /  num2;
		System.out.println("Outcome " + result);
	}
	private void sum(int num1, int num2)
	{		
		result = num1 + num2;
		System.out.println("Outcome " + result);
	}
}
