package Base;

public class Method_Chaining {

	public Method_Chaining isDisplayed()
	{
		System.out.println("The element is displayed properly");
		return this;

	}
	public Method_Chaining verify()
	{
		System.out.println("Successfully verifies the element");
		return this;

	}
	public Method_Chaining validate()
	{
		System.out.println("the element validate successfully");
		return this;
	}

}
