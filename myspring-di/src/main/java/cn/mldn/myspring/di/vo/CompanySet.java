package cn.mldn.myspring.di.vo;

import java.io.Serializable;
import java.util.Set;

@SuppressWarnings("serial")
public class CompanySet implements Serializable {
	private String title ;
	private Set<String> msgs ;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Set<String> getMsgs() {
		return msgs;
	}
	public void setMsgs(Set<String> msgs) {
		this.msgs = msgs;
	}
	@Override
	public String toString() {
		return "CompanyList [title=" + title + ", msgs=" + msgs + " , " + this.msgs.getClass() +  " ]";
	}
	
}
