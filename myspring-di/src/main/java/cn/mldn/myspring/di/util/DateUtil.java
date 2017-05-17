package cn.mldn.myspring.di.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
	private String pattern ; 	// 进行模式匹配的符号
	private String date ;	// 要格式化的日期数据
	private SimpleDateFormat sdf ;	
	public DateUtil() {
		this.sdf = new SimpleDateFormat("yyyy-MM-dd") ;
	}
	public DateUtil(String pattern) {	// 可以由外部传入格式化处理
		this.pattern = pattern ;
		this.sdf = new SimpleDateFormat(pattern) ;
	}
	public void setDate(String date) {	// Spring的注入需要通过setter方式完成处理
		this.date = date; 
	}
	public Date getFormatDate() {
		try {
			return this.sdf.parse(this.date) ;
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null ;
	}
}
