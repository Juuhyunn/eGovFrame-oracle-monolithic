package shop.jarviis.oracle.order.cotroller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import shop.jarviis.oracle.order.domain.OrderDTO;
import shop.jarviis.oracle.order.service.OrderService;

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

}
