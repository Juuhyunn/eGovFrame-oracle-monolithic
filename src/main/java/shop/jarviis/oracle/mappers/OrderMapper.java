package shop.jarviis.oracle.mappers;

import java.util.List;

import org.springframework.stereotype.Repository;

import shop.jarviis.oracle.order.domain.OrderDTO;

@Repository
public interface OrderMapper {
	public List<OrderDTO> findAll();
	public OrderDTO findById(int orderId);
	public List<OrderDTO> findByCustId(int custId);
	public List<OrderDTO> findByBookId(int bookId);
	public List<OrderDTO> findByOrderPrice(int orderPrice);
	public List<OrderDTO> findByOrderDate(String orderDate);
	public void save(OrderDTO orderDTO);
	

}
