package shop.jarviis.oracle.mappers;


import org.springframework.stereotype.Repository;

import shop.jarviis.oracle.common.GenericInterface;
import shop.jarviis.oracle.order.domain.OrderDTO;

@Repository
public interface OrderMapper extends GenericInterface<OrderDTO, Integer>{

}
