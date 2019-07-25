package com.app.dao;

import java.util.List;

import com.app.pojos.*;

public interface IBookDao {

List<Book> getBookList();
	
	Book getBookById(int id);
	
	public void addBook(Book book);
	
	public void editBook(Book book);
	
	public String deleteBook(Book book);
}
