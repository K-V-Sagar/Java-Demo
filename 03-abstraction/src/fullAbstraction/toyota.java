package fullAbstraction;

public class toyota implements car {

	@Override
	public void go() {
		System.out.println("Inside Toyota go()");
	}

	@Override
	public void stop() {
		System.out.println("Inside Toyota stop()");
	}

}
