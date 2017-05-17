package cn.mldn.myspring.di.vo;

import java.io.Serializable;
import java.util.List;

@SuppressWarnings("serial")
public class CompanyList implements Serializable {
	private String title ;
	private List<String> msgs ;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public List<String> getMsgs() {
		return msgs;
	}
	public void setMsgs(List<String> msgs) {
		this.msgs = msgs;
	}
	@Override
	public String toString() {
		return "CompanyList [title=" + title + ", msgs=" + msgs + " , " + this.msgs.getClass() +  " ]";
	}
	
}
