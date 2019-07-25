package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.*;
import com.app.pojos.*;

@Service
@Transactional
public class BookService implements IBookService {

	@Autowired
	private IBookDao bookDao;
	
	@Override
	public List<Book> getBookList() {
		
		
		return bookDao.getBookList();
	}

	@Override
	public Book getBookById(int id) {
		
		return bookDao.getBookById(id);
	}

	@Override
	public void addBook(Book book) {
		
		bookDao.addBook(book);

	}

	@Override
	public void editBook(Book book) {
		
		bookDao.editBook(book);
		
	}

	@Override
	public String deleteBook(int bid) {
		// TODO Auto-generated method stub
		return bookDao.deleteBook(bookDao.getBookById(bid));
	}


}
