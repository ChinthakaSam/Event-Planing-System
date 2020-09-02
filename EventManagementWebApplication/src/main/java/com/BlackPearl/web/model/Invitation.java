package com.BlackPearl.web.model;

import java.io.InputStream;
import java.util.ArrayList;

public class Invitation {

	private int iId;

	private String iname;

	private String ipackage;
	
	private double price;
	

	private String type;
	
	private InputStream image;
	
	private String filename;
	
	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}
	
	public InputStream getImage() {
		return image;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}


	public void setImage(InputStream inputStream) {
		this.image = inputStream;
	}



	public int getiId() {
		return iId;
	}

	public void setiId(int iId) {
		this.iId = iId;
	}

	public String getIname() {
		return iname;
	}

	public void setIname(String iname) {
		this.iname = iname;
	}

	public String getIpackage() {
		return ipackage;
	}

	public void setIpackage(String ipackage) {
		this.ipackage = ipackage;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double p) {
		this.price = p;
	}

	@Override
	public String toString() {
		return "Invitation [iId=" + iId + ", iname=" + iname + ", ipackage=" + ipackage + ", price=" + price + ", type="
				+ type + ", image=" + image + ", filename=" + filename + "]";
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
