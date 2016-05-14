package com.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class Item implements Serializable{
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int itemId;
	@OneToOne
	@JoinColumn(name="id")
	private Product p;
	private int quantity;
	@ManyToOne
	@JoinColumn(name="cartId",insertable=false)
	private Cart c;
	public Item()
	{
		
	}
public 	Item(Product p,int quantity)
	{
		this.p=p;
		this.quantity=quantity;
	}
	
	/**
	 * @return the itemId
	 */
	public int getItemId() {
		return itemId;
	}
	/**
	 * @param itemId the itemId to set
	 */
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	/**
	 * @return the p
	 */
	public Product getP() {
		return p;
	}
	/**
	 * @param p the p to set
	 */
	public void setP(Product p) {
		this.p = p;
	}
	
	public Cart getC() {
		return c;
	}
	/**
	 * @param c the c to set
	 */
	public void setC(Cart c) {
		this.c = c;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	

}