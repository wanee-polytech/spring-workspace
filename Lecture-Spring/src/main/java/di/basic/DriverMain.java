package di.basic;

public class DriverMain {
	
	public static void main(String[] args) {
		
		// Tire tire = new HankookTire(); // �ܺο��� ��ü ����
		Tire tire = new KumhoTire(); 
		
		/* 1. ������ ���� */
		// Car car = new Car(tire); // ������ ���� �ڵ� - ���� �������� ���� �ִ� CarŬ���� ��ü���� ������ ������ �������� �ִ� ��ü�� �־��ְڴ�
		
		Car car = new Car();
		car.setTire(tire);
		
		car.prnTireBrand();
	}

}