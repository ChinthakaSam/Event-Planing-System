package com.BlackPearl.web.model;

import java.io.InputStream;
import java.util.ArrayList;

public class Techeq {
	
	private int techId;

	private String techName;

	private String techPackage;
	
	private double price;
	
	private String type;
	
	private InputStream image;
	
	private String filename;

	public int getTechId() {
		return techId;
	}

	public void setTechId(int techId) {
		this.techId = techId;
	}

	public String getTechName() {
		return techName;
	}

	public void setTechName(String techName) {
		this.techName = techName;
	}

	public String getTechPackage() {
		return techPackage;
	}

	public void setTechPackage(String techPackage) {
		this.techPackage = techPackage;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public InputStream getImage() {
		return image;
	}

	public void setImage(InputStream image) {
		this.image = image;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	@Override
	public String toString() {
		return "Techeq [techId=" + techId + ", techName=" + techName + ", techPackage=" + techPackage + ", price="
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
