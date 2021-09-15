package shop.jarviis.oracle.mappers;


import java.util.List;

import org.springframework.stereotype.Repository;

import shop.jarviis.oracle.common.GenericInterface;
import shop.jarviis.oracle.order.domain.OrderDTO;

@Repository
public interface OrderMapper extends GenericInterface<OrderDTO, Integer>{
	List<OrderDTO> findByCustId(int custId);
	List<OrderDTO> findByOrderPrice(int orderPrice);
	List<OrderDTO> findByBookId(int bookId);
	List<OrderDTO> findByOrderDate(String orderDate);


}
