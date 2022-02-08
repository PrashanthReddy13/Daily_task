package com.xworkz.oops.Hasa;

public class Cap {
	private String colour;
	private String size;
	private String shape;
	
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	public String getAll() {
		String s=colour+"\t"+size+"\t"+shape;
		return s;
	}
}
