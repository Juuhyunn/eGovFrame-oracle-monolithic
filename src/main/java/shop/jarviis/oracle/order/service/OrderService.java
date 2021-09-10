package shop.jarviis.oracle.order.service;

import java.util.List;

import org.springframework.stereotype.Component;

import shop.jarviis.oracle.order.domain.OrderDTO;

@Component
public interface OrderService {
	public List<OrderDTO> findAll();
	public OrderDTO findById(int orderId);
	public List<OrderDTO> findByCustId(int custId);
	public List<OrderDTO> findByBookId(int bookId);
	public List<OrderDTO> findByOrderPrice(int orderPrice);
	public List<OrderDTO> findByOrderDate(String orderDate);
}
