package com.app.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.app.pojos.Users;

@Repository
public class UserDao implements IUserDao {

	@Autowired
	private SessionFactory sf;
	
	@Override
	public Users validateUser(String username, String pass) {
		String jpql = "select u from Users u where u.username=:un and u.password=:pa";
		return sf.getCurrentSession().createQuery(jpql, Users.class).setParameter("un", username).setParameter("pa", pass)
				.getSingleResult();
	
	}

	

}
