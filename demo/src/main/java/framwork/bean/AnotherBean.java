package framwork.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnotherBean {
	@Autowired
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
