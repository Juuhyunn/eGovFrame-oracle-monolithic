package shop.jarviis.oracle.order.service;


import org.springframework.stereotype.Component;

import shop.jarviis.oracle.common.GenericInterface;
import shop.jarviis.oracle.order.domain.OrderDTO;

@Component
public interface OrderService extends GenericInterface<OrderDTO, Integer>{

}
