package cn.mldn.myspring.resource;

import java.io.File;
import java.util.Scanner;

import org.springframework.core.io.DefaultResourceLoader;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
public class TestResourceLoaderFileDemo {
	public static void main(String[] args) throws Exception {
		String path = "D:" + File.separator + "info.txt" ;
		ResourceLoader loader = new DefaultResourceLoader() ;	// 获取一个默认的资源加载器
		Resource res = loader.getResource("file:" + path);	// 通过字符串获得了一个资源
		// 如果要进行资源读取，那么根本就不需要去关注那个子类为Resource接口实例化，因为所有的操作都是基于接口标准实现的
		Scanner scan = new Scanner(res.getInputStream());
		scan.useDelimiter(" ") ;
		while(scan.hasNext()) {
			System.out.println(scan.next());
		}
		scan.close();
	}
}
