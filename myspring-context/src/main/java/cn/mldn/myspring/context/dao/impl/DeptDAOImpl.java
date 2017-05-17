package cn.mldn.myspring.context.dao.impl;

import org.springframework.stereotype.Repository;

import cn.mldn.myspring.context.dao.IDeptDAO;
import cn.mldn.myspring.context.vo.Dept;
@Repository
public class DeptDAOImpl implements IDeptDAO {
	@Override
	public boolean doCreate(Dept vo) {
		System.out.println("*** 【DeptDAO层】" + vo);
		return true;
	}

}
