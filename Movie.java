package Movie;

public class Movie  {
	private String movie , title , id  ;
	private int price ;
	
	
	Movie(String movie , int price , String title , String id  )
	{
		this.movie = movie ;
		this.price = price ; 
		
	}
	Movie (String id , String title) 
	{
		this.title = title ;
		this.id = id ; 
	}

	String getMovie ()
	{
		return movie ; 
	}
	int getPrice()
	{
		return price  ; 
	}
	String getMovieInfo ()
	{
		return "id : " + id + " " + "title : " + title ; 
	}
	
	
}
