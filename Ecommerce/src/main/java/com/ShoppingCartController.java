package com;



import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.model.Item;
import com.model.User;
import com.service.*;

@Controller
@RequestMapping("/customer/cart")

public class ShoppingCartController {
	
	
	
	 @Autowired
	
	 private productservice service;
	 @Autowired
	 private customerservice service1;
	 private com.service.CartItemService CartItemService;
	private com.service.CartService CartService1;
	
	 @RequestMapping
	    public String getCart(int userId)
	 {
		 
		User u= service1.getUserById(userId);
		
	    int cartId= u.getCart().getCartId();
	        


        return "redirect:/customer/cart/" + cartId;

	       
	    }


	    @RequestMapping("/order/{cartId}")
	    public String getCartRedirect(@PathVariable (value = "cartId") int cartId, Model model){
	        model.addAttribute("cartId", cartId);

	        return "cart";
	    }




	

	 @SuppressWarnings("unchecked")
	 @RequestMapping(value = "/delete/{id}", method = RequestMethod.GET)
	 public String delete(@PathVariable(value = "id") int id, HttpSession session) {
	  List<Item> cart = (List<Item>) session.getAttribute("cart");

	  int index = isExisting(id, session);
	  cart.remove(index);
	  session.setAttribute("cart", cart);
	  return "cart";
	 }

	 @SuppressWarnings("unchecked")
	 private int isExisting(int id, HttpSession session) {

	 List<Item> cart = (List<Item>) session.getAttribute("cart");

	  for (int i = 0; i < cart.size(); i++)

	   if (cart.get(i).getP().getId() == id)
	    return i;
	  return -1;
	 }

	}


