package by.epam.javabasic25.classes;

import java.util.Iterator;
import java.util.List;


public class LibraryLogic {
		
 			  		 
	public int IsBookInLibrary(Library library, String AuthorToFind, String Output){		 ///to find the book in the library by Author
		 int numb;
		 numb = 0;
		 List<Book> books = library.getBook(); 
    			  
		 
		 		 
		 if (Output=="Table") {
			 System.out.println("------------------------------");
			   System.out.println("  Author     Book     Year");				   
			   System.out.println("-------------------------------");
		 }
		 
		 for (Book bk : books) {
			   if (bk.getAuthor()==AuthorToFind)  {
				   numb = numb + 1;
				   
				   if (Output=="List") {
					   
				   System.out.println("Title: " + bk.getTitle() 
				   + "\n"  + "Author: " + bk.getAuthor() 
				   + "\n"  + "Year Published: " + bk.getYearPublished());
				   System.out.println("-------------------------------");
				   
				   } else  {	   				   
				   System.out.println(bk.getAuthor()+"  "+ bk.getTitle()+"  " + bk.getYearPublished());				   
				   }
				   
			   }
			   
			  }
		 if (numb == 0 ) {
			 System.out.println("There is no book of this Author in the library");	        
		 }
		 		 
		 return numb;	 
	
	}
		 
	
	public void ToRemoveBookFromLibrary(Library library,String AuthorToFind, String Title){		 ///to find the book in the library by Title and remove it
		List<Book> books = library.getBook();
		Iterator<Book> myItr = books.iterator();

	    while (myItr.hasNext()) {
	        Book bk = myItr.next();
	      
	        if (bk.getTitle()==Title & bk.getAuthor()==AuthorToFind) {
	        	System.out.println("Book with title " + Title + " and Author " +  AuthorToFind  + "   is to be removed from the library");
	            myItr.remove();
	        }
	    }
			   	 			 
	 }	  		 
}