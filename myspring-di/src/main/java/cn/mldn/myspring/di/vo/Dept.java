package cn.mldn.myspring.di.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Dept implements Serializable {
	private Integer deptno ;
	private String dname ;
	private Emp mgr ;
	public void setMgr(Emp mgr) {
		this.mgr = mgr;
	}
	public Emp getMgr() {
		return mgr;
	}
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", mgr=" + mgr
				+ "]";
	}
}
