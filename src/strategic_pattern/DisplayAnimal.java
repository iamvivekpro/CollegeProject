package strategic_pattern;

class DisplayAnimal implements IDisplay{
	IDisplay id;
	public DisplayAnimal(IDisplay ds) {
		// TODO Auto-generated constructor stub
		this.id=ds;
		
	}
	@Override
	public void display() {
		// TODO Auto-generated method stub
		id.display();
		
	}
	
}

