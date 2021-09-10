package shop.jarviis.oracle.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.jarviis.oracle.customer.domain.CustomerDTO;
import shop.jarviis.oracle.mappers.CustomerMapper;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired CustomerMapper customerMapper;
	@Override
	public List<CustomerDTO> findAll() {
		// TODO Auto-generated method stub
		return customerMapper.findAll();
	}

}
