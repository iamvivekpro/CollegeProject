import java.util.*;
class A{
	int a;
	public A() {}
}
class B extends A{
	int b;
	public B() {
		System.out.println("Hello World");
		
	}
}
class C{
	
	C(){}
}
public class TestPro {
	public static void main(String []a) {
	A obj1=new A();
	B obj=new B();
	C obs=new C();
	Object ob2=new Object();
	System.out.println(obj1 instanceof Object);
	System.out.println("hello New Branch");
	}
}
