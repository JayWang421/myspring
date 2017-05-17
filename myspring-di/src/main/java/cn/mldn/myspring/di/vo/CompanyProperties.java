package cn.mldn.myspring.di.vo;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Properties;

@SuppressWarnings("serial")
public class CompanyProperties implements Serializable {
	private String title ;
	private Properties msgs ;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Properties getMsgs() {
		return msgs;
	}
	public void setMsgs(Properties msgs) {
		this.msgs = msgs;
	}
	@Override
	public String toString() {
		return "CompanyArray [title=" + title + ", msgs="
				+ this.msgs + "]";
	} 
	
	
}
