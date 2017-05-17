package cn.mldn.myspring.context;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.mldn.myspring.context.service.IDeptService;
import cn.mldn.myspring.context.vo.Dept;
import junit.framework.TestCase;
// 编写Spring上下文启动的配置注解，该注解需要通过locations去定位要使用的所有配置文件
// 替代了：ApplicationContext context = new ClassPathXmlApplicationContext("spring/spring-common.xml");
@ContextConfiguration(locations = {"classpath:spring/spring-common.xml"})
// 表示现在要采用的测试工具的模式，基于Spring管理的junit测试程序
@RunWith(SpringJUnit4ClassRunner.class)
public class TestDeptServiceTest {
	@Resource(name="dept")
	private IDeptService deptService ;
	@Test
	public void testAdd() {
		Dept vo = new Dept() ;
		vo.setDeptno(10);
		vo.setDname("技术部");
		TestCase.assertTrue(this.deptService.add(vo));
	}
}
