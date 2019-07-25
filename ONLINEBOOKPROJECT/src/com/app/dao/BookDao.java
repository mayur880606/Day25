package com.app.dao;

import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import com.app.pojos.*;


@Repository
@Transactional
public class BookDao implements IBookDao {

	@Autowired
	private SessionFactory sf;
	
	@Override
	public void addBook(Book book) {
		
		sf.getCurrentSession().saveOrUpdate(book);
		
	}

	@Override
	public Book getBookById(int id) {

		return sf.getCurrentSession().get(Book.class, id);
	}

	@Override
	public List<Book> getBookList() {
		// create a query
		String query="select b from Book b";
		return sf.getCurrentSession().createQuery(query,Book.class).getResultList();
	}

	@Override
	public String deleteBook(Book book) {
		
		// get the hibernate session
		sf.getCurrentSession().delete(book);
		return "Book has Been Deleted successfully";
		
	}
	
	@Override
	public void editBook(Book book) {
		
		sf.getCurrentSession().saveOrUpdate(book);
		
	}

}
