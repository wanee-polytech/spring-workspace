package di.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*
 * 타이어를 장착해서 달릴 수 있도록 할 것이다.
 * 그런데 타이어의 브랜드가 각기 다르므로, 브랜드의 정보를 가지고오려고 한다.
 */

@Component
public class Car {

	@Autowired
	@Qualifier("kumho") // 한국타이어라면 "hankookTire"
	private Tire tire; // 의존관계 발생

	public Car() {
		System.out.println("Car() 호출...");
	}
	
	public Car(Tire tire) {
		this.tire = tire;
		System.out.println("Car(Tire) 호출...");
	}
	
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("setTire(Tire) 호출...");
	}
	
	public void prnTireBrand() {
		System.out.println("장착된 타이어 : " + tire.getBrand());
	}

}
