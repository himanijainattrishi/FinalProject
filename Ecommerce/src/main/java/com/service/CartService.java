package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.CartDAOImp;
import com.dao.CartItemDAOImp;
import com.model.Cart;
@Service
@Transactional
public class CartService {
	CartDAOImp cartService;
	
	public void setCart(CartDAOImp cartService) {
		this.cartService = cartService;
	}





	@Autowired
	public CartService(CartDAOImp CartService) {
	
		this.cartService = cartService;
	}


    public Cart getCartById(int cartId){
        return cartService.getCartById(cartId);
    }


}
