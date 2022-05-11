

public class Operations {

	public static void main (String arguments[]) {
		new Operations().division();		
	}
	
	private void division() {
		int num1 = 100, num2 = 50, result = 0;
		System.out.println("dividend " + num1);
		System.out.println("divider " + num2);
		result = num1 /  num2;
		System.out.println("Outcome " + result);
	}
}
