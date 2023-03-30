package com.guitarcenter.entities;

import java.io.Serializable;

import org.springframework.data.cassandra.core.mapping.PrimaryKeyClass;

@PrimaryKeyClass
public class ActiveLineStatusKey implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String ORDER_HEADER_KEY;
	
	private String ORDER_LINE_KEY;

	public String getORDER_HEADER_KEY() {
		return ORDER_HEADER_KEY;
	}

	public void setORDER_HEADER_KEY(String oRDER_HEADER_KEY) {
		ORDER_HEADER_KEY = oRDER_HEADER_KEY;
	}

	public String getORDER_LINE_KEY() {
		return ORDER_LINE_KEY;
	}

	public void setORDER_LINE_KEY(String oRDER_LINE_KEY) {
		ORDER_LINE_KEY = oRDER_LINE_KEY;
	}
	
	public ActiveLineStatusKey() {
	}
	
}
