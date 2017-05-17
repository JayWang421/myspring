package cn.mldn.myspring.context.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.mldn.myspring.context.dao.IDeptDAO;
import cn.mldn.myspring.context.service.IDeptService;
import cn.mldn.myspring.context.vo.Dept;

@Service
public class DeptServiceImpl implements IDeptService {
	private String title = "Annotation注解";
	public void setTitle(String title) {
		this.title = title;
	}
	@Resource
	private IDeptDAO deptDAO ;	// 注入完成
	@Override
	public boolean add(Dept vo) {
		System.out.println("############# " + this.title + " - IDeptService业务实现 #############");
		return this.deptDAO.doCreate(vo);
	}

}
