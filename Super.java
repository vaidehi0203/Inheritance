package oops_2;

//This program shows use of "super" keyword by which child  class can access the variables and methods of parent class 


class A{
	 int a=10;
	int b=23;
	
	public void sum() {
		int c;
		c=a+b;
		System.out.println("The sum is : "+c);
	}
}

class B extends A
{
	
	
	int x=super.a;
	int y=super.b;
	
	
	public void sum(){
		
		super.sum();
	}
	
}
public class Super {

	public static void main(String[] args) {
		
		B b=new B();
		System.out.println(b.a);
		System.out.println(b.y);
        b.sum();
	}

}
