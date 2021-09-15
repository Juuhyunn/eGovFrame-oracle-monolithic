package shop.jarviis.oracle.customer.service;

import java.util.List;

import org.springframework.stereotype.Component;

import shop.jarviis.oracle.common.GenericInterface;
import shop.jarviis.oracle.customer.domain.CustomerDTO;

@Component
public interface CustomerService extends GenericInterface<CustomerDTO, Integer>{
	List<CustomerDTO> findByCustName(String custName);
	List<CustomerDTO> findByAddress(String address);
	List<CustomerDTO> findByPhone(String phone);
	CustomerDTO login(CustomerDTO t);
}
