package com.dao;



import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.model.Cart;
import com.model.Item;
@Repository
public class CartItemDAOImp implements CartItemDao{
	private SessionFactory sessionFactory; 
	@Autowired
	public CartItemDAOImp(SessionFactory sessionFactory) 
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
	public void addCartItem(Item cartItem) {
		Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(cartItem);
        //session.flush();

	}

	public void removeCartItem(Item cartItem) {
		// TODO Auto-generated method stub
		
	}

	public Item getCartItemByProductId(int productId) {
		Session session = sessionFactory.getCurrentSession();
		 
        Query query = session.createQuery("from Item where itemId = ?");
        query.setInteger(0, productId);
        session.flush();
      

        return (Item) query.uniqueResult();
    }

	

	public void removeAllCartItems(Cart cart) {
		// TODO Auto-generated method stub
		
	}

}
