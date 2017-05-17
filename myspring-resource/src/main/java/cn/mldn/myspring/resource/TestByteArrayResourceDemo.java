package cn.mldn.myspring.resource;

import java.util.Scanner;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.core.io.Resource;
public class TestByteArrayResourceDemo {
	public static void main(String[] args) throws Exception {
		String info = "www.mldn.cn www.mldnjava.cn"; // 要读取的资源
		// 现在通过一个内存资源流的子类为resource接口进行实例化
		Resource res = new ByteArrayResource(info.getBytes());
		// 如果要进行资源读取，那么根本就不需要去关注那个子类为Resource接口实例化，因为所有的操作都是基于接口标准实现的
		Scanner scan = new Scanner(res.getInputStream());
		scan.useDelimiter(" ") ;
		while(scan.hasNext()) {
			System.out.println(scan.next());
		}
		scan.close();
	}
}
