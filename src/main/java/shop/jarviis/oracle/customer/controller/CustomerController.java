package shop.jarviis.oracle.customer.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import shop.jarviis.oracle.customer.domain.CustomerDTO;
import shop.jarviis.oracle.customer.service.CustomerService;


@Controller
@RequestMapping("/customers")
public class CustomerController{
	@Autowired CustomerService customerService;
	@Autowired CustomerDTO customerDTO;
	
	
	@RequestMapping("/detail")
	public void findById(CustomerDTO t) {
		
		System.out.println(customerService.findById(t.getCustId()));
	}
	@RequestMapping(value="/", method=RequestMethod.POST)
	public void findAll() {
		List<CustomerDTO> list = customerService.findAll();
		for(CustomerDTO c : list) {
			System.out.println(c.toString());
		}	
	}
	@RequestMapping(value="/register", method = RequestMethod.POST)
	public void save(CustomerDTO t) {
		customerService.save(t);
		System.out.println(t.toString());
	}
	@RequestMapping(value="/update", method=RequestMethod.POST)
	public void update(CustomerDTO t) {
		customerService.update(t);
		System.out.println("Update Complete : " + t);
	}
	@RequestMapping("/delete/{id}")
	public void delete(@PathVariable Integer id) {
		customerService.delete(id);
		System.out.println("Delete Complete : " + id);
		
	}
	

}
