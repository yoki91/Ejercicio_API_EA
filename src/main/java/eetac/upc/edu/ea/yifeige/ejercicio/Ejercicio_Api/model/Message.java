package eetac.upc.edu.ea.yifeige.ejercicio.Ejercicio_Api.model;

public class Message 
{
	private String content;
	
	private int messageid;
	
	private int userid;
	
	public String getContent() 
	{
		return content;
	}
	public void setContent(String content) 
	{
		this.content = content;
	}
	
	public int getMessageid() {
		return messageid;
	}
	public void setMessageid(int messageid) {
		this.messageid = messageid;
	}
	
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}

}
