package practice;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Practice2Test {
	
	@Test
	public void practice2() {
		String browser = System.getProperty("b");
		String url = System.getProperty("u");
		Reporter.log("Browser is =====>>>>>  "+browser , true);
		Reporter.log("URL is =====>>>>>  "+url , true);
	}

}
