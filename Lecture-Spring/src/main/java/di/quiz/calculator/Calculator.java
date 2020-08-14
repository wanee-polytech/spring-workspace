package di.quiz.calculator;

public class Calculator {
	
	// 고정된 수
	public void plus() {
		System.out.println("15 + 4 = " + (15 + 4));	
	}
	
	public void minus() {
		System.out.println("15 - 4 = " + (15 - 4));			
	}
	
	public void multiple() {
		System.out.println("15 * 4 = " + (15 * 4));			
	}
	
	public void divide() {
		System.out.println("15 / 4 = " + (15 / 4));			
	}

	
	// 매개변수로 입력 받아오기 - setter
	public void addition(int firstNum, int secondNum) {
		System.out.println("두 수를 더한 값 : " + (firstNum + secondNum) );
	}
	
	public void subtraction(int firstNum, int secondNum) {
		System.out.println("두 수를 뺀 값 : " + (firstNum - secondNum) );
	}
	
	public void multipulation(int firstNum, int secondNum) {
		System.out.println("두 수를 곱한 값 : " + (firstNum * secondNum) );
	}
	
	public void division(int firstNum, int secondNum) {
		System.out.println("두 수를 나눈 값 : " + (firstNum / secondNum) );
	}
	
	
	// 생성시에 값이 셋팅된?? - 생성자 주입
}
