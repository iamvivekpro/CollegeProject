
package reflectionDemo;
import java.lang.reflect.*;
 class A{
	public int num;
	A(){
		num=11;
	}
	A(int num){
		this.num=num;
	}
	public int calculateSqare(int num) {
		return num*num;
	}
	
	public int calculateCube(int num) {
		return num*num*num;
	}
	
}

public class Demo1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob=new A();
		
		  
	        // invokes the method at runtime 
	     
	}

}
