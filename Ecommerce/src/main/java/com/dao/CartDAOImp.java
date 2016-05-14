package com.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Cart;
@Repository
public class CartDAOImp implements CartDAO {
	private SessionFactory sessionFactory; 
	@Autowired
	public CartDAOImp(SessionFactory sessionFactory) 
	{
		super();
		this.sessionFactory = sessionFactory;
		// TODO Auto-generated constructor stub
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	 
	public Session getSession()
	{
		return sessionFactory.openSession();
	}
	public Cart getCartById(int cartId) {
		Session session=sessionFactory.getCurrentSession();
		
		return (Cart)session.get(Cart.class,new Integer(cartId));
		
		
	}

	/*public void update(Cart cart) {

        int cartId = cart.getCartId();
        double grandTotal = customerser.getCustomerOrderGrandTotal(cartId);
        cart.setGrandTotal(grandTotal);

        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(cart);
    }
*/

	

}
