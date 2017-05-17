package cn.mldn.myspring.jms.queue.provider.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.mldn.myspring.jms.queue.provider.service.IMessageProvider;

@ContextConfiguration(locations = {"classpath:spring/spring-*.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestMessageProvider {
	@Resource
	private IMessageProvider messageProvider ;
	@Test
	public void testSendMessage() {
		this.messageProvider.sendMessage("www.mldn.cn");
	}
}
