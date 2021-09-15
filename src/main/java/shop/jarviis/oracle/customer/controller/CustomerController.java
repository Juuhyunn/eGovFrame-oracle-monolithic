package shop.jarviis.oracle.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.jarviis.oracle.customer.domain.CustomerDTO;
import shop.jarviis.oracle.customer.service.CustomerService;

@Controller
@RequestMapping("/customers")
public class CustomerController {
	@Autowired
	CustomerService customerService;
	@Autowired
	CustomerDTO customerDTO;

	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public String findAll() {
		this.forPrint(customerService.findAll());
		return "redirect:/user/List";
	}
	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public String save(CustomerDTO t) {
		customerService.save(t);
		System.out.println(t.toString());
		return "redirect:/user/List";
	}
	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public String update(CustomerDTO t) {
		customerService.update(t);
		System.out.println("Update Complete : " + t);
		return "redirect:/user/List";
	}
	@RequestMapping("/delete")
	public String delete(@RequestParam int custId) {
		customerService.delete(custId);
		System.out.println("Delete Complete : " + custId);
		return "redirect:/user/List";
	}
	@RequestMapping("/detail")
	public String findById(@RequestParam int custId) {
		System.out.println(customerService.findById(custId).toString());
		return "redirect:/user/List";
	}
	@RequestMapping("/list/custName")
	public String findByCustName(@RequestParam String custName) {
		forPrint(customerService.findByCustName(custName));
		return "redirect:/user/List";
	}
	@RequestMapping("/list/address")
	public String findByAddress(@RequestParam String address) {
		forPrint(customerService.findByAddress(address));
		return "redirect:/user/List";
	}

	@RequestMapping("/list/phone")
	public String findByPhone(@RequestParam String phone) {
		forPrint(customerService.findByPhone(phone));
		return "redirect:/user/List";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(CustomerDTO t) {
		String check = (customerService.login(t)) == null?"******Login FAIL*****":"******Login Success*****";
		System.out.println(check);
		return "redirect:/user/List";
		
	}
	public List<CustomerDTO> forPrint(List<CustomerDTO> list) {
		System.out.println("*****Select Complete : ");
		for (CustomerDTO c : list) {
			System.out.println(c.toString());
		}
		return list;
	}

}
