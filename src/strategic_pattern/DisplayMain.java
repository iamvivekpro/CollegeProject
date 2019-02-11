package strategic_pattern;

public class DisplayMain {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		DisplayAnimal d1s=new DisplayAnimal(new DisplayTiger());
		DisplayAnimal d2s=new DisplayAnimal(new DisplayLion());
		d1s.display();
		d2s.display();
	}

}
