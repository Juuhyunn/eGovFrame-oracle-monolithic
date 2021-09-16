package shop.jarviis.oracle.customer.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.jarviis.oracle.mappers.CustomerMapper;

@Service
public class CustomerServiceImpl implements CustomerService{
	@Autowired CustomerMapper customerMapper;

	@Override
	public void save(CustomerDTO t) {
		// TODO Auto-generated method stub
		customerMapper.save(t);
	}

	@Override
	public CustomerDTO findById(Integer id) {
		// TODO Auto-generated method stub
		return customerMapper.findById(id);
	}

	@Override
	public List<CustomerDTO> findAll() {
		// TODO Auto-generated method stub
		return customerMapper.findAll();
	}

	@Override
	public void update(CustomerDTO t) {
		// TODO Auto-generated method stub
		customerMapper.update(t);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		customerMapper.delete(id);
	}

	@Override
	public List<CustomerDTO> findByCustName(String custName) {
		return customerMapper.findByCustName(custName);
	}

	@Override
	public List<CustomerDTO> findByAddress(String address) {
		return customerMapper.findByAddress(address);
	}

	@Override
	public List<CustomerDTO> findByPhone(String phone) {
		return customerMapper.findByPhone(phone);
	}

	@Override
	public CustomerDTO login(CustomerDTO t) {
		return customerMapper.login(t);
	}
}
