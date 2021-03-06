package di.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/*
 * XML을 이용한 SPRING 생성자 주입
 */

public class DriverMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class); // import 해오는 개념이라 path를 따로 써주지 않는다.
		// @Configuration 어노테이션에 있는 config파일을 읽어서 context 객체를 만들어주겠다
			
		Car car = context.getBean("car", Car.class); // 클래스 이름의 첫번째 글자를 소문자로 써주겠다.
		car.prnTireBrand();
	}
}
