package com.app.tester;
import java.util.Scanner;
import com.app.fruits.Fruits;
import com.app.fruits.Apple;
import com.app.fruits.Mango;
import com.app.fruits.Orange;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fruits[] FruitBasket=new Fruits[3];
		
		Scanner sc=new Scanner(System.in);
	    int index=0;
	    Mango m=null;
	    Orange o=null;
	    Apple a=null;
	    int choice;
	    do
	    {
	    	System.out.println("Enter the choice");
	    	choice=sc.nextInt();
	    	switch(choice)
	    	{
	    	case 1:
	    		 System.out.println("1:Add mango");
	    	
	    	   if(index < FruitBasket.length)
	    	  {   
//	            Mango m=new Mango(sc.next(),sc.nextDouble(),sc.next());
	    		m=new Mango(sc.next(),sc.nextDouble(),sc.next());
	    		FruitBasket[index]=m;
	    		index++;
	    		
	    	   }
	    	   break;
	    	case 2:
	    		 System.out.println("2:Add Orange");
	 	    	
		    	   if(index < FruitBasket.length)
		    	  {   
//		            Mango m=new Mango(sc.next(),sc.nextDouble(),sc.next());
		    		o=new Orange(sc.next(),sc.nextDouble(),sc.next());
		    		FruitBasket[index]=o;
		    		index++;
		    		
		    	   }
		    	   break;
	    	case 3:
	    		  System.out.println("3:Add Apple");
	    		
	  	    	
		    	   if(index < FruitBasket.length)
		    	  {   
//		            Mango m=new Mango(sc.next(),sc.nextDouble(),sc.next());
		    		a=new Apple(sc.next(),sc.nextDouble(),sc.next());
		    		FruitBasket[index]=a;
		    		index++;
		    		
		    	   }
		    	   break;
	    	case 4: 
	    		System.out.println("4:Display names of all fruits");
	    		for(Fruits f:FruitBasket)
	    		{
	    			break;
	    		} 
	    		    System.out.println(a.getName());
	    		    System.out.println(o.getName());
	    		    System.out.println(m.getName());
	    		break;
	    	case 5:
	    		 System.out.println("5:Display name,color,weigth,taste of all fresh fruits");
	    		  System.out.println(a.toString()+" "+a.taste());
	    		  System.out.println(m.toString()+" "+m.taste());
	    		  System.out.println(o.toString()+" "+o.taste());
	    		  break;
	    		  
	    	case 6:
	    		 System.out.println("6:Mark a fruit in a basket");

	    		   int index2=sc.nextInt();
	    		   if(index2>=1 && index<=FruitBasket.length)  
	    		   {
	    			  
	    			   Fruits f=FruitBasket[index2-1];
	    			    f.setFresh(false);
	    			   
	    			   System.out.println(f.getName()+"marked as stale");
	    			   
	    		   }
	    		   else
	    		   {
	    			   System.out.println("Invalid index");
	    		   }
	    		   break;
	    	case 7:
	    		System.out.println("7:Mark all sour fruits stale");
	    		  for(Fruits f:FruitBasket)
	    		  {
	    			  if(f.taste().equals("Sour"))
	    			  { 
	    				  f.setFresh(false);
	    				  
	    			  }
	    		  }
	    		  break;
	    	case 8:
	    		 System.out.println("8:Invoke fruit specific");
	    		 index=sc.nextInt();
	    		 if(FruitBasket[index] instanceof Mango)
	    		 {
	    			 ((Mango)m).pulp();
	    		 }
	    		 else if(FruitBasket[index] instanceof Orange)
	    		 {
	    			 ((Orange)o).juice();
	    		 }
	    		 else
	    		 {
	    			 ((Apple)a).jam();
	    		 }
	    		 break;
	    		 
	    		
	    	}
	    	
	    	
	    }
	    while(choice !=8);
	    
	  
	  
		

	}

}
