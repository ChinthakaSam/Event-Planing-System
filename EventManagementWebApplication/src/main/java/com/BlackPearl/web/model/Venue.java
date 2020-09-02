package com.BlackPearl.web.model;

import java.io.InputStream;
import java.util.ArrayList;

public class Venue {

	private int vid;

	private String vname;

	private String adress;
	
	private double price;
	
	private String hallno;
	
	private String type;
	
	private InputStream image;
	
	private int numberOfguests;
	
	private String filename;
	

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public int getNumberOfguests() {
		return numberOfguests;
	}

	public void setNumberOfguests(int numberOfguests) {
		this.numberOfguests = numberOfguests;
	}

	public InputStream getImage() {
		return image;
	}

	public void setImage(InputStream inputStream) {
		this.image = inputStream;
	}

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getHallno() {
		return hallno;
	}

	public void setHallno(String hallno) {
		this.hallno = hallno;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	

	@Override
	public String toString() {
		return "Venue [vid=" + vid + ", vname=" + vname + ", adress=" + adress + ", price=" + price + ", hallno="
				+ hallno + ", type=" + type + ", image=" + image + ", numberOfguests=" + numberOfguests + ", filename="
				+ filename + "]";
	}

	public static int generateIDs(ArrayList<Integer> arrayList) {

		int id;
		int next = arrayList.size();
		next++;
		id = 1 + next;
		if (arrayList.contains(id)) {
			next++;
			id = 1 + next;
		}
		return id;
	}
	
	
}
