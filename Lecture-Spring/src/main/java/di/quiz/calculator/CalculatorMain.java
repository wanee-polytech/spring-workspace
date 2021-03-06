package di.quiz.calculator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class CalculatorMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("di-calculator.xml");
		
		// ��� 1
		Calculator cal = (Calculator) context.getBean("cal");
		
		cal.plus();
		cal.minus();
		cal.multiple();
		cal.divide();
		
		
		// ��� 2		
		// int firstNum = Integer.valueOf((String) context.getBean("first"));
		// int firstNum = Integer.parseInt(context.getBean("first").toString());
		int firstNum = (int) context.getBean("first");
		int secondNum = (int) context.getBean("second");
		
		cal.addition(firstNum, secondNum);
		cal.subtraction(firstNum, secondNum);
		cal.multipulation(firstNum, secondNum);
		cal.division(firstNum, secondNum);
		
		
		
		
	}

}
