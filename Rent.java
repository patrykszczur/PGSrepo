package Movie;

public class Rent {

	private String start , stop , title ;	
	Movie movie ; 
	
	Rent (String start , String stop , String title)
	{
		this.start = start ;
		this.stop = stop ; 
		this.title = title ; 
	}
	String getRentInfo()
	{
		return "start of the rent : " + "   "+  start + "  end of the rent : " + "    " + stop  +  "  " + " title :" +  "  " + title ; 
	}
}
