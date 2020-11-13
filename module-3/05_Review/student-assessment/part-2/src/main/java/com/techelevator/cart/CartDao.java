package com.techelevator.cart;

import java.util.List;

public interface CartDao {

	public int save(Cart newCart);

	public List<Cart> getAllCarts();

}
