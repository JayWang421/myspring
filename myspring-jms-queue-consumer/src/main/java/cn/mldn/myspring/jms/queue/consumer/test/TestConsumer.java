package cn.mldn.myspring.jms.queue.consumer.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConsumer {
	public static void main(String[] args) {
		new ClassPathXmlApplicationContext("spring/spring-*.xml") ;
	}
}
