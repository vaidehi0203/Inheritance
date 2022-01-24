package oops_2;

//This program shows method overridding where methods have same name and same parameter.

class square1{ 
	
	public void area(double r) {
		
		double a=r*r;
		System.out.println("The area of square is: "+a);
	}
}

class circle extends square1{

	
	public void area(double r) {
		
		double a=3.14*r*r;
		System.out.println("The area of circle is: "+a);
		
	}
		
	
}
	


public class overriding {

	public static void main(String[] args) {
		
		square1 s=new square1();
		circle c=new circle();
		
		s.area(4);
		c.area(5);
		

	}

}
