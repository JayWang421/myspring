package cn.mldn.myspring.di.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.mldn.myspring.di.vo.Emp;

public class TestEmpDemo {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("spring/*.xml") ;
		System.out.println(context.getBean("emp",Emp.class));
	}
}
