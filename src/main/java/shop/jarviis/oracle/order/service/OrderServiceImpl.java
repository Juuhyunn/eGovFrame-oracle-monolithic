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
	public List<OrderDTO> findAll() {
		// TODO Auto-generated method stub
		return orderMapper.findAll();
	}

	@Override
	public OrderDTO findById(int orderId) {
		// TODO Auto-generated method stub
		return orderMapper.findById(orderId);
	}

	@Override
	public List<OrderDTO> findByCustId(int custId) {
		// TODO Auto-generated method stub
		return orderMapper.findByCustId(custId);
	}

	@Override
	public List<OrderDTO> findByBookId(int bookId) {
		// TODO Auto-generated method stub
		return orderMapper.findByBookId(bookId);
	}

	@Override
	public List<OrderDTO> findByOrderPrice(int orderPrice) {
		// TODO Auto-generated method stub
		return orderMapper.findByOrderPrice(orderPrice);
	}

	@Override
	public List<OrderDTO> findByOrderDate(String orderDate) {
		// TODO Auto-generated method stub
		return orderMapper.findByOrderDate(orderDate);
	}

	@Override
	public void save(OrderDTO orderDTO) {
		// TODO Auto-generated method stub
		orderMapper.save(orderDTO);
		
	}

}
