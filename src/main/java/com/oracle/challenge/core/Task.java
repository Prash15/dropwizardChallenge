package com.oracle.challenge.core;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Task {

	@JsonProperty
	private long id;
	
	@JsonProperty
	private String description;
	
	@JsonProperty
	private String date;
	
	
	public Task(){
		id = 0;
		description = "";
		date = "";
	}
	
	public Task( long id, String description, String date ){
		super();
		this.id = id;
		this.description = description;
		this.date = date;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
}
