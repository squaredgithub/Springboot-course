package com.springcourse.course;

public class OrderService {
    private PaymentService paymentService;

    public OrderService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }
    public void placeOrder() {
//        var paymentService = new StripePaymentService();
        paymentService.processPayment(10);

    }
}
