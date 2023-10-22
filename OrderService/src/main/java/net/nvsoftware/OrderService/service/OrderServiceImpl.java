package net.nvsoftware.OrderService.service;

import lombok.extern.log4j.Log4j2;
import net.nvsoftware.OrderService.model.OrderRequest;
import net.nvsoftware.OrderService.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderRepository orderRepository;


    @Override
    public long placeOrder(OrderRequest orderRequest) {
        log.info("Start: OrderService placeOrder");
        // use OrderService create OrderEntity with orderStatus CREATED, ORM Jpa save to DB

        // call ProductService to check product quantity, if OK, reduce it, else throw not enough exception

        // call PaymentService to charge, if Success, mark order PAID, else CANCELED
        log.info("End: OrderService placeOrder");
        return 0;
    }
}
