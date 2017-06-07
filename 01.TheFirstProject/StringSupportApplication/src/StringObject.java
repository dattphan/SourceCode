
public class StringObject {

	//attribute
	private String strinput;
	
	//constructor
	StringObject()
	{
		this("");
	}
	StringObject(String strinput)
	{
		this.setInput(strinput);
	}
	
	//getter & setter
	void setInput(String strinput)
	{
		this.strinput=strinput;
	}
	String getInput()
	{
		return this.strinput;
	}
}
