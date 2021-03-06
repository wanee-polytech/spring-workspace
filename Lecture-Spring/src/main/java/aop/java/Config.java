package aop.java;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/*
 * xml 파일을 읽지 않고 Config 클래스에서 해결
 */

@EnableAspectJAutoProxy // 
@ComponentScan(basePackages = {"aop.java"})
@Configuration
public class Config {

	
	
}
