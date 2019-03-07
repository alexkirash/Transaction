package com.kirash.alex.operation.transaction;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TransactionWithCommision {
	public static void main(String args[]){ 
		String amount;
		double commision;
		double finalAmount;
		
		DecimalFormat dformat = new DecimalFormat("##.00");  
		
		System.out.println("Enter transaction amount : "); 
		Scanner scan = new Scanner(System.in);
		amount = scan.next();
		
		double doubleAmount = Double.parseDouble(amount);
		System.out.println("Your transaction amount : " + dformat.format(doubleAmount) );
		
		commision = (doubleAmount/100)*2+3;

		if (commision < 5) {
			commision = 5;			
		}
		else if (commision > 20) {
			commision = 20;
		}
		else {
			commision = commision;
		}

		finalAmount = doubleAmount + commision;
		 
		System.out.println("Final transaction amount : " + dformat.format(finalAmount) + " \nCommision : " + dformat.format(commision));
	}
	
}
