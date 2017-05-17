package cn.mldn.myspring.di.vo;

import java.io.Serializable;
import java.util.Arrays;

@SuppressWarnings("serial")
public class CompanyArray implements Serializable {
	private String title ;
	private String [] msgs ;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String[] getMsgs() {
		return msgs;
	}
	public void setMsgs(String[] msgs) {
		this.msgs = msgs;
	}
	@Override
	public String toString() {
		return "CompanyArray [title=" + title + ", msgs="
				+ Arrays.toString(msgs) + "]";
	} 
	
	
}
