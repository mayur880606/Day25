package com.app.service;

import java.util.List;

import com.app.pojos.*;

public interface IBookService {

	List<Book> getBookList();
	
	Book getBookById(int id);
	
	public void addBook(Book book);
	
	public void editBook(Book book);
	
	public String deleteBook(int bid);
}
