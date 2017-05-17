package cn.mldn.myspring.resource.util;

import java.util.Scanner;

import org.springframework.core.io.Resource;

public class ResourceUtil {
	private Resource [] src ;	// 定义一个注入的资源数据
	public void setSrc(Resource[] src) {	// 多个资源注入
		this.src = src;
	}
	public void print() throws Exception {
		for (int x = 0 ; x < this.src.length ; x ++) {
			System.out.println(this.src[x].getFilename());
//			Scanner scan = new Scanner(this.src[x].getInputStream()) ;
//			scan.useDelimiter("\n") ;
//			while (scan.hasNext()) {
//				System.out.println(scan.next());
//			}
			System.out.println("++++++++++++++++++++++++ 特别华丽的分割线  ++++++++++++++++++++++++++");
		}
	}
}
