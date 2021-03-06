package di.basic;

public class DriverMain {
	
	public static void main(String[] args) {
		
		// Tire tire = new HankookTire(); // 외부에서 객체 생성
		Tire tire = new KumhoTire(); 
		
		/* 1. 생성자 주입 */
		// Car car = new Car(tire); // 생성자 주입 코드 - 실제 의존성을 갖고 있는 Car클래스 객체에게 위에서 생성한 의존성이 있는 객체를 넣어주겠다
		
		Car car = new Car();
		car.setTire(tire);
		
		car.prnTireBrand();
	}

}
