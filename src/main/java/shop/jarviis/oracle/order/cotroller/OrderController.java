package shop.jarviis.oracle.order.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import shop.jarviis.oracle.order.domain.OrderDTO;
import shop.jarviis.oracle.order.service.OrderService;

@Controller
public class OrderController {
	@Autowired OrderService orderService;
	@GetMapping("/orders")
	public void findAll() {
		List<OrderDTO> list = orderService.findAll();
		for (OrderDTO o : list) {
			System.out.println(o.toString());
		}
	}
	@GetMapping("/orders/orderId/{orderId}")
	public void findById(@PathVariable int orderId) {
		OrderDTO orderDTO = orderService.findById(orderId);
		System.out.println(orderDTO.toString());
	}
	@GetMapping("/orders/custId/{custId}")
	public void findByCustId(@PathVariable int custId) {
		List<OrderDTO> list = orderService.findByCustId(custId);
		for (OrderDTO o : list) {
			System.out.println(o.toString());
		}
	}
	@GetMapping("/orders/bookId/{bookId}")
	public void findByBookId(@PathVariable int bookId) {
		List<OrderDTO> list = orderService.findByBookId(bookId);
		for (OrderDTO o : list) {
			System.out.println(o.toString());
		}
	}
	@GetMapping("/orders/orderPrice/{orderPrice}")
	public void findByOrderPrice (@PathVariable int orderPrice) {
		List<OrderDTO> list = orderService.findByOrderPrice(orderPrice);
		for(OrderDTO o : list) {
			System.out.println(o.toString());
		}
	}
	@GetMapping("/orders/orderDate/{orderDate}")
	public void findByOrderDate(@PathVariable String orderDate) {
		List<OrderDTO> list = orderService.findByOrderDate(orderDate);
		for(OrderDTO o : list) {
			System.out.println(o.toString());
		}
	}

}
