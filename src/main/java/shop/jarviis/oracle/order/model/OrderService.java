package shop.jarviis.oracle.order.model;


import java.util.List;

import org.springframework.stereotype.Component;

import shop.jarviis.oracle.common.GenericInterface;

@Component
public interface OrderService extends GenericInterface<OrderDTO, Integer>{

	List<OrderDTO> findByCustId(int custId);
	List<OrderDTO> findByOrderPrice(int orderPrice);
	List<OrderDTO> findByBookId(int bookId);
	List<OrderDTO> findByOrderDate(String orderDate);

}
