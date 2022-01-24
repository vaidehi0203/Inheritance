package oops_2;

// This program shows how inheritence work and use of "extends" keyword

 class rectangle{
	 
	 int l=9;
	 int b=3;
	
	public void display() 	{
		
		
		System.out.println("l is "+l);
		System.out.println("b is "+b);
	}
}

 class area extends rectangle{
	public void area() {
		int a;
		a=l*b;
		System.out.println("The area of rectangle is "+a);
	}
}

public class inheritance {
	
	public static void main(String  args[]) {
		
		
		rectangle r=new rectangle();
		area n=new area();
		
	    r.display();
	    n.area();
		
	}

}
