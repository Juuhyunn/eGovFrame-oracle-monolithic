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

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public void findAll() {
		this.forPrint(customerService.findAll());
	}

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public void save(CustomerDTO t) {
		customerService.save(t);
		System.out.println(t.toString());
	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public void update(CustomerDTO t) {
		customerService.update(t);
		System.out.println("Update Complete : " + t);
	}

	@RequestMapping("/delete")
	public void delete(@RequestParam int custId) {
		customerService.delete(custId);
		System.out.println("Delete Complete : " + custId);
	}

	@RequestMapping("/detail/custId")
	public void findById(@RequestParam int custId) {
		System.out.println(customerService.findById(custId).toString());
	}

	@RequestMapping("/detail/custName")
	public List<CustomerDTO> findByCustName(@RequestParam String custName) {
		List<CustomerDTO> list = customerService.findByCustName(custName);
		this.forPrint(list);
		return list;
	}

	@RequestMapping("/detail/address")
	public void findByAddress(@RequestParam String address) {
		this.forPrint(customerService.findByAddress(address));
	}

	@RequestMapping("/detail/phone")
	public void findByPhone(@RequestParam String phone) {
		this.forPrint(customerService.findByPhone(phone));
	}

	public void forPrint(List<CustomerDTO> list) {
		System.out.println("*****Select Complete : ");
		for (CustomerDTO c : list) {
			System.out.println(c.toString());
		}
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public void login(CustomerDTO t) {
		String check = (customerService.login(t)) == null?"******Login FAIL*****":"******Login Success*****";
		System.out.println(check);
	}

}
