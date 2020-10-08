package com.bah.msd.customerapi.domain;



public class Event {
	
	private Long id;
	private String title;
	private String date;
	private String time;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}

	public Event(Long id, String title, String date, String time) {
		super();
		this.id = id;
		this.title = title;
		this.date = date;
		this.time = time;
	}
	
}

