package com.dsa.practice;

import java.util.ArrayList;
import java.util.List;

public class Factorial {

	 static ArrayList<Long> factorialNumbers(long n) {
	        // code here
	        ArrayList<Long> list = new ArrayList<Long>();
	        long fact =1;
	        long x =2;
	        while(fact <=n){
	            list.add(fact);
	            fact =  fact*x;
	            x++;
	        }
	        return  list;
	        
	    }
	public static void main(String[] args) {
		
		ArrayList<Long> list = factorialNumbers(4);
		System.out.println(list);
	}
}
