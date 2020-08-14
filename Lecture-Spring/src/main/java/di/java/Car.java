package di.java;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/*
 * Ÿ�̾ �����ؼ� �޸� �� �ֵ��� �� ���̴�.
 * �׷��� Ÿ�̾��� �귣�尡 ���� �ٸ��Ƿ�, �귣���� ������ ������������ �Ѵ�.
 */

@Component
public class Car {

	@Autowired
	@Qualifier("kumho") // �ѱ�Ÿ�̾��� "hankookTire"
	private Tire tire; // �������� �߻�

	public Car() {
		System.out.println("Car() ȣ��...");
	}
	
	public Car(Tire tire) {
		this.tire = tire;
		System.out.println("Car(Tire) ȣ��...");
	}
	
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("setTire(Tire) ȣ��...");
	}
	
	public void prnTireBrand() {
		System.out.println("������ Ÿ�̾� : " + tire.getBrand());
	}

}