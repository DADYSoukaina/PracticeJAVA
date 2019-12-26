package basics;

public class Exercice1 {

	public int calculate(int leftOperand, String Operation, int rightOperand) {
		int result = 0;

		switch (Operation) {
		case "+":
			result = leftOperand + rightOperand;
			break;
		case "-":
			result = leftOperand - rightOperand;
			break;
		case "*":
			result = leftOperand * rightOperand;
			break;
		case "/":
			result = leftOperand / rightOperand;
			break;

		default:
			break;
		}

		return result;
	}

	public static void main(String[] args) {
		Exercice1 a = new Exercice1();
		int result = a.calculate(1, "+", 1);
		System.out.println(result);
	}

}
