package Operaciones;


public class Operations {
	private int result = 0;
	public static void main (String arguments[]) {
		
		new Operations().division();		
		new Operations().sum(50,20);
		new Operations().multiplicacion();
	}
	
	private void multiplicacion() {
		int num1 = 3, num2 = 7;
		result = num1 *  num2;
		System.out.println("Outcome " + result);
		
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
