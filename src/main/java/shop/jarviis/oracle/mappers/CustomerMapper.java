package shop.jarviis.oracle.mappers;

import org.springframework.stereotype.Repository;

import shop.jarviis.oracle.common.GenericInterface;
import shop.jarviis.oracle.customer.domain.CustomerDTO;

@Repository
public interface CustomerMapper extends GenericInterface<CustomerDTO, Integer>{
	
}
