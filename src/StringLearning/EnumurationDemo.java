package StringLearning;

import java.util.Enumeration;
import java.util.Vector;

public class EnumurationDemo {
	
	public static void main(String []a) {
		Vector x= new Vector();
		for(int i=0;i<=10;i++) {
			x.add(i);
		}
		int c=0;
		long l1=System.currentTimeMillis();
		for(Enumeration enumeration=x.elements();enumeration.hasMoreElements();c++) {
			
			System.out.println("Element At "+c+"Index is "+enumeration.nextElement());
		}
		long l2=System.currentTimeMillis();
		System.out.println("\n\n\t\t Time Taken"+(l2-l1));
	}
}
