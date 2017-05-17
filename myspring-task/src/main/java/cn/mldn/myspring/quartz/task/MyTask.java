package cn.mldn.myspring.quartz.task;

import java.text.SimpleDateFormat;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
public class MyTask {	// 整个的类没有任何的强制性的定义
	@Scheduled(cron="* * * * * ?") 	// 每秒一触发
	public void runJob() {	// 自己定义了一个任务调度执行方法
		System.out.println(
				"【MyTask - 当前日期时间】" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS")
						.format(new java.util.Date()));
	}
}
