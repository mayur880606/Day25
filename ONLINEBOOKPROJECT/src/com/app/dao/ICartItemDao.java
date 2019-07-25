package com.app.dao;

import com.app.pojos.*;

public interface ICartItemDao {

public void addCartItem(CartItem cartItem);
	
	public void removeCartItem(CartItem cartItem);
	
	public void removeAllCartItems(Cart cart);

	public CartItem getCartItemByBookId(int bookId);
}
