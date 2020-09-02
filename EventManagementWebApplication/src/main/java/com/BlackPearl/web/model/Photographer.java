package com.BlackPearl.web.model;

import java.io.InputStream;
import java.util.ArrayList;

public class Photographer {

	private int pid;

	private String pname;

	private String ppId;
	
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



	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPpId() {
		return ppId;
	}

	public void setPpId(String ppId) {
		this.ppId = ppId;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	
	@Override
	public String toString() {
		return "Photographer [pid=" + pid + ", pname=" + pname + ", ppId=" + ppId + ", price=" + price + ", type="
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
