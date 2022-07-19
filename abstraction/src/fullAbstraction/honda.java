package fullAbstraction;

public class honda implements car{

	@Override
	public void go() {
		System.out.println("Inside Honda go()");
	}

	@Override
	public void stop() {
		System.out.println("Inside Honda stop()");
	}
	
	

}
