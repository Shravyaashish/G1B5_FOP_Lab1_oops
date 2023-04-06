package com.greatlearning.lab1;

import java.util.Scanner;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredServiceImpl;

public class EmailDriver {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	  System.out.println("Enter first Name");
	    String fname=sc.next();
	  System.out.println("Enter last Name");
	    String lname=sc.next();
	Employee e1=new Employee(fname,lname);
	Employee e2=new Employee();
	   e2.setFirstname(fname);
	   e2.setLastname(lname);
	CredServiceImpl cs=new CredServiceImpl ();
	  System.out.println("1.Technical");
	  System.out.println("2.Admin");
	  System.out.println("3.HR");
	  System.out.println("4.Legal");
	  System.out.println("Enter choice");
	   int choice=sc.nextInt();
	      String genemail="";
	      String genpass="";
	   switch(choice)
	   {
	   case 1:
		   genemail=cs.generateEmaild(e1.getFirstname().toLowerCase(),e1.getLastname().toLowerCase() ,"tech" );
		   break;
	   case 2:
		   genemail=cs.generateEmaild(e1.getFirstname().toLowerCase(),e1.getLastname().toLowerCase() ,"admin" );
		   break;
	   case 3:
		   genemail=cs.generateEmaild(e1.getFirstname().toLowerCase(),e1.getLastname().toLowerCase() ,"hr" );
		   break;
	   case 4:
		   genemail=cs.generateEmaild(e1.getFirstname().toLowerCase(),e1.getLastname().toLowerCase() ,"legal" );
		   break;
		   default:
			   System.out.println("Please enter valid choice");
	   }
	       genpass=cs.generatePassword();
	          e1.setEmail(genemail);
	          e1.setPassword(genpass);
	          cs.ShowDetails(e1);
	   }
	}


