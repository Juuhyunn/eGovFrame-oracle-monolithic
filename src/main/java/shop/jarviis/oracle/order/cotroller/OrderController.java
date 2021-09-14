package shop.jarviis.oracle.order.cotroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import shop.jarviis.oracle.order.domain.OrderDTO;
import shop.jarviis.oracle.order.service.OrderService;

@Controller
@RequestMapping("/orders")
public class OrderController {
	@Autowired OrderService orderService;
	@Autowired OrderDTO orderDTO;
	@GetMapping("/")
	public void findAll() {
		List<OrderDTO> list = orderService.findAll();
		for (OrderDTO o : list) {
			System.out.println(o.toString());
		}
	}
	@GetMapping("/orderId/{orderId}")
	public void findById(@PathVariable int orderId) {
		OrderDTO orderDTO = orderService.findById(orderId);
		System.out.println(orderDTO.toString());
	}
	@GetMapping("/custId/{custId}")
	public void findByCustId(@PathVariable int custId) {
		List<OrderDTO> list = orderService.findByCustId(custId);
		for (OrderDTO o : list) {
			System.out.println(o.toString());
		}
	}
	@GetMapping("/bookId/{bookId}")
	public void findByBookId(@PathVariable int bookId) {
		List<OrderDTO> list = orderService.findByBookId(bookId);
		for (OrderDTO o : list) {
			System.out.println(o.toString());
		}
	}
	@GetMapping("/orderPrice/{orderPrice}")
	public void findByOrderPrice (@PathVariable int orderPrice) {
		List<OrderDTO> list = orderService.findByOrderPrice(orderPrice);
		for(OrderDTO o : list) {
			System.out.println(o.toString());
		}
	}
	@GetMapping("/orderDate/{orderDate}")
	public void findByOrderDate(@PathVariable String orderDate) {
		List<OrderDTO> list = orderService.findByOrderDate(orderDate);
		for(OrderDTO o : list) {
			System.out.println(o.toString());
		}
	}
	@RequestMapping("/addOrder")
	public String addOrder(
			@RequestParam("orderId") int orderId,
			@RequestParam("custId") int custId,
			@RequestParam("bookId") int bookId,
			@RequestParam("orderPrice") int orderPrice,
			@RequestParam("orderDate") String orderDate) {
		System.out.println("orderId : " + orderId);
		System.out.println("custId : " + custId);
		System.out.println("bookId : " + bookId);
		System.out.println("orderPrice : " + orderPrice);
		System.out.println("orderDate : " + orderDate);
		orderDTO.setOrderId(orderId);
		orderDTO.setCustId(custId);
		orderDTO.setBookId(bookId);
		orderDTO.setOrderPrice(orderPrice);
		orderDTO.setOrderDate(orderDate);
		orderService.save(orderDTO);
		return "/order/AddOrder";
	}
	

}
