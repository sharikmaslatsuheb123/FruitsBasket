package com.app.fruits;

public class Orange extends Fruits {
   
	public Orange(String color, double weigth, String name) {
		super(color, weigth, name);
	
		// TODO Auto-generated constructor stub
	}
	public String taste()
	{
		return "sour";
	}
	public void juice()
	{
		System.out.println(getWeigth());
		System.out.println("Extracting jucie");
		
		
	}
	public String toString()
	{
		return super.toString()+" "+"Orange taste"+" ";
	}
	

}
