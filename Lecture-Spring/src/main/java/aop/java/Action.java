package aop.java;
/*
 * 공통의 코드만 가지고 있는 기능클래스
 */

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Service;

@Service
@Aspect
public class Action {
	
	@Before("execution(* work())")
	public static void gotoOffice() {
		System.out.println("출근합니다 . . .");
	}
	
	@After("execution(* aop.java.*.work())")
	public static void getoffOffice() {
		System.out.println("퇴근합니다 . . .");
	}

}
