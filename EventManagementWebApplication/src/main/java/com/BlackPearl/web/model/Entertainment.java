package com.BlackPearl.web.model;

import java.io.InputStream;
import java.util.ArrayList;

public class Entertainment {

	private int entId;

	private String entName;

	private String entPackage;
	
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

	public int getEntId() {
		return entId;
	}

	public void setEntId(int entId) {
		this.entId = entId;
	}

	public String getEntName() {
		return entName;
	}

	public void setEntName(String entName) {
		this.entName = entName;
	}

	public String getEntPackage() {
		return entPackage;
	}

	public void setEntPackage(String entPackage) {
		this.entPackage = entPackage;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	@Override
	public String toString() {
		return "Entertainment [entId=" + entId + ", entName=" + entName + ", entPackage=" + entPackage + ", price="
				+ price + ", type=" + type + ", image=" + image + ", filename=" + filename + "]";
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
