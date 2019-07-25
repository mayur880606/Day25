package com.app.service;

import com.app.pojos.*;

public interface ICartItemService {

	public void addCartItem(CartItem cartItem);
	
	public void removeCartItem(CartItem cartItem);
	
	public void removeAllCartItems(Cart cart);

	public CartItem getCartItemByBookId(int bookId);
}
