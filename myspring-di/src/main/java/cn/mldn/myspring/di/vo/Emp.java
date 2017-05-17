package cn.mldn.myspring.di.vo;

import java.io.Serializable;
import java.util.Date;

import cn.mldn.myspring.di.util.DateUtil;

@SuppressWarnings("serial")
public class Emp implements Serializable {
	private Long empno ;
	private String ename ;
	private Double sal ;
	private Date hiredate ;
	private DateUtil dateUtil ;
	public void setDateUtil(DateUtil dateUtil) {
		this.dateUtil = dateUtil;
		this.hiredate = this.dateUtil.getFormatDate() ;
	}
	public Long getEmpno() {
		return empno;
	}
	public void setEmpno(Long empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public Date getHiredate() {
		return hiredate;
	}
	public void setHiredate(Date hiredate) {
		this.hiredate = hiredate;
	}
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", sal=" + sal
				+ ", hiredate=" + hiredate + "]";
	}
}
