package cn.mldn.myspring.di.vo;

import java.io.Serializable;
import java.util.Map;

@SuppressWarnings("serial")
public class CompanyMap implements Serializable {
	private String title ;
	private Map<String,Dept> depts  ;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Map<String, Dept> getDepts() {
		return depts;
	}
	public void setDepts(Map<String, Dept> depts) {
		this.depts = depts;
	}
	@Override
	public String toString() {
		return "CompanyMap [title=" + title + ", depts=" + depts + " , " + this.depts.getClass()+ "]";
	}
	
}
