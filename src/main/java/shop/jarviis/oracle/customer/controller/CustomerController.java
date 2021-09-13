package shop.jarviis.oracle.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import shop.jarviis.oracle.customer.domain.CustomerDTO;
import shop.jarviis.oracle.customer.service.CustomerService;


@Controller
@RequestMapping("/customers")
public class CustomerController {
	@Autowired CustomerService customerService;
	@RequestMapping("/customers")
	public void findAll() {
		List<CustomerDTO> list = customerService.findAll();
		for (CustomerDTO c : list) {
			System.out.println(c.toString());
		}
	}
	@RequestMapping("/customers/custId/{custId}")
	public void findById(@PathVariable int custId) {
		CustomerDTO customerDTO = customerService.findById(custId);
		System.out.println(customerDTO.toString());
	}
	@RequestMapping("/customers/custName/{custName}")
	public void findByCustName(@PathVariable String custName) {
		List<CustomerDTO> list = customerService.findByCustName(custName);
		for(CustomerDTO c : list) {
			System.out.println(c.toString());
		}
	}
	@RequestMapping("/customers/address/{address}")
	public void findByAddress(@PathVariable String address) {
		List<CustomerDTO> list = customerService.findByAddress(address);
		for(CustomerDTO c : list) {
			System.out.println(c.toString());
		}
	}
	@RequestMapping("/customers/phone/{phone}")
	public void findByPhone(@PathVariable String phone) {
		List<CustomerDTO> list = customerService.findByPhone(phone);
		for(CustomerDTO c : list) {
			System.out.println(c.toString());
		}
	}
	
	
	@RequestMapping("/join")
	public String join() {
		return "회원가입 성공";
	}
	@RequestMapping("/login")
	public String login() {
		return "로그인 성공";
	}

}
