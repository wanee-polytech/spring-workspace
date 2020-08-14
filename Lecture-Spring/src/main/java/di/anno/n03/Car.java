package di.anno.n03;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/*
 * Ÿ�̾ �����ؼ� �޸� �� �ֵ��� �� ���̴�.
 * �׷��� Ÿ�̾��� �귣�尡 ���� �ٸ��Ƿ�, �귣���� ������ ������������ �Ѵ�.
 * 
 * "annotation�� ����� �̿��� ����"
 */

public class Car {

//	@Resource(name="hankook")
	@Resource
	private Tire tire; // �������� �߻�

	public Car() {
		System.out.println("Car() ȣ�� . . .");
	}

	// ������ ����
//	@Resource // @Resource�� ������ ������ ����� �� ����!
	public Car(Tire tire) {
		this.tire = tire;
		System.out.println("Car(tire) ȣ�� . . .");
	}

	// �Ӽ�����(Setter ����)
//	@Resource
	public void setTire(Tire tire) {
		this.tire = tire;
		System.out.println("setTire(Tire) ȣ�� . . .");
	}

	public void prnTireBrand() {
		System.out.println("������ Ÿ�̾� : " + tire.getBrand());
	}

}