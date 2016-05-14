package com;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.model.Product;

import com.service.productservice;
import java.util.Iterator;


@Component
@Controller
public class UserController {
	@Autowired
	  productservice service;
	 @RequestMapping("/")
	  public ModelAndView HomePage()
	  {
		 
		  ModelAndView model=new ModelAndView("index");
		  return model;
	  }
	 @RequestMapping("/index")
	  public ModelAndView index()
	  {
		 
		  ModelAndView model=new ModelAndView("index");
		  return model;
	  }
	
	 @RequestMapping("/login")
	  public ModelAndView login()
	  {
		 
		  ModelAndView model=new ModelAndView("login");
		  return model;
	  }
	 @RequestMapping("/story")
	  public ModelAndView story()
	  {
		 
		  ModelAndView model=new ModelAndView("story");
		  return model;
	  }
	
	@RequestMapping("/product")
	  public ModelAndView product()
	  {
		  
		  ModelAndView model=new ModelAndView("product");
		  Gson gson = new Gson();
			 
			
			List<Product> list=service.listproduct();
			
		     String json = new Gson().toJson(list );
		      System.out.println("json values is" +json);
		      
		     model.addObject("access",json);
		     return model; 
	  }
	public Product initFlow(){
		return product;
	}
	@RequestMapping("/order")
	 
    public String Order() {
          return "redirect:/memberShip";
    }
	Product product;
	@RequestMapping("/productDetails")
	  public ModelAndView productdetails1(@ModelAttribute("product") Product product)
	  {
		  this.product=product;
		  ModelAndView model=new ModelAndView("productDetails");
		
		  return model;
	  }
	
	
	@RequestMapping("/product1")
	  public ModelAndView page1()
	  {
		  
		  ModelAndView model=new ModelAndView("product1");
		
		  return model;
	  }
	
	@RequestMapping("/product/{pname}")
	public ModelAndView Product_Method2(@PathVariable("pname") String name)
	{
	              
	               List<Product> retrive=new ArrayList<Product>();
	               //ProductService service=new ProductService();
	              
	               List<Product> list= service.listproduct();
	              System.out.println(list);
	              Iterator<Product> i=list.iterator();
	               while(i.hasNext())
	               {
	                              Product p=(Product)i.next();
	                              if(p.getCateg().equals(name))
	                              {
	                            	  System.out.println("category is" +p.getCateg());
	                            	  System.out.println("name" +name);
	                            	  retrive.add(p);
	                              }
	                             
	               }
	               String json = new Gson().toJson(retrive);
	               System.out.println(json);
	               
	               ModelAndView mv=new ModelAndView("product");
	               mv.addObject("access",json);
	               
	              
	               return mv;
	
	
	

}}
