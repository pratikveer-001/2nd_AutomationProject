package Base;

import org.testng.annotations.Test;

public class TestGainon extends BaseFor_Web {

	Pom p;

		@Test
		public void start()  throws InterruptedException
		{

			 Thread.sleep(1000);

			 p.enteremail("pratik.veer@zingworks.in");
			 Thread.sleep(2000);

			 p.enterpass("veer");
			 Thread.sleep(2000);

			 p.clicksubmit();

		}
}

