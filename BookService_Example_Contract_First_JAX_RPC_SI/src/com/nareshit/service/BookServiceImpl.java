package com.nareshit.service;
import java.rmi.RemoteException;
public class BookServiceImpl 
implements IBookService{
public Book searchBook(String isbn) throws RemoteException {
	Book book=null;
	if(isbn!=null && isbn.equals("101")){
	book=new Book();
	book.setIsbn(isbn);
	book.setPrice(200.0);
	book.setAuthor("jhon");
	book.setTitle("Java in 2 days");
	}
		return book;
	}
public int registerBook(String isbn, String title, String author,
			double price) throws RemoteException {
	System.out.println("Register Book "+isbn+" "+title+" "+author+" "+price);
		return 1;
	}
	public int updateBook(String isbn, String title, String author, double price)
			throws RemoteException {
		System.out.println("Update Book "+isbn+" "+title+" "+author+" "+price);
		return 1;
	}

}
