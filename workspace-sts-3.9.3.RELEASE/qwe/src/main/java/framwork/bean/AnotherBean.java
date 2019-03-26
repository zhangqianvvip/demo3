package framwork.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class AnotherBean {
	private Helloworld Helloworld;
	private static final Logger logger = LoggerFactory.getLogger(AnotherBean.class);

	public void start() {
		logger.info("start");
	}
	public void stop() {
		logger.info("stop");
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
