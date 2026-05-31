package com.lp1.project.domain.order;

import com.lp1.project.domain.address.Address;
import com.lp1.project.domain.cart.Cart;
import com.lp1.project.domain.payment.CreditCardPayment;
import com.lp1.project.domain.payment.PaymentMethod;
import com.lp1.project.domain.shipping.Shipping;
import com.lp1.project.domain.user.Customer;

import java.util.List;

public class OrderService {

    public Order finishOrder(Customer customer, Cart cart, PaymentMethod paymentMethod,
                             Address address, Shipping shipping, Integer installments){

        // fazer exception se carrinho ta vazio


        Order order = new Order(customer, paymentMethod, address,
                convertItems(cart), cart.getTotalValue(),
                OrderSituation.ORDER_RECEIVED, shipping);

        return order;
    }

    public boolean payOrder(Order order){
        boolean success = order.getPaymentMethod()
                .processPayment(order.getTotalValue());
        if (success){
            order.setSituation(OrderSituation.PAID);
        }
        return success;
    }

    private List<OrderItem> convertItems(Cart cart) {
        return cart.getItems().stream()
                .map(cartItem ->
                        new OrderItem(
                            cartItem.getProduct(),
                            cartItem.getQuantity()))
                .toList();
    }
}
