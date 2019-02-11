package strategic_pattern;

class DisplayAnimal implements IDisplay{
	IDisplay id;
	public DisplayAnimal() {
		// TODO Auto-generated constructor stub
		
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		id.display();
		
	}
	
}

