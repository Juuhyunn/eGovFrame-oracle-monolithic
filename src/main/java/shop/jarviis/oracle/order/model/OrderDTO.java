package shop.jarviis.oracle.order.model;

import org.springframework.stereotype.Component;

@Component
public class OrderDTO {
	private int orderId;
	private int custId;
	private int bookId;
	private int orderPrice;
	private String orderDate;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public int getOrderPrice() {
		return orderPrice;
	}
	public void setOrderPrice(int orderPrice) {
		this.orderPrice = orderPrice;
	}
	
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return String.format("주문Id: %d, 고객Id: %d, 책Id: %d, 주문 가격 : %d, 주문 날짜 : %s", orderId, custId, bookId, orderPrice, orderDate);
	}

}
