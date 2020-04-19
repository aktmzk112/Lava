package net_test.db;

import java.sql.*;
import java.text.*;
public class Dvo {
	private int tno;
	private String name,area , sdate;
	private char scode;
	private Time jtime;
	private Date jdate;
	public int getTno() {
		return tno;
	}
	public void setTno(int tno) {
		this.tno = tno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getSdate() {
		return sdate;
	}
	
	public void setSdate() {
		SimpleDateFormat from1 = new SimpleDateFormat("yyyy³â MM¿ù ddÀÏ");
		SimpleDateFormat from2 = new SimpleDateFormat("HH:mm");
		String str = from1.format(jdate)+" "+from2.format(jtime);
		this.sdate = str;
	}
	public void setSdate(String sdate) {
		this.sdate = sdate;
	}
	public char getScode() {
		return scode;
	}
	public void setScode(char scode) {
		this.scode = scode;
	}
	public Time getJtime() {
		return jtime;
	}
	public void setJtime(Time jtime) {
		this.jtime = jtime;
	}
	public Date getJdate() {
		return jdate;
	}
	public void setJdate(Date jdate) {
		this.jdate = jdate;
	}
	
	
}
