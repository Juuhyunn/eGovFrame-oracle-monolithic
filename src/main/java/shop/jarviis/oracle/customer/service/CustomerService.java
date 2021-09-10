package shop.jarviis.oracle.customer.service;

import java.util.List;

import org.springframework.stereotype.Component;

import shop.jarviis.oracle.customer.domain.CustomerDTO;

@Component
public interface CustomerService {
	public List<CustomerDTO> findAll();
}
