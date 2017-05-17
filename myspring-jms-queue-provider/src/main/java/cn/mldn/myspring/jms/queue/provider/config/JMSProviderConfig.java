package cn.mldn.myspring.jms.queue.provider.config;
import javax.jms.Destination;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jms.connection.SingleConnectionFactory;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;
@Configuration	// 该注解表示本类是一个配置程序类
// 所有的核心的连接信息的配置文件都保存在activemq.properties文件里面
// 以下配置等价于此配置：<context:property-placeholder location="classpath:config/*.properties"/>
@PropertySource(value={"classpath:config/activemq.properties"})
@Component
public class JMSProviderConfig {
	@Value("${brokerURL}")	// 读取指定资源文件的内容，格式“${key}”
	private String brokerURL ;
	@Value("${mldn.queue.name}")
	private String queueName ;
	// 定义JmsTemplate对象类，进行消息发送的操作处理
	// <bean id="jmsTemplate" class="org.springframework.jms.core.JmsTemplate">
	@Bean(name="jmsTemplate") 
	public JmsTemplate getJmsTemplate(SingleConnectionFactory connectionFactory) {
		JmsTemplate jmsTemplate = new JmsTemplate() ;
		// <property name="connectionFactory" ref="connectionFactory"/> 
		jmsTemplate.setConnectionFactory(connectionFactory);
		return jmsTemplate ;
	}
	// 需要定义一个消息发送的目的地的信息
	// <bean id="destination" class="org.apache.activemq.command.ActiveMQQueue">
	@Bean(name="destination")
	public Destination createDestination() {
		ActiveMQQueue amq = new ActiveMQQueue(this.queueName) ;
		return amq ;
	}
	// 如果要想进行发送，则需要将ActiveMQ的处理交由JMS进行控制
	// <bean id="connectionFactory" class="org.springframework.jms.connection.SingleConnectionFactory">
	@Bean(name="connectionFactory") 
	public SingleConnectionFactory createConnectionFactory(ActiveMQConnectionFactory targetConnectionFactory) {
		SingleConnectionFactory scf = new SingleConnectionFactory() ;
		// <property name="targetConnectionFactory" ref="targetConnectionFactory"/>
		scf.setTargetConnectionFactory(targetConnectionFactory);
		return scf ;
	}
	// 现在已经明确给出了要连接的地址信息，而这个地址信息在Spring之中需要通过一个ActiveMQ工厂操作
	// <bean id="targetConnectionFactory" class="org.apache.activemq.ActiveMQConnectionFactory">
	@Bean(name="targetConnectionFactory")
	public ActiveMQConnectionFactory createTargetConnectionFactory() {
		ActiveMQConnectionFactory acf = new ActiveMQConnectionFactory() ;
		acf.setBrokerURL(this.brokerURL);
		return acf ;
	}
}
