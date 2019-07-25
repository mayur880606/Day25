package com.app.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.app.dao.ICartItemDao;
import com.app.pojos.*;

@Service
public class CartItemService implements ICartItemService {

	@Autowired
	private ICartItemDao cartItemDao;
	
	@Override
	public void addCartItem(CartItem cartItem) {
		
		cartItemDao.addCartItem(cartItem);

	}

	@Override
	public void removeCartItem(CartItem cartItem) {
		
		cartItemDao.removeCartItem(cartItem);

	}

	@Override
	public void removeAllCartItems(Cart cart) {
		
		cartItemDao.removeAllCartItems(cart);

	}

	@Override
	public CartItem getCartItemByBookId(int bookId) {
		
		return cartItemDao.getCartItemByBookId(bookId);
	}

}
