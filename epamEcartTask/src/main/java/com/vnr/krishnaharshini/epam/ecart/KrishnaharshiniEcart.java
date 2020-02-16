package com.vnr.krishnaharshini.epam.ecart;
import java.util.*;
import com.vnr.krishnaharshini.epam.ecart.utils.*;
public class KrishnaharshiniEcart {
	public static void main(String args[])
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Welocme to KrishnaharshiniEcart");
		System.out.println("The categories of items are ");
		System.out.println("1.Electronic Items 2. Clothes");
		int choice;
		while(true)
		{
			try {
		System.out.println("enter your choice");
		choice=scanner.nextInt();
		break;
			}
			catch(Exception e)
			{
				System.out.println("please ener a vlid one");
				String s=scanner.next();
			}
		}
		while(choice!=1&&choice!=2)
		{
			System.out.println("enter a valid choice...1 or 2");
			choice=scanner.nextInt();
		}
		AllProducts reference;
		if(choice==1)
		{
			ElectronicItems electronicItems=new ElectronicItems();
			reference=electronicItems;
		}
		else
		{
		 Clothes clothes=new Clothes();
		 reference=clothes;
		}
		 String continueChoice="y";
		while(continueChoice.equals("y")) 
		{
		System.out.println("1.Add An Item to cart  2. View Cart");
		int choiceOfOperation;
		while(true)
		{
			try {
				System.out.println("enter your choice");
				choiceOfOperation=scanner.nextInt();
				break;
			}
			catch(Exception e)
			{
				System.out.println("please ener a valid one");
				String s=scanner.next();
			}
		}
		
		while(choiceOfOperation!=1&&choiceOfOperation!=2)
		{
			System.out.println("enter a valid choice...1 or 2");
			choiceOfOperation=scanner.nextInt();
		}
		switch(choiceOfOperation)
		{
		case 1:reference.addItem();
		break;
		case 2:reference.viewCart();
		break;
		}
		
		do {
		System.out.println("Do you want to continue...y/n");
		continueChoice=scanner.next();
		}while(!continueChoice.equals("y")&&!continueChoice.equals("n"));
		}
		
		scanner.close();
		
		
	}
	
	

}
