package shop.jarviis.oracle.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import shop.jarviis.oracle.customer.domain.CustomerDTO;
import shop.jarviis.oracle.customer.service.CustomerService;


@Controller
public class CustomerController {
	@Autowired CustomerService customerService;
	@RequestMapping("/customers")
	public void findAll() {
		List<CustomerDTO> list = customerService.findAll();
		for (CustomerDTO c : list) {
			System.out.println(c.toString());
		}
	}
	

}
