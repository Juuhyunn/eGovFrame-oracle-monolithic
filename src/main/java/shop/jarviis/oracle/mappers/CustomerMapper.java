package shop.jarviis.oracle.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.jarviis.oracle.customer.domain.CustomerDTO;

@Repository
public interface CustomerMapper {
	public List<CustomerDTO> findAll();

}
