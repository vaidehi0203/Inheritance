package oops_2;
import java.util.*;

// This program shows the method overloading where methods have same name but different parameters.

public class overloading {
	                  
	    public void area(int l) {
		                 int area;
		                 area=l*l;
		                  System.out.println("The Area Of Square is:"+area);
                  }
	
	     public void area(int b,int h) {
		                  double  area;
		                  area=0.5*(b*h);
		                   System.out.println("The Area Of Triangle is:"+area);
	             }

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		overloading o1=new overloading();
		overloading o2=new overloading();
		
		
		
		
		System.out.println("Enter the lenth of square:");
		int l=input.nextInt();
		o1.area(l);
		System.out.println("\n");
		
		System.out.println("Enter the base of triangle:");
		int b=input.nextInt();
		
		System.out.println("Enter the height of triangle:");
		int h=input.nextInt();
		
		o2.area(b, h);
	}

}
