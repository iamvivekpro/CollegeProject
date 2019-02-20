package interactiveAppPractice;

public class StringBuilderDemo {

	public static void main(String []a) {
		long t1 = System.currentTimeMillis();
		StringBuilder st=new StringBuilder();
		st.indexOf("Vivek Kumar",0);
		long t2=System.currentTimeMillis();
		System.out.println("Total Time to execute Program="+(t2-t1));
		
	}
}
