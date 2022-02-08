package com.xworkz.oops.Hasa;

public class Bottle {
	private String colour;
	private int price;
	private String type;
	private Cap cap;
	
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setCap(Cap cap) {
		this.cap=cap;
	}
	public Cap getCap() {
		return cap;
		
	}
	public String getAll() {
		String s = colour+"\t"+price+"\t"+type+"\t"+cap.getAll();
		return s;
}
}