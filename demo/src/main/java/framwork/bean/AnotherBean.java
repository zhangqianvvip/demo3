package framwork.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnotherBean {
	private static final Logger logger = LoggerFactory.getLogger(AnotherBean.class);
	@Autowired
	private Helloworld Helloworld;
	
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
