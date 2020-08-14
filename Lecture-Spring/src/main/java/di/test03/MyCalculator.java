package di.test03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component // ���� "myCal"�̶�� id�� getBean�ؼ� �ҷ������� @Component("myCal") �̶�� ǥ��
public class MyCalculator { // Ŭ���� �̸��� ���� �ڵ����� id�� myCalculator�� ������

//	@Value("10")
	private int firstNum;
//	@Value("4")
	private int secondNum;
	
	@Autowired
	private Calculator calculator;
		
	public MyCalculator() {
	}
	
	public MyCalculator(Calculator calculator) {
		super();
		this.calculator = calculator;
	}

	@Autowired
	public MyCalculator(@Value("12")int firstNum, @Value("5")int secondNum, Calculator calculator) {
		super();
		this.firstNum = firstNum;
		this.secondNum = secondNum;
		this.calculator = calculator;
	}

	public void setFirstNum(int firstNum) {
		this.firstNum = firstNum;
	}

	public void setSecondNum(int secondNum) {
		this.secondNum = secondNum;
	}

	public void setCalculator(Calculator calculator) {
		this.calculator = calculator;
	}

	public void add() {
		calculator.addition(firstNum, secondNum);
	}
	
	public void sub() {
		calculator.substration(firstNum, secondNum);
	}
	
	public void mul() {
		calculator.multiplication(firstNum, secondNum);
	}
	
	public void div() {
		calculator.division(firstNum, secondNum);
	}
}