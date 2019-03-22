package framwork.bean;

public class AnotherBean {
	private Helloworld Helloworld;
	
	public void start() {
		System.out.println("start");
	}
	public void stop() {
		System.out.println("stop");
	}
	public AnotherBean() {
	}
	public Helloworld getHelloworld() {
		return Helloworld;
	}

	public void setHelloworld(Helloworld helloworld) {
		Helloworld = helloworld;
	}

	@Override
	public String toString() {
		return "AnotherBean [Helloworld=" + Helloworld + "]";
	}
	
}
