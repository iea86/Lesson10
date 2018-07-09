package by.epam.javabasic25.classes;

public class Controller{

	 public static void main(String[] args){
		 
		 String AuthorToFind = "Author1", BookToRemove = "Title1",  Output = "Table";
		 		 
		 Book b1 = new Book("Title1","Author1", 2001);
		 Book b2 = new Book("Title2","Author1", 2002);
		 Book b3 = new Book("Title3","Author1", 2004);
		 Book b4 = new Book("Title1","Author2", 2003);
		 Book b5 = new Book("Title2","Author2", 2005);
		  
		 Library l1 = new Library();
		 l1.add(b1);
		 l1.add(b2);
		 l1.add(b3);
		 l1.add(b4);
		 l1.add(b5);
		 	 
		
		 LibraryLogic view = new LibraryLogic();		 
	
	     view.IsBookInLibrary(l1,AuthorToFind,Output);
			  		 
	     view.ToRemoveBookFromLibrary(l1, AuthorToFind, BookToRemove); 
			   
		 view.IsBookInLibrary(l1,AuthorToFind,Output);
	  }
}



