package week1.day1;

import java.util.Iterator;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=13;
		int n,i;	
		boolean b=false;       
		  n=num/2;      
		  if(num==0||num==1){  
		   System.out.println(num +" is not prime number");      
		  }
		  else{  
		   for(i=2;i<=n;i++){      
		    if(num%i==0){      
		     System.out.println(num+" is not prime number");      
		     b=true;      
		     break;      
		    }      
		   }      
		   if(b==false)  
		   { System.out.println(num+" is prime number"); }  
		  }
	}
	
}
