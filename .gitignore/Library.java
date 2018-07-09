package by.epam.javabasic25.classes;

import java.util.ArrayList;
import java.util.List;

public class Library{
	 	
	private List<Book> books = new ArrayList<Book>();
	
		
	public List<Book> getBook(){
		return books;
		}
	
	public void add(Book book){  /// to add Book to the library
	books.add(book);
	}
	
	
	 
	}
	 



