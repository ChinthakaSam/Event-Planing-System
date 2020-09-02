package com.BlackPearl.web.model;

import java.io.InputStream;
import java.util.ArrayList;

public class Decorator {

	private int did;

	private String dname;

	private String dpId;
	
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

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDpId() {
		return dpId;
	}

	public void setDpId(String dpId) {
		this.dpId = dpId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	
	@Override
	public String toString() {
		return "Decorator [did=" + did + ", dname=" + dname + ", dpId=" + dpId + ", price=" + price + ", type=" + type
				+ ", image=" + image + ", filename=" + filename + "]";
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
