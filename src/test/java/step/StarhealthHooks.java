package step;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class StarhealthHooks {
	@Before(order = 0,value="@training")
	public void Trainingsetup()
	{
		System.out.println("Executing only application scenarios");
		System.out.println("The feature scenario has started");
		System.out.println("The Author is Sakshi");
		
	}
	
	@Before(order = 1,value="@simplilearn")
	public void Simplilearnsetup()
	{
		System.out.println("Connect to Simplilearn");
	}
	
	@After(order = 1,value="@simplilearn")
	public void SimplilearnClose()
	{
		System.out.println("Close the Simplilearn connection");
	}

	
	@After(order = 0,value="@training")
	public void teardown()
	{
		
		System.out.println("The feature scenario has completed");
		
	}
}
