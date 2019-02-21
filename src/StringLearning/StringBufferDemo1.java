package StringLearning;

public class StringBufferDemo1 {
	public static void main(String []a) {
		StringBuffer st= new StringBuffer();
		st.insert(0,"hello");
		st.insert(1,"World");
		System.out.println("Value of String Buffer"+st.toString());
		
	}
}
