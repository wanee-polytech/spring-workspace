package di.quiz.calculator;

public class Calculator {
	
	// ������ ��
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

	
	// �Ű������� �Է� �޾ƿ��� - setter
	public void addition(int firstNum, int secondNum) {
		System.out.println("�� ���� ���� �� : " + (firstNum + secondNum) );
	}
	
	public void subtraction(int firstNum, int secondNum) {
		System.out.println("�� ���� �� �� : " + (firstNum - secondNum) );
	}
	
	public void multipulation(int firstNum, int secondNum) {
		System.out.println("�� ���� ���� �� : " + (firstNum * secondNum) );
	}
	
	public void division(int firstNum, int secondNum) {
		System.out.println("�� ���� ���� �� : " + (firstNum / secondNum) );
	}
	
	
	// �����ÿ� ���� ���õ�?? - ������ ����
}