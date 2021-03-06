package di.xml.n02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 * XML을 이용한 SPRING 생성자 주입
 */

public class DriverMain {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new GenericXmlApplicationContext("di-xml02.xml");
		
		Car car = (Car)context.getBean("car"); // 생성자 주입이 일어남(xml에 constructor-arg 태그 안에 있는 대로 Tire가 셋팅됨)
		
		
		// 그냥 bean만 만들면 생성자 주입이 일어날 수 없다.
		// 		
		
		/*
		 * 기존 생성자 의존성 주입방식
		Tire tire = new HankookTire();
		Car car = new Car(tire);
		*/	

		car.prnTireBrand();		
	
	}
}
