package com.econetmedia.developer.interview.rest;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by bmukorera on 9/10/2017.
 * modified by vnhira on 25/10/2017
 */

@XmlRootElement
public class SampleRestObject {
    	private String userId;
	private int id;
	private String title;
	private String body;
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	@Override
	public String toString() {
		return "SampleRestObject Data \n { \n userId=" + userId + ", \n id=" + id + ", \n title="
				+ title + ", \n body=" + body + "\n }";
	}
	
}
