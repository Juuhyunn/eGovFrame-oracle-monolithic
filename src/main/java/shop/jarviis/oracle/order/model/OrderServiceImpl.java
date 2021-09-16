package shop.jarviis.oracle.order.model;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import shop.jarviis.oracle.mappers.OrderMapper;

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

	@Override
	public List<OrderDTO> findByCustId(int custId) {
		return orderMapper.findByCustId(custId);
	}

	@Override
	public List<OrderDTO> findByOrderPrice(int orderPrice) {
		return orderMapper.findByOrderPrice(orderPrice);
	}

	@Override
	public List<OrderDTO> findByBookId(int bookId) {
		return orderMapper.findByBookId(bookId);
	}

	@Override
	public List<OrderDTO> findByOrderDate(String orderDate) {
		return orderMapper.findByOrderDate(orderDate);
	}

	

}
