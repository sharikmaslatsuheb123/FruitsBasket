package com.app.fruits;

public class Apple extends Fruits {
	
	

	public Apple(String name, double weigth, String color) {
		super(name, weigth, color);
		// TODO Auto-generated constructor stub
	}
	
	
     
		
	
     

      
	public String taste()
	{
		return "Sweet and sour";
	}
	public void jam()
	{ 
	   
	   System.out.println(getName());
		System.out.println("making jam");
		
		
	}
	public String toString()
	{
		return super.toString()+" "+"Apple taste"+" ";
	}


	

}
