package com.app.fruits;

public class Fruits {
	private String color;
	private double weigth;
	private String name;
	private boolean fresh;
	
	
	
	public Fruits(String color, double weigth, String name) {

		this.color = color;
		this.weigth = weigth;
		this.name = name;
        this.fresh = true;
		
	}
     
	
	public void setColor(String color) {
		this.color = color;
	}


	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	public void setFresh(boolean fresh) {
		this.fresh = fresh;
	}
	


	public String getColor() {
		return color;
	}


	public double getWeigth() {
		return weigth;
	}


	public String getName() {
		return name;
	}
	

     public boolean isFresh() {
		return fresh;
	}


	public String taste()
     {
    	return "no sepcific taste"; 
     }
	


	@Override
	public String toString() {
		return "Fruits [color=" + color + ", weigth=" + weigth + ", name=" + name + ", fresh=" + fresh + "]";
	}
	
	
	
	
  
}
