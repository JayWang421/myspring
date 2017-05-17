package cn.mldn.myspring.quartz.task;

import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
@Component
public class MyTaskSecond {	// 整个的类没有任何的强制性的定义
	@Scheduled(cron="0 * * * * ?") 	// 每秒一触发
	public void runJob() {	// 自己定义了一个任务调度执行方法
		try {
			TimeUnit.MINUTES.sleep(20);	// 休眠20分钟
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(
				"【MyTaskSecond - 当前日期时间】" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS")
						.format(new java.util.Date()));
	}
}
