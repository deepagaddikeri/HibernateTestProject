package com.sample.hibernate.samplehibernate;

import java.util.Scanner;

public class ClientDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomerDAO cust=new CustomerDAO();
		try{
		System.out.println("Enter ID and name");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id");
		int id= sc.nextInt();
		System.out.println("Enet Name");
	    String name=	sc.next();
		Customer customer=new Customer(id,name);
		cust.addCustomer(customer);
	sc.close();
		}
		
		catch(Exception e){
			System.out.println("exepation"+e);}
		
		
	
	}

}
