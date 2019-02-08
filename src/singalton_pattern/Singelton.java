package singalton_pattern;

class Singelton {
	static Singelton s;
	private Singelton() {
		s=new Singelton();
		// TODO Auto-generated constructor stub
	}
	public static  Singelton getInstanceSingelton() {
		return s;
		
	}
	public static void display() {
		
		System.out.println("Hello Display");
	}
	

}

