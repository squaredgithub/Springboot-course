package com.springcourse.course;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class CourseApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(CourseApplication.class, args);
        var orderService = context.getBean(OrderService.class);
//       // var orderService = new OrderService();
//       // orderService.setPaymentService(new PayPalPaymentService());
        orderService.placeOrder();

    }

}
