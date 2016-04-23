package Movie;
import java.util.Scanner;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.FileReader ;
import java.io.BufferedReader ;


public class MainMovie  {

	
	 
	public static void main(String[] args) throws IOException {
		
        int userNumber=0;

		System.out.println("______________MENU______________________" + "\n");
		System.out.println("welcome in my VOD world : " + "\n");
		System.out.println("this is rental with VOD films  " + "\n");
		while (userNumber != '7')
		{
        System.out.println("\n" + "1. press 1 to add new movie " );
        System.out.println("2. press 2 to add new client ");
        System.out.println("3. press 3 to add new rent ");
        System.out.println("4. press 4 to show ouer films ");
        System.out.println("5. press 5 to show ouer clients ");
        System.out.println("6. press 6 to show history of rents");
        System.out.println("7. press 7 to exit "+ "\n");
		
        System.out.println("your choice: ");
        @SuppressWarnings("resource")
		Scanner number = new Scanner(System.in);
        userNumber = number.nextInt();
       
        switch(userNumber)
        {
            case 1:  
            	addMovie() ; 
                break;
            case 2:        
                addClient() ; 
                break;
            case 3 : 
                addRent() ; 
                break;
            case 4 :            	
            	showFilms() ;
            	 break ; 
            case 5 :             	
                showClients() ;
            	  break ;           	
             case 6 :          
            	showRents() ; 
            	 break ;
             case 7 :
            	 System.out.println("goodbye");
            	 System.exit(0);
            	 break ;
        }
		}
	}
	private static void showRents() throws IOException {
		
		 FileReader showRent = new FileReader("RentFile.txt");
    	 BufferedReader showrent = new BufferedReader(showRent);
    	 String textLine2 = showrent.readLine();
    	 do {
    		System.out.println(textLine2);      	  
    		textLine2 = showrent.readLine();
    	    }	 while(textLine2 != null);
    	 showrent.close();		
	}
	private static void showClients() throws IOException {
		
		 FileReader showClient = new FileReader("ClientFile.txt");
   	     BufferedReader showclient = new BufferedReader(showClient);
   	     String textLine1 = showclient.readLine();
   	     do {
   	        System.out.println(textLine1);           	  
   	        textLine1 = showclient.readLine();
   	        }	while(textLine1 != null);
   	  	  showclient.close();		
	}
	private static void showFilms() throws IOException {
		
		FileReader showMovie = new FileReader("MovieFile.txt");
    	BufferedReader showmovie = new BufferedReader(showMovie);
    	String textLine = showmovie.readLine();
    	do {
    	   System.out.println(textLine);
    	   textLine = showmovie.readLine();
    	   }	while(textLine != null);
    	 showmovie.close();		
	}
	private static void addRent() throws IOException {
		
		System.out.println("use format yyyy/mm/dd");
    	@SuppressWarnings("resource")
		Scanner rent = new Scanner(System.in);
    	System.out.println("enter start of the rent : ");
        String start = rent.nextLine();
        System.out.println("enter end of the rent : ");
        String stop = rent.nextLine();
        System.out.println("enter title of renting film : ");
        String title = rent.nextLine();
        Rent newRent = new Rent (start, stop , title);
        System.out.println(newRent.getRentInfo());
	    FileWriter add3 = new FileWriter("RentFile.txt", addTofile);
    	PrintWriter record3 = new PrintWriter(add3);
        record3.printf( "%n" +"start of rent : " +  start + " end of rent : " + stop  + "  " + "title : " + title );
        record3.close();		
	}
	private static void addClient() throws IOException {
		
		@SuppressWarnings("resource")
		Scanner client = new Scanner(System.in);
        System.out.println("enter the name : ");
        String name = client.nextLine();
        System.out.println("enter the surname : ");
        String surname = client.nextLine();
        Client newClient = new Client (name, surname);
        System.out.println(newClient.getClientInfo());
	    FileWriter add2 = new FileWriter("ClientFile.txt", addTofile);
    	PrintWriter record2 = new PrintWriter(add2);
        record2.printf("%n" + name + " " + surname);
        record2.close();		
	}
	static boolean addTofile = true ;

	private static void addMovie() throws IOException {
		

		@SuppressWarnings("resource")
		Scanner movie = new Scanner(System.in);
        System.out.println("enter the id : ");
        String id = movie.nextLine();
        System.out.println("enter the title : ");
        String title = movie.nextLine();
        Movie newMovie = new Movie (id, title);
        System.out.println(newMovie.getMovieInfo());
        FileWriter add = new FileWriter("MovieFile.txt", addTofile);
    	PrintWriter record = new PrintWriter(add);
    	record.printf("%n" + id + " " + title );
        record.close();
        
	}


}
