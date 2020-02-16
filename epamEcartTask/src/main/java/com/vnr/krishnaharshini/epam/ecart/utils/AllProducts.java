package com.vnr.krishnaharshini.epam.ecart.utils;
import java.util.*;
public class AllProducts implements EcartFunctions {
	String items[]=new String[4];
	int cost[]=new int[4];
	int cart[]=new int[4];
	
	public void displayItems()
	{
		for(int count=0;count<4;count++)
			System.out.println(count+1 + " "+ items[count] + " " + cost[count]);
	}
	public void addItem()
	{
		displayItems();
		System.out.println("enter your choice of item");
		Scanner scanner=new Scanner(System.in);
		int choiceOfItem=scanner.nextInt();
		cart[choiceOfItem-1]+=1;
	}
	//It returns true if cart is empty
	public boolean isEmptyCart()
	{
		for(int count=0;count<4;count++)
			if(cart[count]!=0)
				return false;
		return true;
	}
	//Displays all the items and their details added to cart
	public void viewCart()
	{
		if(isEmptyCart())
		{
			System.out.println("cart is empty");
			return;
		}
		int totalCost=0;
		
		for(int count=0;count<4;count++)
		{
			if(cart[count]!=0)
			{
				System.out.println(items[count] + " " + cost[count] + " " + cart[count] + "    " + cost[count]*cart[count]);
				totalCost=totalCost+cost[count]*cart[count];
			}
		}
		System.out.println();
		System.out.println("Total cost is " + totalCost);
		}
	
	
	
		
	}


