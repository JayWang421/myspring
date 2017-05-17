package cn.mldn.myspring.jms.queue.provider.service.impl;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.Session;

import org.springframework.context.annotation.PropertySource;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.core.MessageCreator;
import org.springframework.stereotype.Component;

import cn.mldn.myspring.jms.queue.provider.service.IMessageProvider;

@Component
public class MessageProviderImpl implements IMessageProvider {
	@Resource
	private JmsTemplate jmsTemplate ;	// 这个是由Spring提供的一套工具类，帮助用户进行消息发送
	@Resource
	private Destination destination ; 	// 消息发送的目的地
	@Override
	public void sendMessage(String msg) {	// 消息的发送使用的就是JmsTemplate完成
		this.jmsTemplate.send(this.destination, new MessageCreator(){
			@Override
			public Message createMessage(Session session) throws JMSException {
				return session.createTextMessage(msg);
			}
		});
	}
}
