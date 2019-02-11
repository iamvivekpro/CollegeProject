package singalton_pattern;

public class SingleTonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singelton s=Singelton.getInstanceSingelton();
		
		s.display();
		System.out.println(s);
	}

}
