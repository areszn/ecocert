package com.ocd.ecocert.util;

import java.io.Serializable;

public class JsonResult implements Serializable{
	
	public static final int SUCCESS = 0;
	public static final int ERROR = 1;

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	private class Pager{
		public int page = 1;
		public int recTotal=1001;
		public int recPerPage=10;
	}
	private String result;
	private int state;
	/** 错误消息  */
	private String message;
	/** 返回正确时候的数据 */
	private Object data;

	public Pager getPager() {
		return pager;
	}

	public void setPager(Pager pager) {
		this.pager = pager;
	}

	private Pager pager;

	public JsonResult() {
		pager = new Pager();
	}
	
	public JsonResult(Object data){
		state = SUCCESS;
		result = "success";
		this.data = data;
	}
	public JsonResult(Object data,int page,int total,int recperpage){
		state = SUCCESS;
		result = "success";
		this.data = data;
		pager.page=page;
		pager.recTotal = total;
		pager.recPerPage = recperpage;
	}
	
	public JsonResult(Throwable e) {
		state = ERROR;
		result="error";
		message = e.getMessage();
	}
	
	public JsonResult(int state, Throwable e) {
		this.state = state;
		result="error";
		this.message = e.getMessage();
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "JsonResult [state=" + state + ", message=" + message + ", data=" + data + "]";
	}
	
}
