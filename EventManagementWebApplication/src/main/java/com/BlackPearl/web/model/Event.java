package com.BlackPearl.web.model;

import java.util.Date;

public class Event {

	private int eid;
	
	private int uid;
	
	private String type;

	private Date dateAndTime;

	private int venue;
	
	private int entertainment;
	
	private int caterer;
	
	private int decorator;
	
	private int photographer;
	
	private int invitation;
	
	private double total;

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getDateAndTime() {
		return dateAndTime;
	}

	public void setDateAndTime(Date dateAndTime) {
		this.dateAndTime = dateAndTime;
	}

	public int getVenue() {
		return venue;
	}

	public void setVenue(int venue) {
		this.venue = venue;
	}

	public int getEntertainment() {
		return entertainment;
	}

	public void setEntertainment(int entertainment) {
		this.entertainment = entertainment;
	}

	public int getCaterer() {
		return caterer;
	}

	public void setCaterer(int caterer) {
		this.caterer = caterer;
	}

	public int getDecorator() {
		return decorator;
	}

	public void setDecorator(int decorator) {
		this.decorator = decorator;
	}

	public int getPhotographer() {
		return photographer;
	}

	public void setPhotographer(int photographer) {
		this.photographer = photographer;
	}

	public int getInvitation() {
		return invitation;
	}

	public void setInvitation(int invitation) {
		this.invitation = invitation;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Event [eid=" + eid + ", uid=" + uid + ", type=" + type + ", dateAndTime=" + dateAndTime + ", venue="
				+ venue + ", entertainment=" + entertainment + ", caterer=" + caterer + ", decorator=" + decorator
				+ ", photographer=" + photographer + ", invitation=" + invitation + ", total=" + total + "]";
	}
	
	
}
