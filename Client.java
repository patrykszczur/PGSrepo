package Movie;

public class Client {

	private String  name , surname ;	
	
	Client (String name , String surname) 
	{
		this.name = name ;
		this.surname = surname ; 
	}
	String getClientInfo ()
	{
		return "name : " + name + " " + "surname : " + surname ; 
	}
	
}
