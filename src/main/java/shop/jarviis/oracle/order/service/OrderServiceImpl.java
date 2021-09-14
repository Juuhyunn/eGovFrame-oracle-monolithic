package shop.jarviis.oracle.order.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.jarviis.oracle.mappers.OrderMapper;
import shop.jarviis.oracle.order.domain.OrderDTO;

@Service
public class OrderServiceImpl implements OrderService{
	@Autowired OrderMapper orderMapper;

	@Override
	public void save(OrderDTO t) {
		orderMapper.save(t);
	}

	@Override
	public OrderDTO findById(Integer id) {
		return orderMapper.findById(id);
	}

	@Override
	public List<OrderDTO> findAll() {
		return orderMapper.findAll();
	}

	@Override
	public void update(OrderDTO t) {
		orderMapper.update(t);
	}

	@Override
	public void delete(Integer id) {
		orderMapper.delete(id);
		
	}

	

}
