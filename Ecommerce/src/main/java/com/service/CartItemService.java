package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.CartItemDAOImp;
import com.dao.CartItemDao;
import com.dao.productimp;
import com.model.Item;



@Service
@Transactional
public class CartItemService {
	private CartItemDAOImp cart;
	
	
	public void setCart(CartItemDAOImp cart) {
		this.cart = cart;
	}

	



	@Autowired
	public CartItemService(CartItemDAOImp cart) {
	
		this.cart = cart;
	}


    public void addCartItem(Item cartItem){
      cart.addCartItem(cartItem);
    }


    public Item getCartItemByProductId(int productId){
        return cart.getCartItemByProductId(productId);
    }



}
