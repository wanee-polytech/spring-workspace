package basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class HelloMain {

	public static void main(String[] args) {
		
		// ApplicationContext context = new ClassPathXmlApplicationContext("beanContainer.xml");
		// ApplicationContext context = new FileSystemXmlApplicationContext("src/main/resources/beanContainer.xml");
		// Class Path를 쓰기 위해선 src/main/resources 까지 반드시 써줘야 한다.
		ApplicationContext context = new GenericXmlApplicationContext("classpath:beanContainer.xml"); // ("beanContainer.xml"); 이렇게만 적어도 된다			
		
		// 그냥 객체 생성
		Hello obj = (Hello)context.getBean("hello");
		obj.prnMsg();
		
		Hello obj2 = (Hello)context.getBean("hello2");
		obj2.prnMsg();
		
		System.out.println(obj);
		System.out.println(obj2); // obj, obj2의 주소값이 서로 다르다(서로 다른 객체)

		
		// 싱글톤
		HelloSingle obj3 = (HelloSingle)context.getBean("hs");
		// HelloSingle obj3 = context.getBean("hs", HelloSingle.class); 과 같은 형식으로 쓰면 명시적 형변환 없이 사용 가능
		HelloSingle obj4 = (HelloSingle)context.getBean("hs2");
		obj3.prnMsg();
		System.out.println(obj3);
		System.out.println(obj4); // obj3, obj4의 주소값이 똑같이 찍히는 것을 확인할 수 있다.
		
		
	}
}
