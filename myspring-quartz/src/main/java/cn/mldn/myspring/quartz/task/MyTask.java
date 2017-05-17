package cn.mldn.myspring.quartz.task;

import java.text.SimpleDateFormat;

public class MyTask {	// 整个的类没有任何的强制性的定义
	protected void executeSelf() {	// 自己定义了一个任务调度执行方法
		System.out.println(
				"【当前日期时间】" + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS")
						.format(new java.util.Date()));
	}

}
