package com.app.fruits;

public class Mango extends Fruits{
//     private String taste;
	public Mango(String color, double weigth, String name) {
		super(color, weigth, name);
//		this.taste=taste;
		// TODO Auto-generated constructor stub
	}
	public String taste()
	{
		return "Sweet";
	}
	public void pulp()
	{
		System.out.println(getColor());
		System.out.println("Creating pulp");
		
		
	}
	public String toString()
	{
		return super.toString()+" "+"Mango taste"+" ";
	}
	
	

}
