package di.quiz.shapes;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class AreaMain {

	public static void main(String[] args) {
		
		ApplicationContext container = new GenericXmlApplicationContext("di-shapeContainer.xml");
		
		Area area = container.getBean("area", Area.class);
		
		area.prnArea();
		
	}
}
