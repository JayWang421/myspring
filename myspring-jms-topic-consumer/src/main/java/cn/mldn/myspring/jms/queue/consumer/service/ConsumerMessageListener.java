package cn.mldn.myspring.jms.queue.consumer.service;

import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.TextMessage;

import org.springframework.stereotype.Component;

@Component
public class ConsumerMessageListener implements MessageListener {

	@Override
	public void onMessage(Message message) {	// 一旦有消息则自动执行此方法
		if (message instanceof TextMessage) {	// 之前发送的是一个文本信息，现在判断如果是文本信息则接收
			TextMessage textMsg = (TextMessage) message ;	// 接收发送的消息信息
			try {
				System.out.println("*** 【接收到新消息】" + textMsg.getText());
			} catch (JMSException e) {
				e.printStackTrace();
			}
		}
	}

}
