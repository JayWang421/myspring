package cn.mldn.myspring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.mldn.myspring.ioc.service.IMessage;

public class TestMessageDemo {
	public static void main(String[] args) {
		// 首先需要启动Spring容器，但是这个容器不需要自己来费劲控制，通过一个固定套路，通过固定的配置文件启动容器
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-ioc.xml") ;
		IMessage obj = context.getBean("msg",IMessage.class) ;	// 接收指定的对象，随后按照指定的类型返回
		System.out.println(obj.getInfo());
	}
}
