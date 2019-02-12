
class A{
	/*
	 * int a; public A() {}
	 */
}
class B extends A{
	int b;
	public B() {
		System.out.println("Hello World");
	}
}
class C{
	C(){
		System.out.println("Hello World");
	}
}
public class TestPro {
	public static void main(String []a) {
	A obj1=new A();
	
	  						//Hello World
	System.out.println(obj1 instanceof Object);		//Hello World
	
	System.out.println("hello New Branch");
	
	}
}
