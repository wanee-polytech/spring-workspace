package di.xml.n01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * 스프링을 통한 속성 주입
 */

public class DriverMain {

	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("di-xml01.xml");	// xml 파일 읽어오기
		
		/* 방법 2 */
		Car car = (Car)context.getBean("car2");
		car.prnTireBrand();
		
		
		/*
		 * 방법 1)
		Car car = (Car)context.getBean("car");
		Tire tire = (Tire)context.getBean("tire");
		car.setTire(tire);
		
		car.prnTireBrand();
		*/
		
		
		/*
		 * 참고 - Basic )
		Car car = new Car();
		
		Tire tire = new HankookTire();
		car.setTire(tire);
		
		car.prnTireBrand();		
		*/		

		
	}
	
}
