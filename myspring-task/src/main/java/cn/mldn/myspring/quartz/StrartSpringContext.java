package cn.mldn.myspring.quartz;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StrartSpringContext {
	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("spring/spring-task.xml");
	}
}
