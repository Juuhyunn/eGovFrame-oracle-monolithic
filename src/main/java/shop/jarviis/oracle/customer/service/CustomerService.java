package shop.jarviis.oracle.customer.service;

import org.springframework.stereotype.Component;

import shop.jarviis.oracle.common.GenericInterface;
import shop.jarviis.oracle.customer.domain.CustomerDTO;

@Component
public interface CustomerService extends GenericInterface<CustomerDTO, Integer>{
}
