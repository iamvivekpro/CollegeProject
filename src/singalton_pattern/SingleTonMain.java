package singalton_pattern;

public class SingleTonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singelton s=Singelton.getInstanceSingelton();
		
		Singelton.display();
		System.out.println(s);
	}

}
