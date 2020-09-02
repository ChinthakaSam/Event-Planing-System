package com.BlackPearl.web.model;

import java.io.InputStream;
import java.util.ArrayList;

public class Caterer {

	private int cid;

	private String cname;

	private String menuId;
	
	private double pricePerServing;
	
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

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getMenuId() {
		return menuId;
	}

	public void setMenuId(String menuId) {
		this.menuId = menuId;
	}

	public double getPricePerServing() {
		return pricePerServing;
	}

	public void setPricePerServing(double pricePerServing) {
		this.pricePerServing = pricePerServing;
	}

	@Override
	public String toString() {
		return "Caterer [cid=" + cid + ", cname=" + cname + ", menuId=" + menuId + ", pricePerServing="
				+ pricePerServing + ", type=" + type + ", image=" + image + ", filename=" + filename + "]";
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
