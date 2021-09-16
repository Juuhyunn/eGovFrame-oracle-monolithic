package shop.jarviis.oracle.order.web;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.jarviis.oracle.order.model.OrderDTO;
import shop.jarviis.oracle.order.model.OrderService;

@Controller
@RequestMapping("/orders")
public class OrderController {
	@Autowired
	OrderService orderService;
	@Autowired
	OrderDTO orderDTO;

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public void save(OrderDTO t) {
		orderService.save(t);
		System.out.println("*****Save Complete : " + t.toString());
	}

	@RequestMapping(value = "/detail")
	public void findById(@RequestParam Integer orderId) {
		System.out.println("*****Detail : " + orderService.findById(orderId).toString());

	}

	@RequestMapping(value = "/list", method = RequestMethod.POST)
	public void findAll() {
		System.out.println("*****List*****");
		for (OrderDTO o : orderService.findAll()) {
			System.out.println(o.toString());
		}

	}

	@RequestMapping(value = "/update", method = RequestMethod.POST)
	public void update(OrderDTO t) {
		orderService.update(t);
		System.out.println("*****Update Complete : " + t.toString());

	}

	@RequestMapping(value = "/delete")
	public void delete(@RequestParam Integer orderId) {
		orderService.delete(orderId);
		System.out.println("*****Delete Complete : " + orderId);

	}
	@RequestMapping("/detail/orderId")
	public void findById(@RequestParam int orderId) {		
		System.out.println(orderService.findById(orderId).toString());
	}
	@RequestMapping("/detail/custId")
	public void findByCustId(@RequestParam int custId) {
		this.forPrint(orderService.findByCustId(custId));
	}
	@RequestMapping("/detail/bookId")
	public void findByBookId(@RequestParam int bookId) {	
		this.forPrint(orderService.findByBookId(bookId));
	}
	@RequestMapping("/detail/orderPrice")
	public void findByOrderPrice(@RequestParam int orderPrice) {
		this.forPrint(orderService.findByOrderPrice(orderPrice));
	}
	@RequestMapping("/detail/orderDate")
	public void findByOrderDate(@RequestParam String orderDate) {
		this.forPrint(orderService.findByOrderDate(orderDate));
	}
	public void forPrint(List<OrderDTO> list) {
		System.out.println("*****Select Complete : ");
		for(OrderDTO o : list) {
			System.out.println(o.toString());
		}
	}

}
