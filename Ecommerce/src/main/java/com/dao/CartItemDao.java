package com.dao;

import com.model.Cart;
import com.model.Item;

public interface CartItemDao {
	void addCartItem(Item cartItem);

    void removeCartItem(Item cartItem);
    Item getCartItemByProductId(int productId);


    void removeAllCartItems(Cart cart);




}
