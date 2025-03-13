package Base;

import org.testng.annotations.DataProvider;

public class DataFortesting {


//	@DataProvider(name="Lp")
//	Object [][] Logindata()
//	{
//
//		Object data[][]=
//			{
//					{"pratik@gmail.com", "pratik123"},
//					{"test@gmail.com", "Test"},
//					{"sanket.karwa@zingworks.in", "Sanket@123"},
//			};
//		return data;
//
//	}
	@DataProvider(name="loginparameter")
	Object[] [] logindata(){
		
		Object [][] data= {
				
				{"pretikveer@gmail.ghj", "tyty"},
				{"test@1345", "45464"},
				{"vrtt@3445.in", "4567678"},
		};
		return data;
	}
	
	}


