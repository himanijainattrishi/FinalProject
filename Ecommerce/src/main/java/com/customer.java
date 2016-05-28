package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.model.Address;
import com.model.Product;
import com.model.User;
import com.service.customerservice;
import com.service.productservice;

@Controller
public class customer 
{
	@Autowired
	  customerservice service1;

	
@RequestMapping(value= "/register")
 public String registerPage(Model m)
	{
	
		User u=new User();
	ModelAndView model=new ModelAndView("register");
		m.addAttribute("user", u);
		return "register";
	}


/*@RequestMapping(value="/useradd")
public String addCustomer(@ModelAttribute("user") User u)
	{
	System.out.println("in controller");
    service1.adduser(u);
	return "redirect:/register";
		
	
	}
*/
@RequestMapping(value="/useradd")
public String addCustomer(@ModelAttribute("user") User u,BindingResult result)
	{
	if(result.hasErrors())
	{
		System.out.println("error");
		return "redirect:/register";
	}
	
    service1.adduser(u);
    System.out.println("user login");
    return "redirect:/index";
		
	
	}
@RequestMapping(value= "/userlogin")
public String userlogin(Model m)
	{
	
		User u=new User();
	ModelAndView model=new ModelAndView("userlogin");
		m.addAttribute("user", u);
		return "register";
	}
Address address;
public String insertaddress(Address address,MessageContext messageContext) {
this.address=address;
	String str=this.service1.insertaddress(address);
	return str;

	
}
@RequestMapping("/UserLogin")
public ModelAndView index()
{
	 
	  ModelAndView model=new ModelAndView("UserLogin");
	  return model;
}
public Address getadd()
{
	return address;
}


}
