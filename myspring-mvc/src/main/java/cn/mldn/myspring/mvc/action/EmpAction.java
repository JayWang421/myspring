package cn.mldn.myspring.mvc.action;

import javax.annotation.Resource;

import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.mldn.myspring.mvc.vo.Emp;

@Controller
@RequestMapping("/pages/emp/*")
public class EmpAction extends AbstractBaseAction{
	/*@RequestMapping("emp_add")
	public String add(Integer empno,String ename,Date hiredate){
		System.out.println("***empno="+empno);
		System.out.println("***ename="+ename);
		System.out.println("***hiredate="+hiredate);
		return null ;
	}*/
	@RequestMapping("emp_add")
	public String add(Emp vo){
		System.out.println("empno="+vo);
		return null ;
	}
	/*//读取资源文件
	@Resource
	private MessageSource messageSource ;
	@RequestMapping("emp_add_pre")
	public String addPre(){
		System.out.println(this.messageSource.getMessage("emp.add.page", null,null));
		System.out.println(this.messageSource.getMessage("vo.add.success", new Object[]{"雇员信息"},null));
		return "emp/emp_add" ;
	}*/
}
